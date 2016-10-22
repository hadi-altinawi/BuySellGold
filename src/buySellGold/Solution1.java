package buySellGold;

/*
 * This Solution find the best day to buy and the best day to sell, just one!
 */

public class Solution1 {
	
	private int [] goldPrices;// Vector holds gold prices
	private int buyDay;// Best day to buy
	private int sellDay;// Best day to sell
	private int bestProfit;// Variable used to find best profit I can have it.
	private boolean thereIsProfit;// To check if there is profit or loss
	
	public Solution1(int [] prices) {
		// TODO Auto-generated constructor stub
		
		this.goldPrices=prices;
		
		if(goldPrices==null || goldPrices.length<2){
			System.out.println("Invaild  input, there must be 2 days with prices at least!");
			buyDay=sellDay=-1;
		}
		else{
		
		this.buyDay=0;
		this.bestProfit=0;
		this.thereIsProfit=false;
		
		findDays();
		
		}
		
		
	}
	
	//Find best days to buy and sell regarding to the highest profit I can found
	private void findDays() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<goldPrices.length-1;i++){
			
			for(int j=i+1; j<goldPrices.length;j++){
				
				if(goldPrices[j]-goldPrices[i]>bestProfit){
					
					bestProfit=goldPrices[j]-goldPrices[i];
					buyDay=i;
					sellDay=j;
					thereIsProfit=true;
					
				}
			}
			
		}
		
		// There is no profit, we should minimize the loss
		if(!thereIsProfit){
			
			bestProfit=goldPrices[1]-goldPrices[0];
			buyDay=0;
			sellDay=1;
			
			for(int i=0; i<goldPrices.length-1;i++){
				
				for(int j=i+1; j<goldPrices.length;j++){
					
					if(goldPrices[j]-goldPrices[i]>bestProfit){
						
						bestProfit=goldPrices[j]-goldPrices[i];
						buyDay=i;
						sellDay=j;
						
					}
				}
				
			}
		}
		
	}

	public int getBuyDay(){
		
		return buyDay;
	}
	
	public int getSellDay(){
				
		return sellDay;
	}

}
