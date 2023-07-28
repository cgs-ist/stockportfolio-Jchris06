import java.util.HashMap;
import java.util.Map;

class Stock {
    private String symbol;
    private String name;
    private double price;

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return symbol + " (" + name + "): $" + price;
    }
}

class StockPortfolio {
    private Map<Stock, Integer> holdings;

    public StockPortfolio() {
        holdings = new HashMap<>();
    }

    public void addStock(Stock stock, int quantity) {
        holdings.put(stock, quantity);
    }

    public void viewPortfolio() {
        System.out.println("Stock Portfolio:");

        double totalValue = 0.0;

        for (Stock stock : holdings.keySet()) {
            int quantity = holdings.get(stock);
            double value = stock.getPrice() * quantity;
            totalValue += value;
            System.out.println(stock + " - Quantity: " + quantity + " - Value: $" + value);
        }

        System.out.println("Total Portfolio Value: $" + totalValue);
    }
}