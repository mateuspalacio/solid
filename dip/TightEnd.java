package dip;

/**
 *
 * @author mateu
 */
public class TightEnd implements Jogador {

    @Override
    public void executaFuncaoNoCampo(String nome) {
        System.out.println("O Tight End " + nome +" carregou o time! Bloqueando pro running back correr e pro quarterback passar, além de receber o passe do quarterback.");
    }

}
