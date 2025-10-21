# 📐 Application Structure

## Project Layout

```
bookshop/
├── src/
│   ├── main/
│   │   ├── java/com/example/bookshop/
│   │   │   ├── BookshopApplication.java (Main entry point)
│   │   │   ├── config/
│   │   │   │   ├── SecurityConfig.java (Spring Security)
│   │   │   │   └── DataInitializer.java (Sample data)
│   │   │   ├── controller/
│   │   │   │   ├── UserController.java (Auth)
│   │   │   │   ├── BookController.java (Books)
│   │   │   │   ├── CartController.java (Cart)
│   │   │   │   └── OrderController.java (Orders)
│   │   │   ├── entity/
│   │   │   │   ├── User.java
│   │   │   │   ├── Book.java
│   │   │   │   ├── CartItem.java
│   │   │   │   ├── Order.java
│   │   │   │   └── OrderItem.java
│   │   │   ├── repository/
│   │   │   │   ├── UserRepository.java
│   │   │   │   ├── BookRepository.java
│   │   │   │   ├── CartItemRepository.java
│   │   │   │   └── OrderRepository.java
│   │   │   └── service/
│   │   │       ├── UserDetailsServiceImpl.java
│   │   │       └── BookService.java
│   │   └── resources/
│   │       ├── application.properties (Config)
│   │       └── templates/
│   │           ├── login.html ✨ NEW
│   │           ├── register.html ✨ NEW
│   │           ├── book-list-user.html ✨ NEW
│   │           ├── cart.html ✨ NEW
│   │           ├── order-history.html ✨ NEW
│   │           └── add-book.html ✨ NEW
│   └── test/
│       └── java/...
├── pom.xml (Maven config)
└── target/ (Build output)
```

---

## 🔄 Application Flow

### User Journey

```
┌─────────────────────────────────────────────────────────┐
│                    START                                │
└────────────────────┬────────────────────────────────────┘
                     │
                     ▼
        ┌────────────────────────┐
        │   Login Page           │
        │  (login.html)          │
        └────────┬───────────────┘
                 │
        ┌────────▼──────────┐
        │ Authenticate User │
        └────────┬──────────┘
                 │
        ┌────────▼──────────────────────┐
        │ Check User Role               │
        └────────┬──────────────────────┘
                 │
        ┌────────┴──────────┐
        │                   │
        ▼                   ▼
    ┌────────┐          ┌────────┐
    │ ADMIN  │          │ USER   │
    └────┬───┘          └───┬────┘
         │                  │
         ▼                  ▼
    ┌─────────────┐    ┌──────────────┐
    │ Admin Panel │    │ Books List   │
    │ Add Books   │    │ (book-list)  │
    └─────────────┘    └──────┬───────┘
                               │
                        ┌──────▼──────┐
                        │ Add to Cart  │
                        └──────┬───────┘
                               │
                        ┌──────▼──────┐
                        │ View Cart   │
                        │ (cart.html) │
                        └──────┬───────┘
                               │
                        ┌──────▼──────┐
                        │Place Order  │
                        └──────┬───────┘
                               │
                        ┌──────▼──────────┐
                        │ Order History   │
                        │ (order-history) │
                        └─────────────────┘
```

---

## 🗄️ Database Schema

### Users Table
```
users
├── id (PK)
├── username (UNIQUE)
├── password (encrypted)
└── role (ROLE_ADMIN, ROLE_USER)
```

### Book Table
```
book
├── id (PK)
├── title
├── author
├── price
└── coverImage
```

### CartItem Table
```
cart_item
├── id (PK)
├── user_id (FK)
├── book_id (FK)
└── quantity
```

### Orders Table
```
orders
├── id (PK)
├── user_id (FK)
└── orderTime
```

### OrderItem Table
```
order_item
├── id (PK)
├── order_id (FK)
├── book_id (FK)
├── quantity
└── price
```

---

## 🔐 Security Flow

```
Request
   │
   ▼
┌─────────────────────────┐
│ SecurityFilterChain     │
└────────┬────────────────┘
         │
         ▼
┌─────────────────────────┐
│ Check if Authenticated  │
└────────┬────────────────┘
         │
    ┌────┴────┐
    │          │
    ▼          ▼
  YES         NO
   │           │
   │      ┌────▼──────────┐
   │      │ Redirect to   │
   │      │ Login Page    │
   │      └───────────────┘
   │
   ▼
┌──────────────────────┐
│ Check User Role      │
└────────┬─────────────┘
         │
    ┌────┴────┐
    │          │
    ▼          ▼
 ADMIN       USER
   │          │
   ▼          ▼
Allow      Allow
Admin      User
Pages      Pages
```

---

## 🎨 Template Structure

### Each Template Includes:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <!-- Meta tags -->
    <!-- Inline CSS -->
</head>
<body>
    <!-- Navigation Bar -->
    <div class="navbar">
        <!-- Logo and Links -->
    </div>

    <!-- Main Content -->
    <div class="container">
        <!-- Page Header -->
        <!-- Content -->
    </div>

    <!-- Footer -->
    <div class="footer">
        <!-- Copyright -->
    </div>
</body>
</html>
```

---

## 🔌 API Endpoints

### Authentication
- `POST /register` - Register new user
- `POST /login` - Login user
- `GET /logout` - Logout user

### Books
- `GET /books` - View all books
- `GET /book/{id}` - View book details

### Cart
- `POST /cart/add/{bookId}` - Add to cart
- `GET /cart` - View cart
- `POST /cart/remove/{itemId}` - Remove from cart

### Orders
- `POST /order/place` - Place order
- `GET /orders` - View order history

### Admin
- `GET /admin/add-book` - Add book form
- `POST /admin/add-book` - Save new book

---

## 📦 Dependencies

### Core
- Spring Boot 3.5.6
- Spring Security 6.1+
- Spring Data JPA
- Thymeleaf

### Database
- MySQL Connector
- H2 (for testing)

### Utilities
- Lombok
- Maven

---

## 🚀 Deployment

### Development
```bash
mvn spring-boot:run
```

### Production
```bash
mvn clean package
java -jar target/kickoff-0.0.1-SNAPSHOT.jar
```

### Docker (Optional)
```dockerfile
FROM openjdk:17
COPY target/kickoff-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

---

## 📊 Data Flow

```
User Input
    │
    ▼
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
Database
    │
    ▼
Repository
    │
    ▼
Service
    │
    ▼
Controller
    │
    ▼
Template (Thymeleaf)
    │
    ▼
HTML Response
    │
    ▼
Browser Display
```

---

## ✨ Key Features

1. **MVC Architecture** - Clean separation of concerns
2. **Spring Security** - Role-based access control
3. **JPA/Hibernate** - ORM for database
4. **Thymeleaf** - Server-side templating
5. **Responsive Design** - Mobile-friendly UI
6. **Data Validation** - Form validation
7. **Error Handling** - Graceful error pages
8. **Password Encryption** - BCrypt hashing

---

## 🎯 Complete and Ready!

All components are in place and working together seamlessly.

**Start the application:**
```bash
mvn spring-boot:run
```

**Access at:** http://localhost:8080/login

