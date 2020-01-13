package lsp;

/**
 *
 * @author mateu
 */
public class Onibus extends MeiosDeTransporteComMotor{
    @Override
    public void tipoDeMotor(){
        System.out.println("Motor a combustão");
    }
    @Override
    public void ligarMotor(){
        MeiosDeTransporte mt = new MeiosDeTransporte();
        mt.nome = "Ônibus";
        mt.velocidade = 50;
        System.out.println("Ligando o motor de " + mt.nome + " para andar a "+ mt.velocidade +"km/h...");
    }
    
}
