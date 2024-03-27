public class App {
    public static void main(String[] args) throws Exception {
        Pig babi = new Pig();
        babi.animalSound();
        babi.sleep();

        Pigman manusiaBabi = new Pigman();
        manusiaBabi.animalSound();
        manusiaBabi.sleep();
        manusiaBabi.walk();
    }
}
