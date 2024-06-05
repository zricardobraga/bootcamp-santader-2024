package patterns.singleton;

public class SingletonLazy {

    private static SingletonLazy intance;

    //construtor privado impede que essa classe não seja instanciada externamente
    private SingletonLazy() {
        //chamada explicida do construtor da classe pai
        super();
    }

    public static SingletonLazy getIntance(){
        if (intance == null) {
            intance = new SingletonLazy();
        }
        return intance;
    }
}
