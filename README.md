# ITSS-INTERN-REST-API-PROJECT
# 🌐 Spring Boot REST API – User Management System

This project is a simple and clean **User Management REST API** built using **Spring Boot**. It allows clients to perform basic **CRUD operations** (Create, Read, Update, Delete) on user data through HTTP endpoints. It uses **Spring Data JPA** to interact with the database and follows industry best practices for RESTful API design.

---

## 📌 Table of Contents

- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Getting Started](#-getting-started)
- [API Endpoints](#-api-endpoints)
- [Project Structure](#-project-structure)
- [Swagger API Documentation](#-swagger-api-documentation)
- [Running the Project](#-running-the-project)
- [Contributing](#-contributing)
- [License](#-license)

---

## 🚀 Features

- Retrieve all users
- Get user by ID
- Create a new user
- Update an existing user
- Delete a user by ID
- Exception handling for non-existent resources
- Swagger-based API documentation

---

## 🛠️ Technology Stack

| Layer | Technology |
|-------|------------|
| Language | Java 11+ |
| Framework | Spring Boot |
| ORM | Spring Data JPA |
| Database | H2 (in-memory) or MySQL (configurable) |
| Build Tool | Maven |
| Documentation | Swagger/OpenAPI |

---

## ⚙️ Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 11 or higher
- Maven
- Git
- IDE (Eclipse / IntelliJ / VS Code)

### Clone the Repository

```bash
git clone https://github.com/SAIDEEPIKA-SURESH/ITSS-INTERN-REST-API-PROJECT.git
cd ITSS-INTERN-REST-API-PROJECT

**📄 API Endpoints**

Method	Endpoint	         Description
GET	    /api/users	       Get all users
GET	    /api/users/{id}	   Get user by ID
POST	  /api/users	       Create a new user
PUT	    /api/users/{id}	   Update user by ID
DELETE	/api/users/{id}	   Delete user by ID

**Project Structure**

spring_boot_project
├── src
│   └── main
│       ├── java
│       │   └── com.itssintern.spring_boot_project
│       │       ├── controllers
│       │       │   └── UserController.java
│       │       ├── entity
│       │       │   └── UserEntity.java
│       │       ├── repository
│       │       │   └── UserRepository.java
│       │       ├── exceptions
│       │       │   └── ResourceNotFoundException.java
│       │       └── SpringBootProjectApplication.java
│       └── resources
│           ├── application.properties
│           └── static / templates (optional)
├── pom.xml
└── README.md

** To run the project :**

**Method 1: Using Maven**
mvn spring-boot:run
**Method 2: From Eclipse/VS Code**
1.Right-click SpringBootProjectApplication.java
2.Choose Run As → Java Application
3.The app will run on: http://localhost:8080

**Swagger API Documentation**

# After running the application, open your browser and navigate to: http://localhost:8080/swagger-ui.html
This will open an interactive Swagger UI where you can test all the API endpoints directly.
You can also download the API specification:

JSON: http://localhost:8080/v3/api-docs
YAML: http://localhost:8080/v3/api-docs.yaml

**FOR CONTRIBUTION :**
Contributions are welcome! If you'd like to improve or extend the project, follow these steps:
# Create a new branch
git checkout -b feature/your-feature-name

# Stage and commit changes
git add .
git commit -m "Add your changes"

# Push to your forked repository
git push origin feature/your-feature-name
Then open a Pull Request on GitHub.

SAI DEEPIKA S
ITSS INTERN
ITSS INDIA PRIVATE LIMITED , CHENNAI
