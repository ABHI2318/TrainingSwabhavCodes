package com.aurion.handling;

import com.aurion.model.Product;
import com.aurion.exceptions.FileProcessingException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFileHandler implements IFileHandler<Product> {
    private static final String PRODUCTS_FILE = "D:\\SWABHAV_TRAINING\\SWABHAV_TRAINING\\COREJAVA\\InventoryManagemnt2\\src\\products.txt";

    @Override
    public void save(List<Product> products) throws FileProcessingException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PRODUCTS_FILE,true))) {
            for (Product product : products) {
                writer.write(product.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error saving products: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Product> load() throws FileProcessingException {
        List<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PRODUCTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                products.add(Product.parseProduct(line));
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error loading products: " + e.getMessage(), e);
        }
        return products;
    }
}