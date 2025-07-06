Promotion Engine Project
# Promotion Engine

A Java implementation of a shopping cart promotion system.

## 📌 Features
- Bulk discounts (e.g., 3 of A for 130)
- Combo offers (e.g., C + D for 30)
- JUnit test coverage

## 🚀 Quick Start
```java
List<CartItem> cart = Arrays.asList(
    new CartItem('A', 5),
    new CartItem('B', 3)
);
int total = new PromotionEngine().applyPromotions(cart);
