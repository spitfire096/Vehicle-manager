package vehiclemanager;

/**
 * Main GUI class for Vehicle Manager using Swing
 * @author Oladimeji
 * @version 1.0
 * @description Swing-based GUI to add vehicles (Car, Truck, Motorcycle) 
 *              and display them sorted A-Z or Z-A using polymorphism
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;                    // Only what we need

public class VehicleGUI extends JFrame {

    // GUI Components
    private JTextField makeField, modelField, extraField;
    private JComboBox<String> typeDropdown;
    private JTextArea outputArea;
    private ArrayList<Vehicle> vehicleList;

    /**
     * Constructor - builds and sets up the entire GUI window
     */
    public VehicleGUI() {
        vehicleList = new ArrayList<>();

        setTitle("Vehicle Manager");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ==================== INPUT PANEL ====================
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 10, 10));

        typeDropdown = new JComboBox<>(new String[]{"Car", "Truck", "Motorcycle"});
        makeField = new JTextField(20);
        modelField = new JTextField(20);
        extraField = new JTextField(20);

        inputPanel.add(new JLabel("Vehicle Type:"));
        inputPanel.add(typeDropdown);
        inputPanel.add(new JLabel("Make:"));
        inputPanel.add(makeField);
        inputPanel.add(new JLabel("Model:"));
        inputPanel.add(modelField);
        inputPanel.add(new JLabel("Extra Info:"));
        inputPanel.add(extraField);

        add(inputPanel, BorderLayout.NORTH);

        // ==================== BUTTON PANEL ====================
        JPanel buttonPanel = new JPanel();

        JButton addButton = new JButton("Add Vehicle");
        JButton azButton = new JButton("Display A-Z");
        JButton zaButton = new JButton("Display Z-A");

        buttonPanel.add(addButton);
        buttonPanel.add(azButton);
        buttonPanel.add(zaButton);

        add(buttonPanel, BorderLayout.CENTER);

        // ==================== OUTPUT AREA ====================
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.SOUTH);

        // ==================== ADD BUTTON FUNCTIONALITY ====================
        addButton.addActionListener(e -> {
            String type = (String) typeDropdown.getSelectedItem();
            String make = makeField.getText().trim();
            String model = modelField.getText().trim();
            String extra = extraField.getText().trim();

            if (make.isEmpty() || model.isEmpty() || extra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Vehicle v = null;

            try {
                switch (type) {
                    case "Car":
                        v = new Car(make, model, Integer.parseInt(extra));
                        break;
                    case "Truck":
                        v = new Truck(make, model, Double.parseDouble(extra));
                        break;
                    case "Motorcycle":
                        v = new Motorcycle(make, model, extra);
                        break;
                }

                vehicleList.add(v);
                outputArea.append("Added: " + v.getDetails() + "\n");

                // Clear input fields
                makeField.setText("");
                modelField.setText("");
                extraField.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Invalid number in Extra field!\n" +
                    "Car → integer (doors)\n" +
                    "Truck → decimal (tons)", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // A-Z Sort Button
        azButton.addActionListener(e -> {
            vehicleList.sort((v1, v2) ->
                (v1.getMake() + " " + v1.getModel())
                .compareToIgnoreCase(v2.getMake() + " " + v2.getModel())
            );
            displayVehicles();
        });

        // Z-A Sort Button
        zaButton.addActionListener(e -> {
            vehicleList.sort((v1, v2) ->
                (v2.getMake() + " " + v2.getModel())
                .compareToIgnoreCase(v1.getMake() + " " + v1.getModel())
            );
            displayVehicles();
        });
    }

    /**
     * Helper method to refresh the output area with current vehicle list
     */
    private void displayVehicles() {
        outputArea.setText("");

        if (vehicleList.isEmpty()) {
            outputArea.append("No vehicles added yet.\n");
            return;
        }

        for (Vehicle v : vehicleList) {
            outputArea.append(v.getDetails() + "\n");
        }
    }

    /**
     * Main method - launches the GUI
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VehicleGUI().setVisible(true);
        });
    }
}
