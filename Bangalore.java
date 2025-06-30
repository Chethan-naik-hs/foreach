public class Bangalore{
	public static void main(String[] args){
		int[] pinCodes = {566001, 566002, 566003,566004, 566005};
		String[] areaNames = {"RajajiNagar","Navarang","Malleswaram","Vijayanagar","Sampige Road"};
		
		for( int pinCode:pinCodes){
			System.out.println(pinCode);
		}
		for(String areaName:areaNames){
			System.out.println(areaName);
		}
	}
}