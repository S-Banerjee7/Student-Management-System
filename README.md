# Console-Based Student Management System
## Project Demo

https://github.com/user-attachments/assets/e3ca46eb-13e1-4e26-9f40-2509618b7fb8



A robust, enterprise-structured backend CLI application built using Java and MySQL to handle basic CRUD operations for student registration details.

## Technical Highlights
- **Object-Oriented Design:** Implements clean encapsulation models using POJO architecture.
- **Database Connectivity (JDBC):** Uses Java Database Connectivity with `PreparedStatement` properties to completely prevent SQL Injection vulnerabilities.
- **Custom Exception Handling:** Features application-specific exception routing (`StudentNotFoundException`) for production-grade error management.
- **Robust Schema Management:** Utilizes relational structuring via MySQL Workbench.

## How to Run
1. Clone this repository.
2. Run the `school_db` SQL setup script provided in the `/database` directory.
3. Import the `mysql-connector-java` dependency JAR file into your build path.
4. Execute `MainApplication.java`.
