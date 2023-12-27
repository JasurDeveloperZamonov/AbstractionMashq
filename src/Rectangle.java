public class Rectangle extends GeometricFigure{

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    void area() {
        Rectangle rgl=new Rectangle();
        rgl.setA(4);
        rgl.setB(6);

        System.out.println("To'rtburchak yuzi: "+(rgl.getA()*rgl.getB()));
    }

    @Override
    void perimeter() {
        Rectangle rgl=new Rectangle();
        rgl.setA(4);
        rgl.setB(6);

        System.out.println("To'rtburchak Peremetri: "+(2*(rgl.getA()+rgl.getB())));
    }
}
