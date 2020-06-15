class HelloWorld
{
    String str;

    HelloWorld()
    {
        this.str = "Hello World!!";
    }

    HelloWorld(String insa)
    {
        this.str = insa;
    }

    void print()
    {
        System.out.printf(str + "\n");
    }
    
    
}
public class ljh061502{
    public static void main(String[] args){

        HelloWorld hello1 = new HelloWorld();
        hello1.print();
        HelloWorld hello2 = new HelloWorld("My Hello World!!");
        hello2.print();
    }
}