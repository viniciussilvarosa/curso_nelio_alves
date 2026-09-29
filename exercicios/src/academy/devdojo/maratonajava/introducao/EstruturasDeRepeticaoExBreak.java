package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasDeRepeticaoExBreak {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float carValue;
        float carInstallment;

        System.out.println("Me diga o valor do carro para saber em quantas vezes será parcelado");
        carValue = sc.nextFloat();

        for (int i = 1; i <= carValue; i++) {
            carInstallment = carValue / i;
            if (carInstallment < 1000){
                break;
            }
            System.out.println("Parcela: " + i + " R$ " + carInstallment);
        }

    }
}
