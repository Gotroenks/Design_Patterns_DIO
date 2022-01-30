package subsistema2.cep;

public class cepAPI {

    private static final cepAPI instancia = new cepAPI();

    private cepAPI() {
        super();
    }

    public static cepAPI getInstancia() {
        return instancia;
    }

    public String recCidade(String cep) {
        return "São Vicente";
    }

    public String recEstado(String cep) {
        return "SP";
    }
}
