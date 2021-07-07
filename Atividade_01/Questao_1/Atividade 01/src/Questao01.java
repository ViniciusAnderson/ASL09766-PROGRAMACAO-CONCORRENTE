import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        // TODO code application logic here

        int a[] = new int[10];
        int i=0;
        int j=0;
        int soma;
        boolean bol=false;


        Scanner scan = new Scanner(System.in);  /*Numeros do Array*/

        for(i=0;i<10;i++){
            System.out.println("Digite um número:");
            a[i]= scan.nextInt();
        }

        System.out.println();
        System.out.println("Digite o valor Soma"); /*Qual o valor da Soma*/
        soma = scan.nextInt();

        /*Fazendo as somas para comparar*/

        for(i=0;i<10;i++){  //percorre o vetor
            for(j=9;j>i;j--){

                bol = (a[i]+a[j]== soma)?true:false;        //validação da comparação

                if(bol)
                    break;  //para o primeiro for caso bol seja verdadeiro
            }
               if(bol)
                 break; //para o segundo for caso bol seja verdadeiro
        }


        System.out.println("SOMA: " +soma); /*Imprime resultado*/
        if(bol){  //se bol for true mostra os valores
            System.out.println("numero 1: " +a[i]+" + numero 2: " + a[j]);
            System.out.println("Resultado " + bol);
        }
        if(bol==false) {  //se bol for true mostra os valores
            System.out.println(" Falso, não existe nenhuma combinação de dois elementos que some : " + soma);
        }


    }
}
