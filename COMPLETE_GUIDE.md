# 📚 Bookshop Application - Complete Guide

## ✨ What's New

Your bookshop application now has:
- ✅ **Beautiful Thymeleaf Templates** with inline CSS
- ✅ **5 Sample Books** pre-loaded in the database
- ✅ **Fully Functional UI** for all features
- ✅ **Responsive Design** that works on all devices
- ✅ **Complete User Flow** from login to order placement

---

## 🚀 Quick Start (2 Minutes)

### Step 1: Ensure MySQL is Running
```bash
net start MySQL80
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
| **admin** | admin123 | ADMIN |
| **user** | user123 | USER |

---

## 📚 Sample Books Included

The application comes with 5 pre-loaded books:

1. **The Great Gatsby** by F. Scott Fitzgerald - $12.99
2. **To Kill a Mockingbird** by Harper Lee - $14.99
3. **1984** by George Orwell - $13.99
4. **Pride and Prejudice** by Jane Austen - $11.99
5. **The Catcher in the Rye** by J.D. Salinger - $15.99

---

## 🌐 Application Pages

### Public Pages
- **Login** - http://localhost:8080/login
- **Register** - http://localhost:8080/register

### User Pages (After Login)
- **Books List** - http://localhost:8080/books
- **Shopping Cart** - http://localhost:8080/cart
- **Order History** - http://localhost:8080/orders

### Admin Pages
- **Add Book** - http://localhost:8080/admin/add-book

---

## 📖 User Workflow

### As Regular User (user/user123):

1. **Login**
   - Go to http://localhost:8080/login
   - Enter: user / user123

2. **Browse Books**
   - View all 5 sample books
   - See book title, author, and price
   - Click "Add to Cart" button

3. **Shopping Cart**
   - View items in cart
   - See total price
   - Click "Place Order" to checkout

4. **Order History**
   - View all placed orders
   - See order details and items

### As Admin (admin/admin123):

1. **Login**
   - Go to http://localhost:8080/login
   - Enter: admin / admin123

2. **Add New Books**
   - Click "Admin" in navbar
   - Fill in book details (title, author, price)
   - Upload cover image (optional)
   - Click "Add Book"

3. **Browse & Manage**
   - View all books
   - Add books to cart
   - Place orders like regular users

---

## 🎨 UI Features

### Navigation Bar
- Logo and branding
- Quick links to all pages
- Logout button

### Book Cards
- Book cover image (or placeholder)
- Book title and author
- Price display
- "Add to Cart" button
- Hover effects

### Shopping Cart
- Table view of cart items
- Quantity display
- Price calculations
- Remove item buttons
- Order summary with total

### Order History
- Order cards with order ID
- List of items in each order
- Item quantities and prices
- Empty state message

---

## 🛠️ Features Implemented

✅ User Registration & Login
✅ Password Encryption (BCrypt)
✅ Role-Based Access Control (Admin/User)
✅ Book Management (Add, View)
✅ Shopping Cart (Add, Remove, View)
✅ Order Placement
✅ Order History
✅ Responsive Design
✅ Beautiful UI with Gradients
✅ Form Validation

---

## 📝 Database

The application uses MySQL with these tables:
- **users** - User accounts with roles
- **book** - Book catalog
- **cart_item** - Shopping cart items
- **orders** - Customer orders
- **order_item** - Items in orders

Sample data is automatically created on first run.

---

## 🔧 Troubleshooting

### Issue: Can't see books
**Solution:** 
- Refresh the page
- Check MySQL is running
- Verify database has books table

### Issue: Add to cart not working
**Solution:**
- Make sure you're logged in
- Check browser console for errors
- Verify cart table exists in database

### Issue: Login fails
**Solution:**
- Clear browser cookies
- Check MySQL is running
- Verify users table has data

### Issue: Images not showing
**Solution:**
- Create folder: `src/main/resources/static/images/`
- Upload images with correct filenames
- Refresh browser cache

---

## 📦 Build & Deploy

### Build for Production
```bash
mvn clean package
```

### Run JAR File
```bash
java -jar target/kickoff-0.0.1-SNAPSHOT.jar
```

### Change Port
Add to `application.properties`:
```properties
server.port=8081
```

---

## 📞 Support

For issues or questions:
1. Check the troubleshooting section
2. Review application logs
3. Verify MySQL connection
4. Check file permissions

---

## 🎉 You're All Set!

Your bookshop application is ready to use. Start with:
```bash
mvn spring-boot:run
```

Then login with: **admin / admin123** or **user / user123**

Enjoy! 📚

