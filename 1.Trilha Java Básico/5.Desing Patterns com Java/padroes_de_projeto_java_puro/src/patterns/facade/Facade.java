package patterns.facade;

import subsystem1.crm.CRMService;
import subsystem2.cep.CepApi;

public class Facade {

    //interface de uso do facade
    public void migraCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }

}
