package patterns.singleton;

public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getIntance();
        SingletonEager eager = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println("Primeira instância: " + lazy);
        System.out.println("Primeira instância: " + eager);
        System.out.println("Primeira instância: " + lazyHolder);

        System.out.println("Testando se são os mesmos objetos " + lazy);
        System.out.println("Testando se são os mesmos objetos " + eager);
        System.out.println("Testando se são os mesmos objetos " + lazyHolder);

    }
}
