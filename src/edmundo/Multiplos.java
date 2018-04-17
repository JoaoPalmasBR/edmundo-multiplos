package edmundo;

import static java.lang.System.in;
import java.util.Scanner;

public class Multiplos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        String result;
        Scanner leitor = new Scanner(in);
        System.out.println("Digite um Numero");
        x = leitor.nextInt();
        //
        boolean mult2 = false;
        boolean mult3 = false;
        boolean mult5 = false;
        if(x%2==0){
            mult2 = true;
        }
        if(x%3==0){
            mult3 = true;
        }
        if(x%5==0){
            mult5 = true;
        }
        //
        if (!mult2 && !mult3 && !mult5){
            System.out.println("NAO Multiplo simultaneamente de 2, de 3 e de 5");
        }
        else{
        if (mult2 && mult3 && mult5){
            System.out.println("Multiplo simultaneamente de 2, de 3 e de 5");
        }
        else{
            if (mult2 && mult3){
            System.out.println("Multiplo simultaneamente de 2 e de 3");
            }
            else{
                boolean exclusivo = false;
                if (mult2 && !mult3 && !mult5){
                    System.out.println("Multiplo apenas de 2");
                    exclusivo = true;
                }
                if (!mult2 && mult3 && !mult5){
                    System.out.println("Multiplo apenas de 3");
                    exclusivo = true;
                }
                if (!mult2 && !mult3 && mult5){
                    System.out.println("Multiplo apenas de 5");
                    exclusivo = true;
                }
                if(!exclusivo){
                    System.out.println(x+" não é exclusivamente multiplo de ninguem");
                }
            }
            
        
        }
        
        
        }
        
    }
}

