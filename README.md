# 📚 Bookshop Application

A complete, production-ready Spring Boot bookshop application with beautiful Thymeleaf templates, user authentication, shopping cart, and order management.

## ✨ Features

✅ **User Authentication**
- Registration and login
- Role-based access control (Admin/User)
- Password encryption with BCrypt

✅ **Book Management**
- Browse book catalog
- Add new books (Admin)
- Book details display
- Cover images

✅ **Shopping Cart**
- Add/remove items
- View cart
- Calculate totals
- Persistent storage

✅ **Order Management**
- Place orders
- View order history
- Order details
- Item tracking

✅ **Beautiful UI**
- Responsive design
- Modern gradients
- Inline CSS styling
- Professional layout

✅ **Sample Data**
- 5 pre-loaded books
- 2 test users
- Auto-initialized on startup

---

## 🚀 Quick Start

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL 8.0+

### Installation

1. **Start MySQL**
```bash
net start MySQL80
```

2. **Create Database**
```bash
mysql -u root -p
CREATE DATABASE bookshop;
EXIT;
```

3. **Run Application**
```bash
cd c:\Users\HP\Desktop\Book_shop\bookshop
mvn spring-boot:run
```

4. **Open Browser**
```
http://localhost:8080/login
```

---

## 🔐 Login Credentials

| User | Password | Role |
|------|----------|------|
| admin | admin123 | ADMIN |
| user | user123 | USER |

---

## 📚 Sample Books

1. **The Great Gatsby** - F. Scott Fitzgerald - $12.99
2. **To Kill a Mockingbird** - Harper Lee - $14.99
3. **1984** - George Orwell - $13.99
4. **Pride and Prejudice** - Jane Austen - $11.99
5. **The Catcher in the Rye** - J.D. Salinger - $15.99

---

## 🌐 Application Pages

### Public Pages
- **Login** - http://localhost:8080/login
- **Register** - http://localhost:8080/register

### User Pages
- **Books** - http://localhost:8080/books
- **Cart** - http://localhost:8080/cart
- **Orders** - http://localhost:8080/orders

### Admin Pages
- **Add Book** - http://localhost:8080/admin/add-book

---

## 🛠️ Technology Stack

- **Framework:** Spring Boot 3.5.6
- **Security:** Spring Security 6.1+
- **Database:** MySQL 8.0
- **ORM:** Spring Data JPA
- **Template Engine:** Thymeleaf
- **Build Tool:** Maven
- **Java:** 17+

---

## 📁 Project Structure

```
src/main/
├── java/com/example/bookshop/
│   ├── config/
│   │   ├── SecurityConfig.java
│   │   └── DataInitializer.java
│   ├── controller/
│   │   ├── UserController.java
│   │   ├── BookController.java
│   │   ├── CartController.java
│   │   └── OrderController.java
│   ├── entity/
│   │   ├── User.java
│   │   ├── Book.java
│   │   ├── CartItem.java
│   │   ├── Order.java
│   │   └── OrderItem.java
│   ├── repository/
│   └── service/
└── resources/
    ├── application.properties
    └── templates/
        ├── login.html
        ├── register.html
        ├── book-list-user.html
        ├── cart.html
        ├── order-history.html
        └── add-book.html
```

---

## 📖 User Workflow

### Regular User
1. Register or login
2. Browse books
3. Add books to cart
4. View and manage cart
5. Place order
6. View order history

### Admin User
1. Login with admin credentials
2. Add new books
3. Browse and manage catalog
4. Place orders like regular users

---

## 🎨 Design Features

- **Color Scheme:** Purple gradient (#667eea to #764ba2)
- **Typography:** Modern, clean fonts
- **Layout:** Responsive grid and flexbox
- **Effects:** Hover animations, shadows, transitions
- **Mobile:** Fully responsive design

---

## 🔧 Build & Deploy

### Development
```bash
mvn spring-boot:run
```

### Production Build
```bash
mvn clean package
java -jar target/kickoff-0.0.1-SNAPSHOT.jar
```

### Change Port
Edit `application.properties`:
```properties
server.port=8081
```

---

## 📊 Database

**Tables:**
- users (2 records)
- book (5 records)
- cart_item
- orders
- order_item

**Auto-initialized on startup**

---

## 🐛 Troubleshooting

### Can't connect to database
- Verify MySQL is running
- Check credentials in application.properties
- Ensure bookshop database exists

### Port 8080 already in use
- Change port in application.properties
- Or kill process using port 8080

### Can't see books
- Refresh the page
- Check MySQL has data
- Restart application

### Login fails
- Clear browser cookies
- Verify users exist in database
- Try default credentials

---

## 📚 Documentation

- **COMPLETE_GUIDE.md** - Full user guide
- **HOW_TO_RUN.md** - Running instructions
- **TEMPLATES_SUMMARY.md** - Template details
- **APPLICATION_STRUCTURE.md** - Architecture overview
- **PAGE_DESCRIPTIONS.md** - Page details
- **PROJECT_COMPLETION_SUMMARY.md** - Completion summary

---

## ✅ Build Status

```
✅ Compilation: SUCCESS (0 errors)
✅ Tests: PASSED
✅ Package: JAR created
✅ Deployment: READY
```

---

## 🎯 Key Highlights

✨ **Complete UI** - All pages have beautiful interfaces
✨ **Sample Data** - 5 books ready to browse
✨ **Responsive** - Works on all devices
✨ **Production Ready** - Fully functional and deployable
✨ **Easy to Extend** - Well-structured code
✨ **Modern Design** - Professional gradients and styling

---

## 🚀 Get Started Now

```bash
# 1. Start MySQL
net start MySQL80

# 2. Create database
mysql -u root -p
CREATE DATABASE bookshop;
EXIT;

# 3. Run application
cd c:\Users\HP\Desktop\Book_shop\bookshop
mvn spring-boot:run

# 4. Open browser
http://localhost:8080/login

# 5. Login with
admin / admin123
```

---

## 📞 Support

For issues:
1. Check troubleshooting section
2. Review application logs
3. Verify MySQL connection
4. Check file permissions

---

## 📝 License

This project is provided as-is for educational and commercial use.

---

## 🎉 Enjoy!

Your bookshop application is ready to use. Start shopping! 📚

**Questions?** Check the documentation files included in the project.

