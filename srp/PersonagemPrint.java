package srp;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class PersonagemPrint {
    public void criaPersonagem(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do personagem");
        String n = s.next();
        
        Scanner c = new Scanner(System.in);
        System.out.println("Digite a idade do personagem");
        int i = c.nextInt();
        
        Scanner a = new Scanner(System.in);
        System.out.println("Digite a especialidade do personagem");
        String e = a.next();
       
        Personagem p = new Personagem(n,i,e);
        System.out.println("Detalhes do personagem: ");
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Especialidade: " + p.especialidade);
    }
}
