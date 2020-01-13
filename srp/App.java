package srp;

/**
 *
 * @author mateu
 */
public class App {
    public static void main(String[] args){
        System.out.println("Esta classe cria e exibe um personagem detalhado por você.");
        System.out.println("");
        PersonagemPrint pp = new PersonagemPrint();
        pp.criaPersonagem();
    }
}
