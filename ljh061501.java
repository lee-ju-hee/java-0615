class Car
{
    String carColor;
    int nowSpeed;

    Car()
    {
        this.carColor = "����";
        this.nowSpeed = 0;
    }

    Car(String color)
    {
        this.carColor = color;
        this.nowSpeed=0;
    }

    Car(String color, int speed)
    {
        this.carColor = color;
        this.nowSpeed = speed;
    }

    String getColor()
    {
        return this.carColor;
    }

    int getSpeed()
    {
        return this.nowSpeed;
    }

    void display()
    {
        System.out.printf("�ڵ��� ������ %s�̰� ����ӵ��� %dkm �Դϴ�.\n", carColor, nowSpeed);
    }

    void upSpeed(int up_speed)
    {
        this.nowSpeed += up_speed;
    }

    void downSpeed(int down_speed)
    {
        this.nowSpeed -= down_speed;
    }
}
public class ljh061501{
    public static void main(String[] args){

        Car c1 = new Car();
        c1.upSpeed(30);
        c1.display();

        Car c2 = new Car("�Ķ�");
        c2.upSpeed(60);
        //c2.getColor();
        c2.display();

        Car c3 = new Car("���", 0);
        //c3.getColor();
        //c3.getSpeed();
        c3.display();
    }
}