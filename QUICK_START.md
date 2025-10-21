# Quick Start Guide - Bookshop Application

## 🚀 Get Running in 2 Minutes

### Step 1: Ensure MySQL is Running
```bash
# Windows - Start MySQL Service
net start MySQL80

# Or use MySQL Workbench to verify connection
```

### Step 2: Create Database
```bash
mysql -u root -p
CREATE DATABASE bookshop;
EXIT;
```

### Step 3: Run the Application
```bash
cd c:\Users\HP\Desktop\Book_shop\bookshop
mvn spring-boot:run
```

### Step 4: Open in Browser
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

## 📍 Key Pages

| Feature | URL |
|---------|-----|
| Books List | http://localhost:8080/books |
| Login | http://localhost:8080/login |
| Register | http://localhost:8080/register |
| Shopping Cart | http://localhost:8080/cart |
| My Orders | http://localhost:8080/orders |
| Add Book (Admin) | http://localhost:8080/admin/add-book |

---

## ✅ What Works

- ✅ User Registration
- ✅ User Login
- ✅ Admin Panel
- ✅ Add/View Books
- ✅ Shopping Cart
- ✅ Place Orders
- ✅ View Order History

---

## 🛑 Stop the Application

Press `Ctrl + C` in the terminal

---

## 📝 Database Credentials

Update if needed in: `src/main/resources/application.properties`

```properties
spring.datasource.username=root
spring.datasource.password=mysql123
```

---

## 🐛 Troubleshooting

**Can't login?**
- Check MySQL is running
- Verify database exists: `SHOW DATABASES;`
- Check console for error messages

**Port 8080 in use?**
- Add to `application.properties`: `server.port=8081`

**File upload not working?**
- Create folder: `src/main/resources/static/images/`

---

## 📦 Build for Production

```bash
mvn clean package
java -jar target/kickoff-0.0.1-SNAPSHOT.jar
```

---

**Need more details?** See `RUNNING_THE_APP.md` or `FIXES_APPLIED.md`

