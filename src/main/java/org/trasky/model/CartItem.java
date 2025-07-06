package org.trasky.model;

public class CartItem {
    private char sku;
    private int quantity;

    public CartItem(char sku,int quantity) {
        this.quantity = quantity;
        this.sku = sku;
    }

    public char getSku() {
        return sku;
    }

    public void setSku(char sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
