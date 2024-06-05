package patterns.strategy;

public class NormalBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se normalmente...");
    }
}
