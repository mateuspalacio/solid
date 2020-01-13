package isp;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class App {
        public void oQueEleFez(){
            DonoDeCao dc = new DonoDeCao();
            EmpregadoDoDonoDoCao edc = new EmpregadoDoDonoDoCao();
        Scanner i = new Scanner(System.in);
        System.out.println("O que houve com o cão hoje? Digite o número da opção");
            System.out.println("1 - O cão foi tomar banho");
            System.out.println("2 - O cão foi passear");
            System.out.println("3 - O cão brincou hoje");
            System.out.println("4 - O cão foi alimentado hoje");
        int in = i.nextInt();
            switch (in) {
                case 1:
                    edc.banhaOCao();
                    break;
                case 2:
                    edc.passearOCao();
                    break;
                case 3:
                    dc.brincaComOCao();
                    break;
                case 4:
                    dc.alimentaOCao();
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
    }
    public static void main(String[] args){
        App a = new App();
        a.oQueEleFez();
    }
}
