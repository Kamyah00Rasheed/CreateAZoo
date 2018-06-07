package com.company.inventory;

public class Food extends Items {

    private String category;
    private String expirationDate;
    private boolean refidgerated;

    public Food(double price, String itemName, int quantity, String dateReceived, String category, String expirationDate, boolean refidgerated) {
        super(price, itemName, quantity, dateReceived);
        this.category = category;
        this.expirationDate = expirationDate;
        this.refidgerated = refidgerated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRefidgerated() {
        return refidgerated;
    }

    public void setRefidgerated(boolean refidgerated) {
        this.refidgerated = refidgerated;
    }
}
