package day3;

public class StockTrackingApp {

	public static void main(String[] args) {
	
		String name;
		int price;
		
		// display the price .
		Stock apple= new Stock("Apple",2900000);
		Stock realme= new Stock("Realme",1900000);
		Stock tata= new Stock("Tata",2200000);
		
		name=apple.getStockName();
		price=apple.getStockPrice();
		System.out.println("\t"+name+"->"+price);
		
		name=realme.getStockName();
		price=realme.getStockPrice();
		System.out.println("\t"+name+"->"+price);
		
		name=tata.getStockName();
		price=tata.getStockPrice();
		System.out.println("\t"+name+"->"+price);
		
		// call price change method 
		apple.changePrice(10, false);
		tata.changePrice(20, false);
		realme.changePrice(10, true);
		// display the stock details again
		System.out.println("\n***********Updated Stock***********\n");
		name=apple.getStockName();
		price=apple.getStockPrice();
		System.out.println("\t"+name+"->"+price);
		
		name=realme.getStockName();
		price=realme.getStockPrice();
		System.out.println("\t"+name+"->"+price);
		
		name=tata.getStockName();
		price=tata.getStockPrice();
		System.out.println("\t"+name+"->"+price);
		
	}

}
