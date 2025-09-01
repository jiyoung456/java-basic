package class1;

class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class ClassExGpt {

    public static void main(String[] args) {
        Book[] books = {
                new Book("자바의 정석", "남궁성", 30000),
                new Book("이펙티브 자바", "조슈아 블로크", 40000),
                new Book("클린 코드", "로버트 마틴", 35000)
        };

        //books를 반복할거야. Book 배열인 books를 b라고 두고 차례대로 꺼내서 반복해.
        for (Book b : books) {
            System.out.println(b.title + b.author + b.price);

        }
    }
}
