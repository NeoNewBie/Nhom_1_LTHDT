public class Book {
    private String bookID;
    private String title;
    private String author;
    private int publication_year;
    private int quantity;

    public Book(){

    }
    
    public Book(String bookID, String title, String author, int publication_year, int quantity ){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
        this.quantity = quantity;
    }

    public String getBookID(){
        return bookID;
    }

    public void setBookID(String bookID){
        this.bookID = bookID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPublication_year(){
        return publication_year;
    }

    public void setPublication_year(int publication_year){
        this.publication_year = publication_year;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void displayInfo(){
        System.out.println("bookID : " + bookID);
        System.out.println("title: " + title);
        System.out.println("author : " + author);
        System.out.println("publiccation year : " + publication_year);
        System.out.println("quantity : " + quantity);
    }
    
}
