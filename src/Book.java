public class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void applyDiscount(int discountAmount){
        price -= price * discountAmount/100;
    }
    public void printInfo(){
        System.out.println("Назва: "+title);
        System.out.println("Автор: "+author);
        System.out.println("Ціна: "+price);
    }
}
