public class SuperMarkets{
	public static void main(String[] args){
		String[] iceCreams = {"Venilla","chacolate","Strawberry","Cookies & Cream","Mint Chacolate Chip","Butter Pecan","Mango","Gelato","Sherbet","Sorbet","Frozen Yogurt","Soft Serve"};
		String[] perfumes = {"Acqua di parma","Burberry","Calvin klein","Hugo Boss","Lancome","Parfums de marly","Amouage","Chanel","Dior","Gucci"};
		String[] groceries = {"milk","Cheese","Yogurt","Butter","eggs","fish","pork","beef","chicken","Bread"};
		String[] cosmetics = {"Nykaa","Lakme","Colorbar","suar cosmetics","faces canada","mamaearth","purplle"};
		
		//System.out.println("Icecreams "+iceCreams[0]+","+iceCreams[1]+","+iceCreams[2]+","+iceCreams[3]+","+iceCreams[4]+","+iceCreams[5]+","+iceCreams[6]+","+iceCreams[7]+","+iceCreams[8]);
		//System.out.println("Perfumes "+perfumes[0]+","+perfumes[1]+","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+","+perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]);
		//System.out.println("Groceries "+groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+","+groceries[5]+","+groceries[6]);
		//System.out.println("Cosmetics "+cosmetics[0]+","+cosmetics[1]+","+cosmetics[2]+","+cosmetics[3]+","+cosmetics[4]+","+cosmetics[5]);
		System.out.println("IceCreams available ");
		for (String iceCream : iceCreams){
			System.out.println(iceCream);
		}
		System.out.println("available perfumes ");
		System.out.println(" ");
		
		for (String perfume : perfumes){
			System.out.println(perfume);
		}
		System.out.println(" ");
		
		System.out.println("Available Cosmetics");
		System.out.println(" ");
		for (String cosmetic : cosmetics){
			System.out.println(cosmetic);
		}
	}
}