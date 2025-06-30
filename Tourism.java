public class Tourism{
	public static void main(String[] tourism){
		String[] touristPlaces = {"Paris france","Bali, Indonesia","Dubai,UAE","Great Barrier Reef,Australia","Grand Canyon,USA","Santorini,Greece","London,UK","Majorca,Spain","Tokyo,Japan","New York,USA","TajMahal,India","Sagara, Karnataka"};
		//System.out.println("Worlds top tourist Places are "+touristPlaces[0]+","+touristPlaces[1]+","+touristPlaces[2]+","+touristPlaces[3]+","+touristPlaces[4]+","+touristPlaces[5]+","+touristPlaces[6]+","+touristPlaces[7]+","+touristPlaces[8]+","+touristPlaces[9]+","+touristPlaces[10]);
		System.out.println("Worlds top tourist Places are ");
		for(String touristPlace:touristPlaces){
			System.out.println(touristPlace);
		}
	}
}