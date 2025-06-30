public class Library {
    public static void main(String[] args) {
        String[] books = {
            "To Kill a Mockingbird",
            "1984",
            "Pride and Prejudice",
            "The Great Gatsby",
            "Moby Dick",
            "War and Peace",
            "The Catcher in the Rye",
            "The Hobbit",
            "Crime and Punishment",
            "Jane Eyre"
        };

        //System.out.println(books[0] + ", " + books[1] + ", " + books[2] + ", " + books[3] + ", " + books[4] + ", " + books[5] + ", " + books[6] + ", " + books[7] + ", " + books[8] + ", " + books[9]);
		System.out.println("Currently available books in library are ");
		for(String book : books){
			System.out.println(book);
		}
	}
}