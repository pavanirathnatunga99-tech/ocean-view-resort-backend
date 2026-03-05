# Ocean View Resort Backend

A Spring Boot application for managing reservations at the Ocean View Resort.

## Features

- User authentication (login/register)
- Reservation management
- Bill calculation based on room type and stay duration

## Technologies Used

- Java 17
- Spring Boot 4.0.1
- MySQL (with H2 for demo)
- JPA/Hibernate
- Maven

## Getting Started

1. Clone the repository
2. Run `./mvnw spring-boot:run`
3. Access at http://localhost:8081

## API Endpoints

- POST /auth/login
- POST /auth/register
- GET /reservations
- POST /reservations
- PUT /reservations/{id}
- DELETE /reservations/{id}

## Database

Uses H2 in-memory database for demo purposes.
H2 Console: http://localhost:8081/h2-console
- JDBC URL: jdbc:h2:mem:oceanview
- Username: sa
- Password: password