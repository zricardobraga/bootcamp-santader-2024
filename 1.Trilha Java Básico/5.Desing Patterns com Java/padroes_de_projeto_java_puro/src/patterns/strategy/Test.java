package patterns.strategy;

public class Test {
    public static void main(String[] args) {

        AggressiveBehavior aggressive = new AggressiveBehavior();
        DefensiveBehavior defesive = new DefensiveBehavior();
        NormalBehavior normal = new NormalBehavior();

        Robot robot = new Robot();

        robot.setStrategy(normal);

        robot.move();
        robot.setStrategy(defesive);
        robot.move();
        robot.setStrategy(aggressive);
        robot.move();
    }
}
