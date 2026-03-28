# Gadget Galaxy - Inventory Management System

A Java-based desktop application for managing gadget inventory with role-based access control for managers and sales representatives.

## Features

### Manager Dashboard
- User management (Add, Update, Delete users)
- Create Manager and SalesRep accounts
- View all system users
- Full administrative control

### Sales Representative Dashboard
- Product management (Add, Update, Delete products)
- Search products by category
- View complete product inventory
- Manage gadget specifications and pricing

### Product Categories
- Smartphone
- Laptop
- Tablet
- Audio Device
- Accessory

## System Requirements

- Java Development Kit (JDK) 23 or higher
- NetBeans IDE 25 (recommended)
- Windows/Linux/MacOS operating system

## Installation

1. Clone or download the project files
2. Open the project in NetBeans IDE
3. Build the project to resolve dependencies
4. Run the `LoginFrame.java` file to start the application

## Default Login Credentials

### Manager Account
- Username: `admin`
- Password: `1234`

### Sales Representative Account
- Username: `kehan`
- Password: `1234`

## Project Structure

```
Gadget Galaxy/
├── src/gadgetgalaxy/
│   ├── LoginFrame.java          # Login interface
│   ├── ManagerDashboard.java    # Manager interface
│   ├── SalesRepDashboard.java   # Sales Rep interface
│   ├── User.java                # User model
│   ├── UserService.java         # User management service
│   ├── Product.java             # Product model
│   ├── ProductService.java      # Product management service
│   └── Smartphone.java          # Inheritance example
├── users.txt                    # User data storage
├── products.txt                 # Product data storage
└── README.md                    # This file
```

## Data Storage

The application uses text-based file storage:
- `users.txt` - Stores user credentials and roles
- `products.txt` - Stores product information

### Data Format

**Users:** `username,password,type`
```
admin,1234,Manager
kehan,1234,SalesRep
```

**Products:** `brand,model,category,specifications,price`
```
samsung,galaxy s24,Smartphone,24gb ram,200000
Apple,Applewatch,Accessory,12,50000
```

## How to Use

### Login
1. Launch the application
2. Enter your username and password
3. Click the Login button
4. You will be redirected to your role-specific dashboard

### Manager Functions

#### Add User
1. Enter new username and password
2. Select user type (Manager/SalesRep)
3. Click the ADD button

#### Update User
1. Click on a user in the table to select
2. Modify the username, password, or type
3. Click the UPDATE button

#### Delete User
1. Click on a user in the table to select
2. Click the DELETE button
3. Confirm the deletion

### Sales Representative Functions

#### Add Product
1. Enter brand, model, category, price, and specifications
2. Click the "Add Gadget" button
3. Product will be added to the inventory

#### Update Product
1. Click on a product in the table to select
2. Modify the product details
3. Click the "Update Gadget" button

#### Delete Product
1. Click on a product in the table to select
2. Click the "Delete Gadget" button
3. Confirm the deletion

#### Search Products
1. Select a category from the search dropdown
2. Click the Search button
3. View filtered results in the table

## Technical Details

### Technologies Used
- **Language:** Java 23
- **GUI Framework:** Java Swing (NetBeans Form Editor)
- **Layout Manager:** AbsoluteLayout
- **Data Persistence:** File I/O (BufferedWriter, Scanner)
- **Build Tool:** Apache Ant (NetBeans default)

### Object-Oriented Programming Concepts
- **Classes:** User, Product, UserService, ProductService
- **Encapsulation:** Private fields with public getters
- **Inheritance:** Smartphone extends Product
- **File Handling:** Reading and writing to text files
- **Collections:** ArrayList for data management

### Key Classes

**User.java**
- Properties: username, password, type
- Methods: getters, toString()

**Product.java**
- Properties: brand, model, category, specifications, price
- Methods: getters, toString()

**UserService.java**
- Methods: getAllUsers(), addUser(), updateUser(), deleteUser()

**ProductService.java**
- Methods: getAllProducts(), addProduct(), updateProduct(), deleteProduct(), searchProducts()

## Security Notes

- Passwords are stored in plain text (for educational purposes only)
- In production, implement proper password hashing
- Add input validation and sanitization
- Implement proper exception handling
- Consider using a database instead of text files

## Future Enhancements

- Password encryption/hashing
- Database integration (MySQL/PostgreSQL)
- Product images
- Sales tracking and reporting
- Invoice generation
- Stock level management
- Barcode scanning
- Export to PDF/Excel
- Multi-language support

## Troubleshooting

### Application won't start
- Ensure JDK 23 is properly installed
- Check that all image resources are in the correct directory
- Verify the absolutelayout library is included

### Data not saving
- Check file permissions in the application directory
- Ensure users.txt and products.txt are not read-only
- Verify the application has write access to the directory

### Login fails
- Check that users.txt exists with valid data
- Verify username and password match exactly
- Ensure there are no extra spaces in credentials

## Contributing

This is an educational project. Feel free to fork and enhance it with additional features.

## License

This project is created for educational purposes.

## Contact

For questions or support regarding this application, please refer to the project documentation.

---

**Note:** This application is designed for learning purposes and demonstrates basic inventory management concepts using Java Swing.
