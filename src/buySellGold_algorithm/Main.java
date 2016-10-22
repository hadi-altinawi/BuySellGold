package buySellGold_algorithm;

import java.util.ArrayList;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Gold prices on consecutive days
	    int prices[] = {2,7,1,8,2,8,4,5,9,0,4,5}; // normal vector //solution 1 is 2 and 8
	    
	    int prices2[] ={9,8,7,6,5,4,3,2,1}; // less loss // solutions1 is 0 and 1
	    
	    int prices3[] ={9,1,8,7,6,5,4,3,2}; // less loss // solution1 is 1 and 2
	    
	    int prices4[] ={1,2,3,4,5,6,7,8,9,1,5,0,0}; // best profit // solution1 is 0 and 8
	    
	    int prices5[] ={1,9,2,3,4,5,6,7,8}; // best profit// solution1 is 0 and 1
	    
	    int prices6[]= {1}; // There is no solution
	     
	  /*  Solution1 solution1= new Solution1(prices5);
	    
	    System.out.println("Buy day is : " + solution1.getBuyDay() +
	    		" and sell day is : " + solution1.getSellDay());
	    		*/
	    
	    Solution2 solution2 = new Solution2(prices);
	    
	    ArrayList<BestDays> days = solution2.getBuySellDays();
	    
	    if(days!=null){
	    	
	    	for(int i=0; i<days.size();i++){
	    		System.out.println("Buy day is : " + days.get(i).getBuyDay() +
	    	    		" and sell day is : " + days.get(i).getSellDay());
	    	}
	    	
	    }
	    else{
	    	
	    	System.out.println("There is no solution !");
	    	
	    }
	    	
	    
	    
	    

	}

}

