public class CityPinCodes {
    public static void main(String[] args) {
        String[] cities = {
            "Mumbai: 400001",
            "Delhi: 110001",
            "Bangalore: 560001",
            "Chennai: 600001",
            "Kolkata: 700001",
            "Hyderabad: 500001",
            "Pune: 411001",
            "Ahmedabad: 380001",
            "Jaipur: 302001",
            "Lucknow: 226001",
            "Chandigarh: 160001",
            "Bhopal: 462001",
            "Patna: 800001",
            "Indore: 452001",
            "Coimbatore: 641001"
        };

        System.out.println("Each city pin codes");
		for(String city:cities){
			System.out.println(city);
		}
    }
}