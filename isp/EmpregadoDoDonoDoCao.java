package isp;


/**
 *
 * @author mateu
 */
public class EmpregadoDoDonoDoCao implements BanharCao, PassearCao{

    @Override
    public void banhaOCao() {
        System.out.println("O empregado do dono do cão leva este para tomar banho no pet shop. Normalmente o empregado do dono do cão é o filho desta pessoa.");
    }

    @Override
    public void passearOCao() {
        System.out.println("O filho do dono do cão levou o doggo para passear no parque.");
    }
    

    
}
