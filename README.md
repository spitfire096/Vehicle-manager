\# Vehicle Manager - Java Swing Application



!\[Java](https://img.shields.io/badge/Java-17%2B-orange) 

!\[Eclipse](https://img.shields.io/badge/IDE-Eclipse-blue)

!\[Swing](https://img.shields.io/badge/GUI-Swing-green)



\## 📋 Project Description



This is a Java Swing-based desktop application. 



The application demonstrates key Object-Oriented Programming concepts:

\- \*\*Abstract Classes\*\*

\- \*\*Inheritance\*\*

\- \*\*Polymorphism\*\*

\- \*\*ArrayList\*\* for dynamic storage

\- \*\*Comparator\*\* for sorting

\- \*\*Swing GUI\*\* with event handling



Users can:

\- Add three different types of vehicles (\*\*Car\*\*, \*\*Truck\*\*, \*\*Motorcycle\*\*) with unique attributes

\- View added vehicles

\- Sort the list alphabetically (A-Z) or reverse (Z-A)



\## 🛠 Technologies Used



\- \*\*Java\*\* (JDK 8 or higher)

\- \*\*Swing\*\* (for GUI components)

\- \*\*Eclipse IDE\*\*

\- \*\*ArrayList\*\* and Lambda expressions for sorting



\## 📁 Project Structure



VehicleManager/

├── src/

│   ├── Vehicle.java              (Abstract base class)

│   ├── Car.java

│   ├── Truck.java

│   ├── Motorcycle.java

│   └── VehicleGUI.java           (Main GUI class)

├── screenshots/

│   └── vehicle-manager-screenshot.png

├── .project

├── .classpath

└── README.md





\## 🚀 How to Run



1\. Open \*\*Eclipse IDE\*\*.

2\. Import the project:

&#x20;  - File → Import → General → Existing Projects into Workspace

&#x20;  - Select the `VehicleManager` folder

3\. Right-click on `VehicleGUI.java` → \*\*Run As\*\* → \*\*Java Application\*\*



\### Features

\- Dropdown to select vehicle type

\- Input fields for Make, Model, and type-specific extra info

&#x20; - Car: Number of doors (integer)

&#x20; - Truck: Load capacity (decimal, in tons)

&#x20; - Motorcycle: Engine type (string)

\- "Add Vehicle" button with input validation

\- "Display A-Z" and "Display Z-A" sorting buttons

\- Scrollable output area showing vehicle details using `getDetails()`



\## 📸 Screenshots


\![Vehicle Manager Application - Demo](screenshots/vehicle-manager-demo.png)

*Screenshot showing the completed application with one Car (Toyota Camry, 4 doors), one Truck (Ford F150, 1.5 tons), and one Motorcycle (Honda CBR, Inline-4) added and sorted alphabetically (A-Z).*



\## 👤 Author



\- \*\*Name\*\*: Oladimeji  



&#x20;

