
---

````markdown
# Student Management System in Java

## Overview
This is a simple Java console application for managing student records, connected to a MySQL database. Users can add students and view all students stored in the database.

---

## Features
- Add new student records (ID, Name, Course, Age)
- View all students
- Exit the application
- Uses MySQL as the database backend

---

## Prerequisites
- Java 17 or higher
- MySQL server
- MySQL Connector/J 9.4.0

---

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/Vishnu-Varthan1/StudentManagementSystem.git
cd StudentManagementSystem
````

### 2. Set up the MySQL database

Run these SQL commands in MySQL Workbench or MySQL CLI:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(100),
    age INT
);
```

### 3. Configure database connection

Update the `DBConnection.java` file with your MySQL username and password:

```java
private static final String USER = "root";      // your MySQL username
private static final String PASSWORD = "root";  // your MySQL password
```

---

### 4. Compile and run the application

Make sure the MySQL Connector/J JAR is in the `lib` folder.

```bash
javac -cp ".;lib/mysql-connector-j-9.4.0.jar" src/*.java
java -cp ".;lib/mysql-connector-j-9.4.0.jar" Main
```

> Note: On Linux or Mac, replace `;` with `:` in the classpath.

---

## Usage

1. Run the application.
2. Enter your choice:

   * `1` → Add a new student
   * `2` → View all students
   * `3` → Exit the program
3. Follow the prompts to input student information.

---

## Folder Structure

```
StudentManagementSystem/
│
├─ src/                # Java source files (Main.java, DBConnection.java, StudentDAO.java, Student.java)
├─ lib/                # MySQL Connector/J JAR
├─ .gitignore          # Git ignore file
└─ README.md           # This README file
```

---

## License

This project is licensed under the MIT License.

```

---

If you want, I can also **create a professional `.gitignore` file** tailored for your project so your compiled files and connector JAR don’t get pushed to GitHub.  

Do you want me to do that next?
```
