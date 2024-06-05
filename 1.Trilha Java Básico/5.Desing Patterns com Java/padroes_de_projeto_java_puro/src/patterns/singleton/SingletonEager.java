package patterns.singleton;

public class SingletonEager {
    private static SingletonEager intance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return intance;
    }
}
