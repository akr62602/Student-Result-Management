# Student Result Management System

This is a web application developed using Java Servlets and MySQL for managing student results. It provides various modules such as admin login, student login, new student registration, and student result search.

## Usage

To use this application, you need to have the following software installed on your system:

- Java Development Kit (JDK)
- Apache Tomcat Server
- MySQL Database

Once you have the required software installed, follow these steps:

1. Clone this repository to your local machine.
2. Import the project into your preferred Java IDE (e.g., Eclipse, IntelliJ).
3. Create a new MySQL database and import the `database.sql` file provided in the `database` folder.
4. Update the database connection details in the `DBConnection.java` file located in the `src` folder.
5. Build the project and deploy it on the Apache Tomcat server.
6. Access the application using the provided URL (e.g., `http://localhost:8080/student-result-management`).

## Modules

### Admin Login

The admin login module allows authorized users to log in and access administrative functionalities such as managing student records, updating results, and generating reports.

### Student Login

The student login module allows registered students to log in and view their results.

### New Student Registration

The new student registration module allows new students to create an account by providing their personal information and academic details.

### Student Result Search

The student result search module allows users to search for student results based on various criteria such as name, roll number, or course.

## Limitations

- This application does not support multiple roles for users. Only admin and student roles are available.
- The application does not include features such as result analysis, graphical representation of results, or automated result calculation.
- The application does not provide options for updating or deleting student records.

## Contributing

Contributions to this project are welcome. If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request.
