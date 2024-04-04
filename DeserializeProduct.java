import java.io.*;

public class DeserializeProduct {

    public static void main(String[] args) {
        // File path to the serialized product object
        String filePath = "product.ser";

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            // Read the deserialized product object
            Product product = (Product) inputStream.readObject();

            // Print the deserialized product details
            System.out.println("Deserialized Product:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Assuming you have a separate Product class (replace with your actual implementation)
class Product implements java.io.Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    // Getters and setters (you might need to implement these based on your class)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
