# 🚀 How to Run the Bookshop Application

## Prerequisites

1. **Java 17+** installed
2. **Maven 3.6+** installed
3. **MySQL 8.0+** installed and running
4. **Git** (optional)

---

## Step-by-Step Instructions

### Step 1: Start MySQL Server

**Windows:**
```bash
net start MySQL80
```

**Mac:**
```bash
brew services start mysql
```

**Linux:**
```bash
sudo systemctl start mysql
```

---

### Step 2: Create Database

Open MySQL command line:
```bash
mysql -u root -p
```

Enter your MySQL password, then run:
```sql
CREATE DATABASE bookshop;
EXIT;
```

---

### Step 3: Navigate to Project Directory

```bash
cd c:\Users\HP\Desktop\Book_shop\bookshop
```

---

### Step 4: Run the Application

**Option A: Using Maven (Recommended)**
```bash
mvn spring-boot:run
```

**Option B: Using JAR File**
```bash
mvn clean package
java -jar target/kickoff-0.0.1-SNAPSHOT.jar
```

---

### Step 5: Wait for Startup

You should see output like:
```
✓ Admin user created: admin / admin123
✓ Test user created: user / user123
✓ 5 sample books created
Started BookshopApplication in X.XXX seconds
```

---

### Step 6: Open in Browser

Go to: **http://localhost:8080/login**

---

## 🔐 Login Credentials

### Admin Account
```
Username: admin
Password: admin123
```

### Regular User Account
```
Username: user
Password: user123
```

---

## 📖 What to Do After Login

### As Regular User:

1. **View Books**
   - Click "Books" in navbar
   - See all 5 sample books
   - Click "Add to Cart" on any book

2. **View Cart**
   - Click "🛒 Cart" in navbar
   - See items in cart
   - Click "Place Order"

3. **View Orders**
   - Click "Orders" in navbar
   - See order history

### As Admin:

1. **Add New Book**
   - Click "Admin" in navbar
   - Fill in book details
   - Upload cover image (optional)
   - Click "Add Book"

2. **Browse Books**
   - Same as regular user
   - Can also add to cart and place orders

---

## 🌐 Application URLs

| Page | URL |
|------|-----|
| Login | http://localhost:8080/login |
| Register | http://localhost:8080/register |
| Books | http://localhost:8080/books |
| Cart | http://localhost:8080/cart |
| Orders | http://localhost:8080/orders |
| Admin Add Book | http://localhost:8080/admin/add-book |

---

## 🛑 Stop the Application

Press `Ctrl + C` in the terminal where Maven is running.

---

## 🔧 Troubleshooting

### Issue: "Connection refused" error

**Solution:**
1. Check MySQL is running: `mysql -u root -p`
2. Verify database exists: `SHOW DATABASES;`
3. Check credentials in `application.properties`

### Issue: Port 8080 already in use

**Solution:**
1. Change port in `application.properties`:
   ```properties
   server.port=8081
   ```
2. Access at: http://localhost:8081/login

### Issue: Can't see books

**Solution:**
1. Refresh the page
2. Check MySQL has data: `SELECT * FROM bookshop.book;`
3. Restart the application

### Issue: Login fails

**Solution:**
1. Clear browser cookies
2. Check users exist: `SELECT * FROM bookshop.users;`
3. Try default credentials: admin / admin123

### Issue: Build fails

**Solution:**
```bash
mvn clean install
mvn spring-boot:run
```

---

## 📊 Database Info

**Database Name:** bookshop

**Tables:**
- `users` - User accounts
- `book` - Book catalog
- `cart_item` - Shopping cart
- `orders` - Customer orders
- `order_item` - Order items

**Sample Data:**
- 2 users (admin, user)
- 5 books (pre-loaded)

---

## 🎯 Quick Test Workflow

1. Start application: `mvn spring-boot:run`
2. Open: http://localhost:8080/login
3. Login with: admin / admin123
4. Click "Books" to see 5 sample books
5. Click "Add to Cart" on any book
6. Click "🛒 Cart" to view cart
7. Click "Place Order" to checkout
8. Click "Orders" to see order history
9. Click "Admin" to add new books
10. Click "Logout" to exit

---

## 📝 Application Features

✅ User authentication with roles
✅ Book catalog with 5 sample books
✅ Shopping cart functionality
✅ Order placement and history
✅ Admin panel to add books
✅ Beautiful responsive UI
✅ Form validation
✅ Error handling
✅ Database persistence
✅ Password encryption

---

## 🎉 You're Ready!

Your bookshop application is fully functional and ready to use.

**Start now:**
```bash
mvn spring-boot:run
```

**Then visit:** http://localhost:8080/login

Enjoy! 📚

