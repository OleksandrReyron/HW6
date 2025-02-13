public class Main {
    public static void main(String[] args) {
        //Задача 1: Клас "Магазин книг"
        Book[] book = {
                new Book("Kobzar","T. G. Shevchenko",500),
                new Book("Fahrenheit 451","R. D. Bradbury",400),
                new Book("Harry Potter and The Philosopher's Stone", "J.K. Rowling",800)
        };

        for (int i = 0; i < book.length;i++){
            if (i == 2){
                book[i].applyDiscount(10);
            }
            System.out.println("Книга "+(i+1)+" :");
            System.out.println();
            book[i].printInfo();
            System.out.println();
        }


        //Задача 2: Клас "Геометричні фігури"
        Circle circle = new Circle(10);
        circle.circleArea();
        circle.circleDiam();
        System.out.println("Площа кола: "+ circle.area);
        System.out.println("Діаметр кола: "+ circle.diam);
    }
}