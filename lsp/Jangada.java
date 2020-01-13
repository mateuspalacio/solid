package lsp;

/**
 *
 * @author mateu
 */
public class Jangada extends MeiosDeTransporteSemMotor{
    @Override
    public void comecarLocomocao(){
        MeiosDeTransporte mt = new MeiosDeTransporte();
        mt.nome = "Jangada";
        mt.velocidade = 3;
        System.out.println("Começando a movimentar em " + mt.nome + " a "+ mt.velocidade +"km/h...");
    }
    @Override
    public void tipoDeLocomocao(){
        System.out.println("Barco a vela");
    }
    
}
