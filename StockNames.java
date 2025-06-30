public class StockNames {
    public static void main(String[] args) {
        // Collect stock names in an array
        String[] stockNames = {
            "AAPL", "GOOGL", "MSFT", "AMZN", "TSLA",
            "META", "NFLX", "NVDA", "BABA", "JPM"
        };

        // Print stock names concatenated with + operator, without using a loop
        for(String stockName : stockNames){
			System.out.println("Available stocks are ");
			System.out.println(stockName);
		}
			
    }
}