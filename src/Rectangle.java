public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    @Override
    int calculateArea() {
        int R = a * b;
        System.out.println(R);
        return R;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    void calculatePerimeter() {
        int P = (a + b) * 2;
        System.out.println(P);

    }
}
