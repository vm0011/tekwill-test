package homework_nr_4;

public class Circle {
    float radius = 10;

    public Circle(float radius) {
        this.radius = radius;
    }

    public  void calculateArea(){
        System.out.println(3.14*this.radius*this.radius);
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        circle1.calculateArea();
    }
}
