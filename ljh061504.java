class Book
{
    String bookname, writer, date, insa;

    Book()
    {
        this.bookname = "���ڹ̻�";
        this.writer = "����";
        this.date = "����";
        this.insa = "����";
    }

    Book(String name)
    {
        this.bookname = name;
        this.writer = "����";
        this.date = "����";
        this.insa = "����";
    }

    Book(String name, String write)
    {
        this.bookname = "name";
        this.writer = write;
        this.date = "����";
        this.insa = "����";
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
        System.out.printf("å����: %s\n", bookname);
        System.out.printf("����: %s\n", writer);
        System.out.printf("��¥: %s\n", date);
        System.out.printf("insa: %s\n", insa);
        System.out.printf("=====================\n");
    }
}
public class ljh061504{
    public static void main(String[] args){

        Book book1 = new Book();
        Book book2 = new Book("java ����");
        Book book3 = new Book("C++", "���¿�");
        Book book4 = new Book("C++", "������", "1991-01-01", "978-12-7050-1");

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}