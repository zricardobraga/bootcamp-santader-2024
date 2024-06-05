package subsystem1.crm;

public class CRMService {

    //não permite a classe se instanciada
    private CRMService() {
        super();
    }

    public static void gravarCliente(String name, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
