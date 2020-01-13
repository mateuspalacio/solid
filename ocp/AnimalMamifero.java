package ocp;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class AnimalMamifero extends Animal {

    private String tipoDeLocomocao;

    public String getTipoDeLocomocao() {
        return tipoDeLocomocao;
    }

    public void setTipoDeLocomocao(String tipoDeLocomocao) {
        this.tipoDeLocomocao = tipoDeLocomocao;
    }

    public AnimalMamifero(String tipoDeLocomocao, String nome, String tipo, int idade) {
        super(nome, tipo, idade);
        this.tipoDeLocomocao = tipoDeLocomocao;
    }

    public AnimalMamifero() {

    }

    public void criaMamifero() {
        Scanner name = new Scanner(System.in);
        System.out.println("Digite o nome do animal");
        String n = name.next();

        Scanner type = new Scanner(System.in);
        System.out.println("Digite o tipo do animal");
        String t = type.next();

        Scanner age = new Scanner(System.in);
        System.out.println("Digite a idade do animal");
        int i = age.nextInt();

        Scanner movement = new Scanner(System.in);
        System.out.println("Digite o tipo de locomoção desse animal");
        String l = movement.next();

        AnimalMamifero a = new AnimalMamifero(l, n, t, i);
        System.out.println("Nome do mamífero: " + a.nome);
        System.out.println("Tipo do mamífero: " + a.tipo);
        System.out.println("Idade do mamífero: " + a.idade);
        System.out.println("Este mamífero se movementa através do/a: " + a.tipoDeLocomocao);
    }

}
