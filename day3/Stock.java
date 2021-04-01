package day3;

public class Stock {

	private String stockName; // infosys
	private int stockPrice;  // 1300
	
	public Stock(String name, int price) {
		stockName = name;
		stockPrice = price;
		
	}
	
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public void changePrice(float percentageChange,boolean action)
	{
		if(action)
		{
			stockPrice=(int) (stockPrice+stockPrice*(percentageChange/100));
					}
		else {
			stockPrice=(int) (stockPrice-stockPrice*(percentageChange/100));
		}
	}

}