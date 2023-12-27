public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle=new Triangle();
        GeometricFigure trapezium=new Trapezium();
        GeometricFigure rectangle=new Rectangle();
        System.out.println();
        triangle.perimeter();
        triangle.area();
        System.out.println();
        trapezium.perimeter();
        trapezium.area();
        System.out.println();
        rectangle.perimeter();
        rectangle.area();

        Animal dog=new Dog();
        Animal duck=new Duck();
        Animal cat=new Cat();

        System.out.println("\nB Tophiriq");
        dog.getname();
        dog.sound();
        System.out.println();
        duck.getname();
        duck.sound();
        System.out.println();
        cat.getname();
        cat.sound();

    }
}