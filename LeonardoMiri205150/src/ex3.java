import java.util.Random;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numcid;

		System.out.println("Insira o número de cidades--> ");
		numcid = teclado.nextInt();

		String[] cidades = new String[numcid];
		
		teclado.nextLine();

		for (int i = 0; i < numcid; i++) {

			System.out.println("\nInsira o nome da cidade--> ");
			cidades[i] = teclado.nextLine();
		}

		tempovoo(cidades, numcid);
	

	}

	public static void tempovoo(String[] cidades, int numcid) {

		Random gerador = new Random();

		int[] x = new int[((numcid * numcid) - numcid) / (2)];
		
		for (int j = 0; j < x.length; j++) {

			x[j] = gerador.nextInt(1, 10);
		}
		
		print (x,numcid,cidades);
		
	}
	
	public static void print (int [] x, int numcid, String [] cidades) {
		
		for (int j = 0; j < x.length; j++) {

			System.out.println("Tempo de voo entre as cidades(respectivamente)");
			System.out.println(x[j] + " hora(s)");
		}
		
		System.out.println("Tempo de voo entre " + cidades[0] + " e " + cidades[1] + " : " + x[0]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[0] + " e " + cidades[2] + " : " + x[1]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[0] + " e " + cidades[3] + " : " + x[2]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[0] + " e " + cidades[4] + " : " + x[3]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[0] + " e " + cidades[5] + " : " + x[4]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[0] + " e " + cidades[6] + " : " + x[5]+ " hora(s)");
		
		System.out.println("Tempo de voo entre " + cidades[1] + " e " + cidades[2] + " : " + x[6]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[1] + " e " + cidades[3] + " : " + x[7]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[1] + " e " + cidades[4] + " : " + x[8]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[1] + " e " + cidades[5] + " : " + x[9]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[1] + " e " + cidades[6] + " : " + x[10]+ " hora(s)");
		
		System.out.println("Tempo de voo entre " + cidades[2] + " e " + cidades[3] + " : " + x[11]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[2] + " e " + cidades[4] + " : " + x[12]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[2] + " e " + cidades[5] + " : " + x[13]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[2] + " e " + cidades[6] + " : " + x[14]+ " hora(s)");
		
		System.out.println("Tempo de voo entre " + cidades[3] + " e " + cidades[4] + " : " + x[15]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[3] + " e " + cidades[5] + " : " + x[16]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[3] + " e " + cidades[6] + " : " + x[17]+ " hora(s)");
		
		System.out.println("Tempo de voo entre " + cidades[4] + " e " + cidades[5] + " : " + x[18]+ " hora(s)");
		System.out.println("Tempo de voo entre " + cidades[4] + " e " + cidades[6] + " : " + x[19]+ " hora(s)");
		
		System.out.println("Tempo de voo entre " + cidades[5] + " e " + cidades[6] + " : " + x[20]+ " hora(s)");
		
		System.out.println("\nNão fiz a letra d");
		
		
	}

}
