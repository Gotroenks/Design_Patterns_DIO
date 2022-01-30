package one.digitalinnovation.gof.Facade;

import subsistema.crm.crmService;
import subsistema2.cep.cepAPI;

public class facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = cepAPI.getInstancia().recCidade(cep);
        String estado = cepAPI.getInstancia().recEstado(cep);

        crmService.gravarCliente(nome, cep, cidade, estado);
    }
}
