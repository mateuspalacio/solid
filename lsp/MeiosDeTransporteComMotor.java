package lsp;

/**
 *
 * @author mateu
 */
public class MeiosDeTransporteComMotor extends MeiosDeTransporte implements Motor{

    @Override
    public void tipoDeMotor() {
        
    }
    public void ligarMotor(){
        System.out.println("Motor ligado, locomoção começando");
    }
    
}
