package construct.ex;

public class Book {
    String title;
    String author;
    int page;


    Book() {
        System.out.println("기본이얌");
    }

    Book(String title, String author) {
        this(title, author, 50);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}




