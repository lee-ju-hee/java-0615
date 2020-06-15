class Car
{
    String carColor;
    int nowSpeed;

    Car()
    {
        this.carColor = "빨강";
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
        System.out.printf("자동차 색상은 %s이고 현재속도는 %dkm 입니다.\n", carColor, nowSpeed);
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

        Car c2 = new Car("파랑");
        c2.upSpeed(60);
        //c2.getColor();
        c2.display();

        Car c3 = new Car("노랑", 0);
        //c3.getColor();
        //c3.getSpeed();
        c3.display();
    }
}