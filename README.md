# Identify Service

## Project Overview

The Identify Service is a Java-based application built using Spring Boot. It provides functionality for managing user data, including creating, updating, and retrieving user information.

---

## Prerequisites

Before setting up and running the project, ensure you have the following installed:

1. **Java Development Kit (JDK)**: Version 17 or higher.
2. **Maven**: Version 3.8 or higher.
3. **Database**: Ensure you have a PostgreSQL database running.

---

## Setup Instructions

1. **Clone the Repository**:

   ```bash
   git clone <repository-url>
   cd identify-service
   ```

2. **Configure the Database**:

   - Open the `application.yaml` file located in `src/main/resources/`.
   - Update the database connection properties:
     ```yaml
     spring:
       datasource:
         url: jdbc:postgresql://<your-database-host>:<port>/<database-name>
         username: <your-username>
         password: <your-password>
     ```

3. **Build the Project**:

   ```bash
   ./mvnw clean install
   ```

4. **Run the Application**:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## Running Tests

To execute the test suite, run:

```bash
./mvnw test
```

---

## Accessing the Application

Once the application is running, you can access it at:

- **API Base URL**: `http://localhost:8080`

---

## Folder Structure

- `src/main/java`: Contains the main application code.
- `src/main/resources`: Contains configuration files and static resources.
- `src/test/java`: Contains test cases.

---

## Troubleshooting

If you encounter any issues:

1. Ensure the database is running and accessible.
2. Check the logs for detailed error messages.
3. Verify that the `application.yaml` file is correctly configured.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.
