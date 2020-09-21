import java.util.Scanner;

    class Book {
        private String bookname,authorName,publisher;
        private long ISBN;

public Book() {
}

public Book(String bookname,long ISBN,String authorName,String publisher) {
            this.bookname=bookname;
            this.ISBN=ISBN;
            this.authorName=authorName;
            this.publisher=publisher;
            }

public void setData(String bookname,long ISBN,String authorName,String publisher)
            {
            this.bookname=bookname;
            this.ISBN=ISBN;
            this.authorName=authorName;
            this.publisher=publisher;
            }

public void getData() {
            System.out.println("Book Name = "+bookname);
            System.out.println("ISBN No. = "+ISBN);
            System.out.println("Author Name = "+authorName);
            System.out.println("Publisher = "+publisher);
            }
}
   
    class Main {
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            Book book=new Book();System.out.println("Enter Book name, ISBN number, Author name,Publisher :- ");
            book.setData(scan.next(),scan.nextLong(),scan.next(),scan.next());
            book.getData();
        }
}

