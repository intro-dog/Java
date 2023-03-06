package main.java.homework_5;

public class Product {
    private String productName;
    private int productNumber;
    private double productCost;
    private String productDescription;
    private boolean productAvailability;

    public Product(String productName, int productNumber, int productCost, String productDescription, boolean productAvailability) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.productCost = productCost;
        this.productDescription = productDescription;
        this.productAvailability = productAvailability;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductCost(int code) {
        this.productNumber= code;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double price) {
        this.productCost = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String description) {
        this.productDescription = description;
    }

    public boolean getProductAvailability() { return productAvailability; }

    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

}