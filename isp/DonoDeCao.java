package isp;

/**
 *
 * @author mateu
 */
public class DonoDeCao implements BrincarCao, AlimentarCao {

    @Override
    public void brincaComOCao() {
        System.out.println("O dono do cão brinca com este jogando bolinhas pra pegar.");
    }

    @Override
    public void alimentaOCao() {
        System.out.println("O cão deve ser mantido saudável pelo seu dono, portanto ele foi alimentado com ração.");
    }
    
}
