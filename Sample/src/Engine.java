package Java.Sample.src;

public class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    void start() {
        System.out.println("You started the " + this.type + " engine");
    }
}
