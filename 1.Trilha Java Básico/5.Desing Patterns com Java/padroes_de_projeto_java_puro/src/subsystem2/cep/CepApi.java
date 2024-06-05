package subsystem2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        //dado mockado
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        //dado mockado
        return "SP";
    }
}
