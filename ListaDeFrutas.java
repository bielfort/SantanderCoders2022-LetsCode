import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDeFrutas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] frutas = {"Banana", "Maçã", "Abacaxi", "Pitomba", "Acerola"};

        boolean flag = true;



        while(flag){
            System.out.println("Bem vindo ao supermercado, Escolha uma das opções no menu para continuar");
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("1- LISTA DE PROMOÇÃO, 2- COMPRAR," +
                    " 3- MENU PRINCIPAL, 4- SAIR    ");
            int menu = sc.nextInt();
            System.out.println("\n---------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------");


            switch(menu){
                case 1:
                    System.out.println("Os produtos em promoção hoje são: " + Arrays.toString(frutas));
                    break;
                case 2:
                    System.out.println("Digite o nome do produto que deseja comprar: ");
                    String produto = sc.next();
                    if(Arrays.asList(frutas).contains(produto)){
                        System.out.print("O produto informado está em promoção e você receberá um desconto!");
                        System.out.println("\n---------------------------------------------------------------------------");

                    }
                    break;
                case 3:
                    break;
                case 4:

                    System.out.println("Muito Obrigado e volte sempre!");
                    flag = false;
                    break;
            }
        }

    }
}