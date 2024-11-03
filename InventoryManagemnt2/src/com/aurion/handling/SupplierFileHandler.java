package com.aurion.handling;

import com.aurion.model.Supplier;
import com.aurion.exceptions.FileProcessingException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SupplierFileHandler implements IFileHandler<Supplier> {
    private static final String SUPPLIERS_FILE = "D:\\SWABHAV_TRAINING\\SWABHAV_TRAINING\\COREJAVA\\InventoryManagemnt2\\src\\suppliers.txt";

    @Override
    public void save(List<Supplier> suppliers) throws FileProcessingException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SUPPLIERS_FILE,true))) {
            for (Supplier supplier : suppliers) {
                writer.write(supplier.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error saving suppliers: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Supplier> load() throws FileProcessingException {
        List<Supplier> suppliers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(SUPPLIERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                suppliers.add(Supplier.parseSupplier(line));
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error loading suppliers: " + e.getMessage(), e);
        }
        return suppliers;
    }
}