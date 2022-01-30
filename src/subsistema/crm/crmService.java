package subsistema.crm;

public class crmService {

    private crmService() {
        super();
    }


    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema Crm" +
                            "\n" + nome + "\n" + cep + "\n" + cidade + "\n" + estado);
    }
}
