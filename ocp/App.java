package ocp;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class App {

    public void choiceInput() {
        Scanner i = new Scanner(System.in);
        System.out.println("Se deseja adicionar um animal qualquer digite 1, se deseja adicionar um mamífero em específico digite 2: ");
        int c = i.nextInt();
        switch (c) {
            case 1:
                Animal a = new Animal();
                a.criaAnimal();
                break;
            case 2:
                AnimalMamifero am = new AnimalMamifero();
                am.criaMamifero();
                break;
            default:
                System.out.println("ERRO");
                break;
        }
    }

    public static void main(String[] args) {
App a = new App();
a.choiceInput();
    }
}
