public class Bar{
	public static void main(String[] args){
		String[] barName ={"Navarang Bar and Restaurants","tirupathi Bar and Restaurants","mangala Bar and Restaurants","Anjaneya Bar and Restaurants","Suvid Bar and Restaurants","Varanasi Bar and Restaurants","Highfi Bar and Restaurants","Rajkumar Bar and Restaurants","kuberappa Bar and Restaurants","narendra modi Bar and Restaurants"};
		String[] liqureName ={"teachers","royal challenge","block dog","block and white","old monk","mcdowells","king fisher","royal stag","officer choice","Bacardi"};
		int[] costPerLtr ={460,370,1350,1400,1200,2340,2300,1700,1500,400};
		
		System.out.println("Alcohol you might like.. ");
		for(String liqure:liqureName){
			System.out.println(liqure);
		}
		System.out.println("---------------------");
		System.out.println("Famous Bar in Bangalore ");
		for (String bar:barName){
			System.out.println(bar);
		}
		System.out.println("---------------------");
		System.out.println("Price of each brands ");
		for(int price:costPerLtr){
			System.out.println(price);
		}
	}
}