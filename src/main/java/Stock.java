
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
    private StockType type;
    
    public Stock(String name, double price, StockType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public Stock(Stock stockToCopy) {
        this.name = stockToCopy.getName();
        this.price = stockToCopy.getPrice();
        this.type = stockToCopy.getType();
    }
    
    public Stock() {
        this.name = "";
        this.price = 0;
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

    public StockType getType() {
        return type;
    }

    public void setType(StockType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Stock{" + "name=" + name + ", price=" + price + ", type=" + type.toString() + '}';
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
