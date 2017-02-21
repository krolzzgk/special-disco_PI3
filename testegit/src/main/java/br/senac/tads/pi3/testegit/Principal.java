package br.senac.tads.pi3.testegit;

/**
 *
 * @author karolina.gkallajian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i == 0 || i == 10) {
                System.out.println("**********************");
            } else if (i == 5) {
                System.out.println("*  Boa noite, mundo  *");
            } else {
                System.out.println("*                    *");
            }

        }

    }

}
