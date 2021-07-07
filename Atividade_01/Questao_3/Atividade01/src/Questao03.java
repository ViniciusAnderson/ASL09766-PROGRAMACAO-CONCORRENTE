import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        // TODO code application logic here

        int[] andar = new int[3]; // andares
        int tempo;
        int andardacafeteira=2;     //cafeteira fica no segundo

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a quantidade de funcionario dos andares "   /*Entrada*/
                + "1,2 e 3 respectivamente");
        andar[0] = scan.nextInt();
        andar[1] = scan.nextInt();
        andar[2] = scan.nextInt();

        /*Verificando o tempo gasto em cada andar*/

        /*2° Andar*/
        tempo = ( andar[0]*2 ) + ( andar[2]*2 );

        /*1° Andar*/
        if(tempo >( andar[1]*2 )+( andar[2]*4 )){

            tempo =( andar[1]*2 )+( andar[2]*4 );
            andardacafeteira=1;

        }else{ /*3° Andar*/
            if(tempo > ( andar[0]*4 )+( andar[1]*2 )){

                tempo =( andar[0]*4 )+( andar[1]*2 );
                andardacafeteira=3;

            }
        }

        System.out.println("Minutos: "+tempo);
    }
}
