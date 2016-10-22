package buySellGold_algorithm;

import java.util.ArrayList;

public class Solution2 {
	
	private int [] goldPrices;
	private int buyDay;
	private int sellDay;
	private int bestProfit;
	private boolean thereIsProfit;
	private ArrayList<BestDays> buySellDaysArray;
	
	public Solution2(int [] prices) {
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
		buySellDaysArray= new ArrayList<BestDays>();
		
		findDays();
		
		}
		
	}

	private void findDays() {
		// TODO Auto-generated method stub
		
		int i = 0;
        while (i < goldPrices.length - 1){
			
			
			//Comparing to find buy day
			while ((i < goldPrices.length - 1) && (goldPrices[i]> goldPrices[i + 1] )){
                i++;
			}
			
			// If we reached the end, break as no further solution possible
            if (i == goldPrices.length - 1){
                break;
            }
            
            //Save the buy day and move to the next day
            BestDays bestDays = new BestDays();
            bestDays.setBuyDay(i++); 
            
            //Comparing to find the closer sell day
            while ((i < goldPrices.length) && (goldPrices[i] > goldPrices[i - 1]))
                i++;
 
            //Save the sell day
            bestDays.setSellDay(i-1);
            
            //Store the buy and sell days into the array
            buySellDaysArray.add(bestDays);
            thereIsProfit=true;
            
            
		}// end while loop
		
		// There is no profit, we should minimize the loss
		if(!thereIsProfit){
			
			bestProfit=goldPrices[1]-goldPrices[0];
			buyDay=0;
			sellDay=1;
			
			for( i=0; i<goldPrices.length-1;i++){
				
				for(int j=i+1; j<goldPrices.length;j++){
					
					if(goldPrices[j]-goldPrices[i]>bestProfit){
						
						bestProfit=goldPrices[j]-goldPrices[i];
						buyDay=i;
						sellDay=j;
						
					}
				}
				
			}
			
			BestDays bestDays = new BestDays();
			bestDays.setBuyDay(buyDay);
			bestDays.setSellDay(sellDay);
			buySellDaysArray.add(bestDays);
		}
		
		
	}
	
	
	public ArrayList<BestDays> getBuySellDays(){
		
		return buySellDaysArray;
	}
	
	
}


