public class Circle {
    int radius;
    double PI = 3.14159;
    double area;
    double diam;

    public Circle(int radius){
        this.radius=radius;
    }

    public void circleArea(){
        area = PI*radius*radius;
    }
    public void circleDiam(){
        diam = 2*radius;
    }
}
