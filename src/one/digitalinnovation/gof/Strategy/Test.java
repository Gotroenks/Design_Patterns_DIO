package one.digitalinnovation.gof.Strategy;

public class Test {

    public static void main(String[] args) {

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robozinho robo = new Robozinho();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(normal);
        robo.mover();
    }
}
