import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockPortfolio {
    private Map<String, Integer> holdings;
    private Map<String, Stock> stockMap;

    public StockPortfolio() {
        holdings = new HashMap<>();
        stockMap = new HashMap<>();
    }

    public void addStock(Stock stock, int quantity) {
        if (stock != null && quantity > 0) {
            holdings.put(stock.getSymbol(), quantity);
            stockMap.put(stock.getSymbol(), stock);
            System.out.println(quantity + " shares of " + stock.getName() + " added to the portfolio.");
        }
    }

    public void viewPortfolio() {
        if (holdings.isEmpty()) {
            System.out.println("Your portfolio is empty.");
        } else {
            System.out.println("Your Stock Portfolio:");
            for (String symbol : holdings.keySet()) {
                int quantity = holdings.get(symbol);
                Stock stock = stockMap.get(symbol);
                double totalValue = quantity * stock.getPrice();
                System.out.println(stock.getName() + " (" + stock.getSymbol() + ") - Quantity: " + quantity + ", Price: $" + stock.getPrice() + ", Total Value: $" + totalValue);
            }
        }
    }
}
