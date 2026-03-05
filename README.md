# Ocean View Resort Backend


A **Spring Boot application** for managing reservations at the **Ocean View Resort**.
This system provides RESTful APIs to manage users, reservations, and billing for resort room bookings.

---

## Features

* User authentication (login / register)
* Reservation management
* Room availability checking
* Bill calculation based on room type and stay duration
* REST API for reservation operations

---

## Technologies Used

* Java 17
* Spring Boot 4.0.1
* MySQL Database
* JPA / Hibernate
* Maven
* REST API Architecture

---

## Getting Started

1. Clone the repository

2. Configure the **MySQL database connection** in `application.properties`

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/oceanview
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Run the application

./mvnw spring-boot:run

4. Access the system at:

http://localhost:8081

---

## API Endpoints

Authentication

* POST /auth/login
* POST /auth/register

Reservations

* GET /reservations
* POST /reservations
* PUT /reservations/{id}
* DELETE /reservations/{id}

---

## Database

The application uses a **MySQL relational database** to store system data such as users, reservations, and billing information.

Database name example:

oceanview

Tables are automatically generated using **Hibernate (JPA)** when the application starts.

---

## Project Structure

src
├── controller
├── service
├── repository
├── model
└── config

* **Controller** – Handles API requests
* **Service** – Contains business logic
* **Repository** – Handles database operations
* **Model** – Defines entity classes
* **Config** – Configuration files

---

## Author

Ocean View Resort Backend System
Developed as part of a **distributed systems academic project**.
