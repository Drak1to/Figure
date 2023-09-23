public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;

    @Override
    int calculateArea() {
        int S = (a + b + c) / 2;
        System.out.println(S);


        return S;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    void calculatePerimeter() {
        int P = a + b + c;
        System.out.println(P);

    }
}
