package gadgetgalaxy;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    
    private final String FILE_NAME = "products.txt";

 
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return list;

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data.length == 5) { 
                    list.add(new Product(data[0], data[1], data[2], data[3], data[4]));
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


    public boolean addProduct(Product p) {
        ArrayList<Product> all = getAllProducts();
        for(Product prod : all){
            if(prod.getModel().equals(p.getModel())){
                return false; 
            }
        }

        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(p.toString());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    public ArrayList<Product> searchProducts(String category) {
        ArrayList<Product> all = getAllProducts();
        if (category.equals("All")) return all;

        ArrayList<Product> filtered = new ArrayList<>();
        for (Product p : all) {
            if (p.getCategory().equals(category)) {
                filtered.add(p);
            }
        }
        return filtered;
    }


    public void deleteProduct(String model) {
        ArrayList<Product> all = getAllProducts();
        ArrayList<Product> newList = new ArrayList<>();
        
        for (Product p : all) {
            if (!p.getModel().equals(model)) {
                newList.add(p);
            }
        }
        saveAll(newList);
    }


    public void updateProduct(String oldModel, Product newProduct) {
        ArrayList<Product> all = getAllProducts();
        ArrayList<Product> newList = new ArrayList<>();
        
        for (Product p : all) {
            if (p.getModel().equals(oldModel)) {
                newList.add(newProduct);
            } else {
                newList.add(p);
            }
        }
        saveAll(newList);
    }

    private void saveAll(ArrayList<Product> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Product p : list) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}