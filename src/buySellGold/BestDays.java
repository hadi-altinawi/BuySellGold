package buySellGold;

//Solution structure
public class BestDays {
	 
	 private int buyDay, sellDay;
	 
	 public BestDays(){
		 
		 this.setBuyDay(-1);
		 this.setSellDay(-1);
	 }
	
	public int getBuyDay() {
		return buyDay;
	}
	
	public void setBuyDay(int buy) {
		this.buyDay = buy;
	}
	
	public int getSellDay() {
		return sellDay;
	}
	
	public void setSellDay(int sell) {
		this.sellDay = sell;

	}

}