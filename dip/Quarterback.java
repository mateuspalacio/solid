package dip;

/**
 *
 * @author mateu
 */
public class Quarterback implements Jogador {

    @Override
    public void executaFuncaoNoCampo(String nome) {
        System.out.println("O Quarterback " + nome +" lançou a bola para seu recebedor fazer touchdown.");
    }

}
