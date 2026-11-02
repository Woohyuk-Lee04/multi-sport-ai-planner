# Multi-Sport AI Planner

A web application for tracking workouts across multiple sports, built with Java and Spring Boot.

## Tech Stack

- **Language:** Java 21
- **Framework:** Spring Boot 3.5.9
- **View Template Engine:** Thymeleaf
- **Build Tool:** Maven

## Architecture

The application currently follows the Spring MVC (Model-View-Controller) pattern.

- **Controller:** Handles incoming HTTP requests and selects the appropriate view.
- **Model:** Transfers data from the controller to the view.
- **View:** Uses Thymeleaf to render HTML pages.

## Getting Started

### Prerequisites

- Java 21

### Run Locally

```bash
./mvnw spring-boot:run
```

Open `http://localhost:8080` in your browser.

## Development Status

Early development — basic Spring MVC homepage implemented.
