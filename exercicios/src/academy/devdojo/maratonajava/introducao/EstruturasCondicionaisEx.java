package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisEx {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double taxValue;

        System.out.println("Qual seu salario anual ?");
        double income = sc.nextDouble();

        if (income <= 34712){
            taxValue = income * 0.097;
        } else if (income <= 68507) {
            taxValue = income * 0.3735;
        } else {
            taxValue = income * 0.4950;
        }

        System.out.println("Voce pagara: " + taxValue + " de imposto de renda anual");

    }
}
