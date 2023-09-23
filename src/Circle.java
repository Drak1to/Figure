public class Circle extends GeometricFigure {
    private int r;

    @Override
    int calculateArea() {
        int S = (int) ((r * r) * Math.PI);
        System.out.println(S);

        return S;
    }

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
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    void calculatePerimeter() {
        int L = (int) ((r * Math.PI) * 2);
        System.out.println(L);


    }
}
