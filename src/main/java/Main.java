/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

        Stock stockTest = null;    
        
        Stock stock1 = new Stock("JK", 1, StockType.DOWJONES);
        Stock stock2 = new Stock(stock1);

        stock2.setName("Something else");

        System.out.println(stock1);
        System.out.println(stock2);

        Stock appleStock = new Stock("AAPL", 269.40, StockType.DOWJONES);

        System.out.println(appleStock.toString());
        System.out.println(appleStock);

        appleStock.setPrice(270.00);

        Stock microsoftStock = new Stock("MSFT", 100, StockType.DOWJONES);
        Stock secondMicrosoftStock = new Stock("MSFT", 100, StockType.DOWJONES);

        boolean isValid = Utilities.IsValidEmail("test");
        boolean isValid2 = Utilities.IsValidEmail("john@test.com");
        boolean isValidPhone = Utilities.IsValidPhoneNumber("123-456-2323");

        double sqroot = Math.sqrt(4);

        Stock bestStock = getBetterStock(appleStock, microsoftStock);

        if (secondMicrosoftStock.equals(microsoftStock)) {
            System.out.println("Stocks are equal");
        } else {
            System.out.println("Stocks are not equal");
        }

        
        
        if (stockTest != null) {
            System.out.println(stockTest.toString());
        }
    }

    public static Stock getBetterStock(Stock stockA, Stock stockB) {

        if (stockA.getPrice() > stockB.getPrice()) {
            return stockA;
        } else {
            return stockB;
        }

    }
}
