package homework9.task3;

    @FunctionalInterface
    interface IBook {
int pages = 800;
String name =" new Book";
void print();

    }

public class Book {
    public static void main(String[] args) {
        IBook b1 = new IBook() {
            @Override
            public void print() {
                System.out.println(pages+name);

            }
            b1.print();
            IBook b2 =() -> System.out.println(pages + name);
            b2.print();
        };

    }

}
