# 💰 Finance Tracker – Microservices Architecture

A **Finance Tracking Application** built with **Spring Boot Microservices** to help users manage income, expenses, budgets, and financial insights efficiently.

---

## 🚀 Overview

Finance Tracker is a modular and scalable financial management system that allows users to:

* Track daily **income** and **expenses**
* Set and monitor **budgets**
* Categorize transactions
* Generate **reports and analytics**
* Receive **notifications** for spending alerts

Built using a **microservices architecture** for high scalability, maintainability, and flexibility.

---

## 🧩 Microservices

| Service                               | Description                                                                  |
| ------------------------------------- | ---------------------------------------------------------------------------- |
| **Config Server**                     | Centralized configuration for all microservices                              |
| **Discovery Server (Eureka)**         | Service registry for discovering and managing microservices                  |
| **API Gateway**                       | Single entry point for all API requests; handles routing and JWT validation  |
| **User Service**                      | Handles user registration, login, profile management, and JWT authentication |
| **Transaction Service**               | Manages income, expenses, and transfers                                      |
| **Budget Service**                    | Creates and tracks user budgets and spending limits                          |
| **Category Service**                  | Manages expense/income categories                                            |
| **Report Service**                    | Generates financial summaries and monthly reports                            |
| **Notification Service** *(optional)* | Sends alerts or email notifications for spending updates                     |

---

## ⚙️ Tech Stack

* **Backend:** Spring Boot (Java 17+)
* **Database:** MySQL / PostgreSQL
* **API Gateway:** Spring Cloud Gateway
* **Service Discovery:** Netflix Eureka
* **Configuration Management:** Spring Cloud Config
* **Security:** JWT Authentication
* **Messaging (optional):** Kafka / RabbitMQ
* **Monitoring:** Spring Boot Actuator, Prometheus, Grafana

---

## 🗂 Project Structure

```
finance-tracker-microservices/
│
├── api-gateway/
├── config-server/
├── discovery-server/
├── user-service/
├── transaction-service/
├── budget-service/
├── category-service/
├── report-service/
└── notification-service/
```

---

## 🧠 Key Features

✅ JWT-based Authentication
✅ Distributed Configuration Management
✅ Service Discovery with Eureka
✅ Centralized API Gateway
✅ Modular Microservice Design
✅ Scalable & Maintainable Architecture
✅ Budget Alerts and Analytics

---

## 🏗️ Setup Instructions

### 1️⃣ Clone the repository

```bash
git clone https://github.com/<your-username>/finance-tracker-microservices.git
cd finance-tracker-microservices
```

### 2️⃣ Run Config and Discovery Servers

```bash
cd config-server
mvn spring-boot:run
```

```bash
cd discovery-server
mvn spring-boot:run
```

### 3️⃣ Start Each Microservice

Example:

```bash
cd user-service
mvn spring-boot:run
```

Repeat for all other services.

### 4️⃣ Access Services

| Service       | URL                      |
| ------------- | ------------------------ |
| API Gateway   | `http://localhost:8080/` |
| Eureka Server | `http://localhost:8761/` |
| Config Server | `http://localhost:8888/` |

---

## 🔒 Authentication Flow

1. User registers via **User Service**
2. Receives a JWT token upon successful login
3. All requests pass through **API Gateway** where JWT is validated
4. Gateway routes requests to the appropriate service

---

## 📊 Example APIs

### Create Transaction

```http
POST /api/transactions/add
Authorization: Bearer <jwt-token>

{
  "userId": 1,
  "amount": 500,
  "category": "Food",
  "type": "Expense",
  "description": "Lunch at restaurant"
}
```

### Get User Budget

```http
GET /api/budget/user/1
Authorization: Bearer <jwt-token>
```

---

## 🧱 Future Enhancements

* 🔹 AI-based expense prediction and saving recommendations
* 🔹 Bank API integration
* 🔹 Investment tracking
* 🔹 Advanced data visualization dashboard

---

## 👨‍💻 Author

**Tushar Kokane**
📧 [tusharkokane366@gmail.com]

---

## 📝 License

This project is licensed under the **MIT License** — you are free to use and modify it.

---

**⭐ Don’t forget to star the repo if you like this project!**
