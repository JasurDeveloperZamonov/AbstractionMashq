public class Cat extends Animal{

    private String meow;

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    @Override
    void sound() {
        setMeow("meow meow");
        System.out.println(getMeow());
    }

    @Override
    void getname() {
        System.out.println("Tommi");
    }
}
