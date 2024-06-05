package patterns.strategy;

public class Robot {
    private Behavior strategy;

    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }

    //delega a responsabilidade para a strategy
    public void move() {
        strategy.move();
    }
}
