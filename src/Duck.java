public class Duck extends Animal{

    private String quack;

    public String getQuack() {
        return quack;
    }

    public void setQuack(String quack) {
        this.quack = quack;
    }

    @Override
    void sound() {
        setQuack("quack quack");
        System.out.println(getQuack());
    }

    @Override
    void getname() {
        System.out.println("O'rdak");
    }
}
