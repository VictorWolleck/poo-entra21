package listaArray;

import java.util.Scanner;

public class ListaArray1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valores[] = new int[10];
		int contadordepares = 0;

		valores[0] = 0;
		valores[1] = 11;
		valores[2] = 44;
		valores[3] = 22;
		valores[4] = 33;
		valores[5] = 4;
		valores[6] = 5;
		valores[7] = 6;
		valores[8] = 2;
		valores[9] = 4;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 == 0 && valores[i] != 0) {
				System.out.println(valores[i]);
				contadordepares++;
			}
			
		}
		System.out.println("O número de pares no Array valores é:" + contadordepares);
	}
}
