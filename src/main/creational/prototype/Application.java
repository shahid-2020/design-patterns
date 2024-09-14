package creational.prototype;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(6);
        Circle circle2 = (Circle) circle.clone();
        circle.setR(100);
        circle.draw();
        circle2.draw();
    }
}
