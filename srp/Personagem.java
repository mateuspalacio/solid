package srp;

/**
 *
 * @author mateu
 */
public class Personagem {
    public String nome;
    public int idade;
    public String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
   
    public Personagem(String nome, int idade, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
    }
    
}
