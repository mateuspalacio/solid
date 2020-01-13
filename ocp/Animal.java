package ocp;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Animal {

    public String nome;
    public String tipo;
    public int idade;

    public Animal() {

    }

    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void criaAnimal() {
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite o nome do animal");
        String n = nome.next();

        Scanner tipo = new Scanner(System.in);
        System.out.println("Digite o tipo do animal");
        String t = tipo.next();

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite a idade do animal");
        int i = idade.nextInt();

        Animal a = new Animal(n, t, i);
        System.out.println("Nome do animal: " + a.nome);
        System.out.println("Tipo do animal: " + a.tipo);
        System.out.println("Idade do animal: " + a.idade);
    }
}
