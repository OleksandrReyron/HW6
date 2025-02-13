public class Circle {
    int radius;
    double PI = 3.14159;
    double area;
    double length;

    public Circle(int radius){
        this.radius=radius;
    }

    public void circleArea(){
        area = PI*radius*radius;
    }
    public void circleLength(){
        length = 2*PI*radius;
    }
}
