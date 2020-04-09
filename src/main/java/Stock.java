
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Stock {
   
    private String name;
    private double price;
    
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", price=" + price;
    }

    @Override
    public boolean equals(Object obj) {
       
        Stock incomingStock = (Stock)obj;
        
        if (incomingStock.getPrice() == this.getPrice() &&
            incomingStock.getName() == this.getName())
        {
            return true;
        }
        else {
            return false;
        }
    }
}
