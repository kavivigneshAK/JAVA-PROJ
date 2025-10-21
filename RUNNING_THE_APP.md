# How to Run the Bookshop Application

## Prerequisites

1. **Java 17+** installed
2. **Maven 3.6+** installed
3. **MySQL Server** running and accessible

## Step 1: Setup MySQL Database

### Option A: Using MySQL Command Line

```bash
# Connect to MySQL
mysql -u root -p

# Create the database
CREATE DATABASE bookshop;

# Exit
EXIT;
```

### Option B: Using MySQL Workbench
1. Open MySQL Workbench
2. Create a new schema named `bookshop`

## Step 2: Verify Database Connection

Update `src/main/resources/application.properties` if needed:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=mysql123
```

Change `username` and `password` to match your MySQL credentials.

## Step 3: Run the Application

### Option A: Using Maven (Recommended)

```bash
cd c:\Users\HP\Desktop\Book_shop\bookshop
mvn spring-boot:run
```

### Option B: Using JAR File

```bash
cd c:\Users\HP\Desktop\Book_shop\bookshop
java -jar target/kickoff-0.0.1-SNAPSHOT.jar
```

### Option C: Using IDE
- Right-click on `BookshopApplication.java`
- Select "Run" or "Run As" → "Java Application"

## Step 4: Access the Application

Once you see "Started BookshopApplication" in the console, open your browser:

### 🔗 Application URLs

| Page | URL |
|------|-----|
| **Home/Books** | http://localhost:8080/books |
| **Register** | http://localhost:8080/register |
| **Login** | http://localhost:8080/login |
| **Cart** | http://localhost:8080/cart |
| **Orders** | http://localhost:8080/orders |
| **Admin - Add Book** | http://localhost:8080/admin/add-book |

## Default Test Credentials

The application automatically creates two test users on first run:

### Admin User
```
Username: admin
Password: admin123
Role: ADMIN
```

### Regular User
```
Username: user
Password: user123
Role: USER
```

## Testing the Application

### 1. Login as Admin
- Go to http://localhost:8080/login
- Enter: `admin` / `admin123`
- You'll be redirected to the books page

### 2. Add a Book (Admin Only)
- Click "Admin - Add Book" or go to http://localhost:8080/admin/add-book
- Fill in the book details
- Upload a cover image
- Click "Add Book"

### 3. Login as Regular User
- Logout first (if logged in)
- Go to http://localhost:8080/login
- Enter: `user` / `user123`

### 4. Add Books to Cart
- Browse books on the home page
- Click "Add to Cart" button
- Go to http://localhost:8080/cart to view cart

### 5. Place an Order
- From the cart page, click "Place Order"
- View your orders at http://localhost:8080/orders

## Troubleshooting

### Issue: "Connection refused" or Database Error
**Solution:**
1. Verify MySQL is running
2. Check database credentials in `application.properties`
3. Ensure `bookshop` database exists

### Issue: Login not working
**Solution:**
1. Check the console for error messages
2. Verify users were created (look for "✓ Admin user created" message)
3. Clear browser cookies and try again

### Issue: "Port 8080 already in use"
**Solution:**
```bash
# Change the port in application.properties
server.port=8081
```

### Issue: File upload not working
**Solution:**
1. Ensure `src/main/resources/static/images/` directory exists
2. Check file permissions on the directory

## Stopping the Application

Press `Ctrl + C` in the terminal where the application is running.

## Building for Production

```bash
mvn clean package
```

This creates a deployable JAR at: `target/kickoff-0.0.1-SNAPSHOT.jar`

Deploy to any server with Java 17+ installed and run:
```bash
java -jar kickoff-0.0.1-SNAPSHOT.jar
```

