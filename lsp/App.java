package lsp;

/**
 *
 * @author mateu
 */
public class App {
    public static void main(String[] args){
        Onibus o = new Onibus();
        o.ligarMotor();
        
        Jangada j = new Jangada();
        j.comecarLocomocao();
    }
}
