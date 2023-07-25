import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        Stock stock1 = new Stock("AAPL", "Apple Inc.", 150.25);
        Stock stock2 = new Stock("GOOGL", "Alphabet Inc.", 2750.50);
        Stock stock3 = new Stock("TSLA", "Tesla Corporation", 305.75);

        portfolio.addStock(stock1, 10);
        portfolio.addStock(stock2, 5);
        portfolio.addStock(stock3, 20);

        portfolio.viewPortfolio();

        scanner.close();
    }
}
