public class Trapezium extends GeometricFigure{

    private double a;
    private double b;
    private double h;

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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    void area() {
    Trapezium tr=new Trapezium();
    tr.setA(4);
    tr.setB(8);
    tr.setH(6);
        System.out.println("Trapetsiya yuzi: "+((tr.getA()+tr.getB())/2)* tr.getH());
    }

    @Override
    void perimeter() {
        System.out.println("Trapetsiya peremetrini hisoblash uchun parametirlar kam!");
    }
}
