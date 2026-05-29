# 🌿 Green Farm Marketplace

## ✨ Project Summary
**Green Farm Marketplace** is a fun and practical Java console application that turns everyday farm commerce into an object-oriented simulation. Built to showcase Java fundamentals, it lets farmers manage farm products and customers shop from a vibrant digital marketplace.

- Realistic product listings: fruits, vegetables, grains, coffee, and more
- Simple console UI for browsing, buying, and managing inventory
- Core OOP design with clean class structure and reusable behavior

---

## 🚀 What Makes It Fun
- Add new farm products and see them appear immediately
- Browse all available products with prices and quantity
- Buy products and track customer orders
- Automatically calculate totals and update inventory

---

## 🧠 Java Concepts Demonstrated
### 1. Classes & Objects
Represents real-world entities using Java classes:
- `Product`
- `Vegetable`
- `Fruit`
- `Farmer`
- `Customer`
- `Order`

### 2. Encapsulation
Protects data using private fields and exposes safe access through getters/setters.
Example:
```java
private double price;
private int quantity;
```

### 3. Inheritance
`Vegetable` and `Fruit` extend `Product`, reusing common product logic while keeping specific behavior clean.

### 4. Polymorphism
Different product types can behave differently through method overriding, especially when calculating price or displaying product details.

---

## 📁 Project Files
- `Main.java`
- `Product.java`
- `Vegetable.java`
- `Fruit.java`
- `Farmer.java`
- `Customer.java`
- `Order.java`
- `README.md`

---

## ▶️ How to Run
Open a terminal in the project folder and run:
```bash
javac *.java
java Main
```
Then follow the on-screen menu to add products, view inventory, buy items, and exit.

---

## 🖥️ Example Session
```text
===== Green Farm Marketplace =====
1. Add Product
2. View Products
3. Buy Product
4. Exit

Enter choice: 2
Available Products:
1. Apple - 50 Birr - 10 left
2. Carrot - 30 Birr - 20 left

Enter choice: 3
Choose Product: Apple
Quantity: 2

Total Price: 100 Birr
Order confirmed!
```

---

## 🎯 Why This Project Matters
This marketplace is a great way to practice Java OOP while building a mini application that feels real. It shows how object design, inheritance, and behavior-driven code can create a maintainable system.

---

## 👨‍🌾 Developer
**Your Name**

Course: Object-Oriented Programming

Happy coding! 🌻