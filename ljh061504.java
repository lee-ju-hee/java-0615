class Book
{
    String bookname, writer, date, insa;

    Book()
    {
        this.bookname = "작자미상";
        this.writer = "없음";
        this.date = "없음";
        this.insa = "없음";
    }

    Book(String name)
    {
        this.bookname = name;
        this.writer = "없음";
        this.date = "없음";
        this.insa = "없음";
    }

    Book(String name, String write)
    {
        this.bookname = "name";
        this.writer = write;
        this.date = "없음";
        this.insa = "없음";
    }

    Book(String name, String write, String day, String num)
    {
        this.bookname = name;
        this.writer = write;
        this.date = day;
        this.insa = num;
    }

    void display()
    {
        System.out.printf("=====================\n");
        System.out.printf("책제목: %s\n", bookname);
        System.out.printf("저자: %s\n", writer);
        System.out.printf("날짜: %s\n", date);
        System.out.printf("insa: %s\n", insa);
        System.out.printf("=====================\n");
    }
}
public class ljh061504{
    public static void main(String[] args){

        Book book1 = new Book();
        Book book2 = new Book("java 정복");
        Book book3 = new Book("C++", "김태욱");
        Book book4 = new Book("C++", "이주희", "1991-01-01", "978-12-7050-1");

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}