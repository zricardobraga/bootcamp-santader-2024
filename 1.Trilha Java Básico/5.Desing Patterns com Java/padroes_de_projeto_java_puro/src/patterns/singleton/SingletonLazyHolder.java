package patterns.singleton;

public class SingletonLazyHolder {

    //classe holder cuja unica função é incapsular a instance
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
