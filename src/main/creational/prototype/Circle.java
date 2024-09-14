package creational.prototype;

public class Circle implements IShape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle"+" "+r);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
