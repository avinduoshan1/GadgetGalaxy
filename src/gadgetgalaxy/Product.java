package gadgetgalaxy;

public class Product { 
   
    protected String brand;
    protected String model;
    protected String category; 
    protected String specifications; 
    protected String price;


    public Product(String brand, String model, String category, String specifications, String price) {
        this.brand = brand;
        this.model = model;
        this.category = category;
        this.specifications = specifications;
        this.price = price;
    }

  
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getCategory() { return category; } 
    public String getSpecifications() { return specifications; } 
    public String getPrice() { return price; }

    @Override
    public String toString() {
        return brand + "," + model + "," + category + "," + specifications + "," + price;
    }
}