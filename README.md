New class added and main.java updated

EmployeeDataHandler.java
This class is responsible for managing employee data, including handling login credentials and CRUD operations (Create, Read, Update, Delete) that directly update the CSV file storing employee information.

Login Credentials

The checkCredentials(String username, String password) method verifies user login credentials against stored data. It checks if the provided username and password match any entry in the system. If successful, the user gains access to the system features.

CRUD Operations

Update Employee Information
Update: The updateEmployee(Employee employee) method modifies existing employee details based on the provided Employee object. It locates the employee by ID, updates their information, and then saves the changes to the CSV file.
Delete Employee
Delete: The deleteEmployee(int employeeId) method removes an employee from the system based on their unique ID. It finds the employee by ID, deletes their record, and then updates the CSV file to reflect the change.
Add New Employee
Add: The addEmployee(Employee employee) method inserts a new employee into the system. It takes an Employee object as input, assigns a unique ID (if necessary), adds the employee to the data collection, and then updates the CSV file with the new employee's information.
CSV File Management

The changes made through these methods are immediately reflected in the employees.csv file, ensuring that the system's data is always synchronized with the file storage.

Example Usage
java
Copy code
// Example usage of EmployeeDataHandler

// Create an instance of EmployeeDataHandler
EmployeeDataHandler dataHandler = new EmployeeDataHandler();

// Check login credentials
if (dataHandler.checkCredentials(username, password)) {
    // Proceed with operations (update, delete, add)
    
    // Example update operation
    Employee employeeToUpdate = new Employee(...); // Create or retrieve the employee to update
    dataHandler.updateEmployee(employeeToUpdate);
    
    // Example delete operation
    int employeeIdToDelete = ...; // Provide the ID of the employee to delete
    dataHandler.deleteEmployee(employeeIdToDelete);
    
    // Example add operation
    Employee newEmployee = new Employee(...); // Create a new employee object
    dataHandler.addEmployee(newEmployee);
} else {
    // Handle invalid login credentials
}
This class facilitates secure access to employee data and ensures that updates to employee records are persisted in the employees.csv file for reliable data management.
