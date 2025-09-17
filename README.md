# Library Management System

The **Library Management System (LMS)** is a Java-based web application developed to streamline and automate library operations. It provides essential functionalities such as maintaining book records, managing users, and tracking issued/returned books. The project has been designed using **JSP, Servlets, DAO pattern, and MySQL database**, ensuring both efficiency and scalability.

---

## 📖 Objectives

* To provide an organized platform for managing books and users.
* To facilitate easy tracking of issued and returned books.
* To minimize manual work and reduce human errors in library management.
* To implement CRUD operations for both books and users.

---

## 🚀 Features Implemented

* Add new books with details (Title, Author, ISBN, etc.).
* View complete list of books.
* Update existing book records.
* Delete books from the library.
* Manage users/borrowers (add, view, update, delete).
* Issue books to users and record issue/return dates.
* Return books and update availability status.
* User interface built using **JSP** with integrated CSS styling.
* Database operations handled using the **DAO (Data Access Object) pattern**.

---

## 🛠️ Technology Stack

* **Frontend:** JSP, HTML, CSS
* **Backend:** Java Servlets
* **Database:** MySQL
* **Build Tool:** Apache Maven
* **Server:** Apache Tomcat

---

## ⚙️ Installation & Setup

1. **Clone the repository**

   bash
   git clone https://github.com/Swapniljare/Library-Management-System.git
   

2. **Import the project**

   * Open Eclipse or IntelliJ IDEA.
   * Import as a **Maven project**.

3. **Configure the database**

   sql
   CREATE DATABASE library_db;

   CREATE TABLE books (
       id INT PRIMARY KEY AUTO_INCREMENT,
       title VARCHAR(255),
       author VARCHAR(255),
       isbn VARCHAR(100),
       available BOOLEAN DEFAULT TRUE
   );

   CREATE TABLE users (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(255),
       email VARCHAR(255)
   );

   CREATE TABLE issued_books (
       id INT PRIMARY KEY AUTO_INCREMENT,
       book_id INT,
       user_id INT,
       issue_date DATE,
       return_date DATE,
       FOREIGN KEY (book_id) REFERENCES books(id),
       FOREIGN KEY (user_id) REFERENCES users(id)
   );

4. **Update database credentials**

   * Modify the database connection settings in `DBUtil.java` (username, password, URL).

5. **Deploy the project**

   * Use **Apache Tomcat** server.
   * Run the project and open in browser:
   
     http://localhost:8080/Library-Management-System/

---

## 📄 Conclusion

The Library Management System successfully automates the management of books and users, ensuring efficient handling of day-to-day library activities. By implementing CRUD operations with a structured DAO pattern, it maintains clean code architecture and provides an extendable base for future enhancements such as authentication, advanced search, or digital library features.

---
