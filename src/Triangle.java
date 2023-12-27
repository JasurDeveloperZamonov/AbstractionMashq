public class Triangle extends GeometricFigure{
    private double a;
    private double b;
    private double c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    void area() {
        Triangle uch=new Triangle();
        uch.setA(10);
        uch.setB(12);
        uch.setC(8);
        double p=(uch.getA()+uch.getB()+uch.getC())/2;
        System.out.println("Uchburchak yuzi: "+Math.sqrt(p*(p- uch.getA())*(p- uch.getB())*(p- uch.getC())));
    }

    @Override
    void perimeter() {
        Triangle uch=new Triangle();
        uch.setA(10);
        uch.setB(12);
        uch.setC(8);
        double p=uch.getA()+uch.getB()+uch.getC();
        System.out.println("Uchburchak peremetri: "+p);
    }
}
