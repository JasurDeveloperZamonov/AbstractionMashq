public class Dog extends Animal{

    private String bow;

    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    @Override
    void sound() {
        setBow("bow bow");
        System.out.println(getBow());
    }

    @Override
    void getname() {
        System.out.println("Xatico ");
    }
}
