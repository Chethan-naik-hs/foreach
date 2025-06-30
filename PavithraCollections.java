public class PavithraCollections {
    public static void main(String[] args) {
        String[] brands = {
            "Zara", "H&M", "Levis", "Nike", "Adidas",
            "Gucci", "Prada", "Versace", "Armani", "Burberry",
            "Chanel", "Dior", "Louis Vuitton", "Hermes", "Fendi",
            "Tommy Hilfiger", "Calvin Klein", "Puma", "Reebok", "Under Armour"
        };
        // Concatenate brand names using + operator without loop
        //String allBrands = brands[0] + ", " + brands[1] + ", " + brands[2] + ", " + brands[3] + ", " + brands[4]
        //        + ", " + brands[5] + ", " + brands[6] + ", " + brands[7] + ", " + brands[8] + ", " + brands[9]
        //        + ", " + brands[10] + ", " + brands[11] + ", " + brands[12] + ", " + brands[13] + ", " + brands[14]
        //        + ", " + brands[15] + ", " + brands[16] + ", " + brands[17] + ", " + brands[18] + ", " + brands[19];
        //System.out.println("Pavithra Collections Brands: " + allBrands);
		System.out.println("Pavithra Collections Brands: ");
		for(String brand:brands){
			System.out.println(brand);
		}
    }
}