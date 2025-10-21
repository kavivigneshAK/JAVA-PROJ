# 📄 Page Descriptions

## 1. Login Page (`login.html`)

**URL:** http://localhost:8080/login

**Purpose:** User authentication

**Features:**
- Purple gradient background
- Centered white login form
- Username and password fields
- Submit button
- Demo credentials display box
- Link to registration page
- Error message display for failed logins

**Design:**
- Modern gradient: #667eea to #764ba2
- Rounded corners and shadows
- Responsive layout
- Focus states on inputs

**Sample Credentials:**
```
Admin:  admin / admin123
User:   user / user123
```

---

## 2. Registration Page (`register.html`)

**URL:** http://localhost:8080/register

**Purpose:** New user registration

**Features:**
- Matching design with login page
- Username input field
- Password input field
- Submit button
- Info box with instructions
- Link back to login page
- Form validation

**Design:**
- Same gradient background
- Consistent styling
- Clean form layout
- Responsive design

**Form Fields:**
- Username (required)
- Password (required)

---

## 3. Books List Page (`book-list-user.html`)

**URL:** http://localhost:8080/books

**Purpose:** Browse and shop for books

**Features:**
- Navigation bar with all links
- Page header with title
- Grid layout of book cards
- Book cover images (or placeholder)
- Book title and author
- Price display
- "Add to Cart" button for each book
- Empty state message
- Footer with copyright

**Design:**
- Responsive grid (auto-fill)
- Book cards with hover effects
- Gradient navbar
- Professional layout

**Sample Books Displayed:**
1. The Great Gatsby - $12.99
2. To Kill a Mockingbird - $14.99
3. 1984 - $13.99
4. Pride and Prejudice - $11.99
5. The Catcher in the Rye - $15.99

**Navigation Links:**
- Books (current)
- 🛒 Cart
- Orders
- Admin
- Logout

---

## 4. Shopping Cart Page (`cart.html`)

**URL:** http://localhost:8080/cart

**Purpose:** Review and manage shopping cart

**Features:**
- Navigation bar
- Page header
- Cart items table with:
  - Book title
  - Unit price
  - Quantity
  - Total price
  - Remove button
- Cart summary section:
  - Subtotal
  - Shipping (Free)
  - Total price
- Action buttons:
  - "Continue Shopping" (back to books)
  - "Place Order" (checkout)
- Empty cart message

**Design:**
- Table layout for items
- Summary card
- Hover effects on rows
- Responsive design

**Calculations:**
- Automatic price calculations
- Formatted currency display
- Real-time totals

---

## 5. Order History Page (`order-history.html`)

**URL:** http://localhost:8080/orders

**Purpose:** View past orders

**Features:**
- Navigation bar
- Page header
- Order cards for each order:
  - Order ID
  - Order date
  - List of items in order
  - Item quantities
  - Item prices
- Empty orders message
- "Continue Shopping" button
- Footer

**Design:**
- Card-based layout
- Gradient headers
- Clean item listing
- Responsive design

**Order Information:**
- Order ID
- Order date/time
- Items purchased
- Quantities
- Prices

---

## 6. Admin Add Book Page (`add-book.html`)

**URL:** http://localhost:8080/admin/add-book

**Purpose:** Add new books to catalog (Admin only)

**Features:**
- Admin navigation bar
- Page header
- Book form with fields:
  - Title (required)
  - Author (required)
  - Price (required, decimal)
  - Cover image upload (optional)
- Submit button
- Cancel button
- Form validation

**Design:**
- Clean form layout
- Centered container
- Professional styling
- Responsive form

**Form Fields:**
- Title: Text input
- Author: Text input
- Price: Number input (with decimals)
- Cover Image: File upload

**Buttons:**
- "Add Book" (submit)
- "Cancel" (back to books)

---

## 🎨 Design Elements

### Colors Used
- **Primary:** #667eea (Purple)
- **Secondary:** #764ba2 (Dark Purple)
- **Background:** #f5f5f5 (Light Gray)
- **Cards:** #ffffff (White)
- **Text:** #333333 (Dark Gray)
- **Accent:** #667eea (Links)

### Typography
- **Font Family:** Segoe UI, Tahoma, Geneva, Verdana, sans-serif
- **Sizes:** 12px to 32px
- **Weights:** 400, 500, 600, 700

### Components
- **Buttons:** Gradient, hover effects
- **Cards:** White, shadows, hover lift
- **Forms:** Clean inputs, focus states
- **Tables:** Striped, hover effects
- **Navigation:** Sticky, responsive

---

## 📱 Responsive Behavior

### Mobile (< 768px)
- Single column layouts
- Full-width forms
- Stacked navigation
- Touch-friendly buttons

### Tablet (768px - 1024px)
- 2-column grids
- Adjusted spacing
- Responsive navigation
- Optimized forms

### Desktop (> 1024px)
- 3-4 column grids
- Full navigation
- Optimized spacing
- Enhanced hover effects

---

## 🔄 Navigation Flow

```
Login/Register
    ↓
Books List ← → Cart
    ↓           ↓
    ├─→ Add to Cart
    │
    └─→ Orders
         ↓
    Order History

Admin Panel
    ↓
Add Book Form
    ↓
Back to Books
```

---

## ✨ User Experience

### For Regular Users
1. Login with credentials
2. Browse books in grid
3. Add books to cart
4. View and manage cart
5. Place order
6. View order history
7. Logout

### For Admin Users
1. Login with admin credentials
2. Access admin panel
3. Add new books
4. Browse books like regular users
5. Manage orders
6. Logout

---

## 🎯 Key Features Per Page

| Page | Key Features |
|------|--------------|
| Login | Auth, Demo creds, Error display |
| Register | Form validation, Link to login |
| Books | Grid layout, Add to cart, Search |
| Cart | Table view, Calculations, Checkout |
| Orders | Order cards, Item details, History |
| Admin | Form, File upload, Validation |

---

## 📊 Data Displayed

### Books Page
- 5 sample books
- Title, author, price
- Cover images
- Add to cart buttons

### Cart Page
- Cart items
- Quantities
- Prices
- Totals

### Orders Page
- Order IDs
- Order dates
- Items in orders
- Order totals

---

**All pages are fully functional and ready to use!**

