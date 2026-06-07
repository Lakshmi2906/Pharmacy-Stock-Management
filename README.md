# Pharmacy Stock Management System

## Overview

A Java-based console application developed using JDBC and MySQL to manage pharmacy inventory. The system allows users to add medicines, update stock quantities, search medicines, delete medicines, and view available inventory records.

## Features

* Add Medicine
* View All Medicines
* Update Medicine Stock
* Search Medicine by ID
* Delete Medicine
* MySQL Database Integration
* Secure SQL Operations using PreparedStatement
* Menu-Driven Console Interface

## Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE

## Project Structure

```text
Medicine.java
Inventory.java
DBConnection.java
pharmacyStock.java
```

## Database Table

Table: medicine

| Column   | Type    |
| -------- | ------- |
| id       | INT     |
| name     | VARCHAR |
| quantity | INT     |
| price    | DOUBLE  |
| expiry   | VARCHAR |

## Concepts Demonstrated

* Object-Oriented Programming (OOP)
* JDBC Connectivity
* PreparedStatement
* ResultSet Handling
* CRUD Operations
* Database Management

## CRUD Operations

| Operation | Status      |
| --------- | ----------- |
| Create    | Implemented |
| Read      | Implemented |
| Update    | Implemented |
| Delete    | Implemented |

## Sample Menu

```text
1. Add Medicine
2. Update Stock
3. Medicine List
4. Delete Medicine
5. Search Medicine
0. Exit
```

## Future Enhancements

* Expiry Date Alerts
* Low Stock Notifications
* Hibernate Integration
* Spring Boot REST API
* Web-Based User Interface
* Report Generation

## Author

Lakshmi S
Computer Science and Engineering Student
