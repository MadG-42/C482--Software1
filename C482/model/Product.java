package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Madison Gish - 000745675
 */

public class Product {

    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;
    private ObservableList<Part> associatedParts = FXCollections.observableArrayList();

    //Constructor
    public Product(int id, String name, double price, int stock, int min, int max) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    //Getter
    public int getId() {
        return id;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public double getPrice() {
        return price;
    }

    //Setter
    public void setPrice(double price) {
        this.price = price;
    }

    //Getter
    public int getStock() {
        return stock;
    }

    //Setter
    public void setStock(int stock) {
        this.stock = stock;
    }

    //Getter
    public int getMin() {
        return min;
    }

    //Setter
    public void setMin(int min) {
        this.min = min;
    }

    //Getter
    public int getMax() {
        return max;
    }

    //Setter
    public void setMax(int max) {
        this.max = max;
    }

    //Add Associated Part
    public void  addAssociatedPart(Part part) {
        associatedParts.add(part);
    }

    //Delete Associated Part
    public boolean deleteAssociatedPart(Part selectedAssociatedPart) {
        if (associatedParts.contains(selectedAssociatedPart)) {
            associatedParts.remove(selectedAssociatedPart);
            return true;
        }
        else
            return false;
    }
    //Get All Associated Parts
    public ObservableList<Part> getAllAssociatedParts() {return associatedParts;}
}
