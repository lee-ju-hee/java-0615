
public class Student extends People{
   
    private int id;

    public void setId(int id)
    {
        this.id = id;
    }

    public void studentPrint()
    {
        peoplePrint();
        System.out.println("ÇÐ¹ø: " + this.id);
    }
}
