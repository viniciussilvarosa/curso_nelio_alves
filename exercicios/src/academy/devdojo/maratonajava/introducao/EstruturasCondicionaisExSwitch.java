package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisExSwitch {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de 1 a 7, e te direi se e dia útil ou final de semana");
        byte value = sc.nextByte();

        switch (value){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("dia útil");
                break;
            case 3:
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("dia útil");
                break;
            case 5:
                System.out.println("dia útil");
                break;
            case 6:
                System.out.println("dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("número inválido");
                break;
        }
    }
}
