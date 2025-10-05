public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("A101", "OOP", "Lê Van B", 2012, 10);

        Book book2 = new Book();
        book2.setBookID("A102");
        book2.setTitle("DSA");
        book2.setAuthor("Tran Van");
        book2.setPublication_year(2015);
        book2.setQuantity(15);

        book1.displayInfo();
        System.out.println("------------------");
        book2.displayInfo();
    }
}
