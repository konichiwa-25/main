public class Book 
{
     String title;
     String author;
     int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    } 

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);


        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
  
}