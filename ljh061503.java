class ObjExam2
{
    String name;
    int num;

    ObjExam2()
    {
        this.name = "ȫ�浿";
        this.num = 90;
    }

    ObjExam2(int m, String n)
    {
        this.name = n;
        this.num = m;
    }

    void prtVars()
    {
        System.out.printf("��ȣ : %d\n", num);
        System.out.printf("�̸� : %s\n", name);
    }
}
public class ljh061503{
    public static void main(String[] args){

        ObjExam2 obj1 = new ObjExam2();
        ObjExam2 obj2 = new ObjExam2(220, "�ƹ���");

        obj1.prtVars();
        obj2.prtVars();
    }
}