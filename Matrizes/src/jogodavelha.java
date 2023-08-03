import java.util.Scanner;

public class jogodavelha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int[][] tabela = new int [3][3];
		String cord;
		int x, y;
		int jogadas=9;
		for (int e = 0; e < jogadas; e++) {
			
		System.out.print("Escreva a cordenada que deseja marcar: (formato= 'x-y' )");
        cord = teclado.next();
        String[] cord_aux = cord.split("-");
        x = Integer.parseInt(cord_aux [0]);
        y = Integer.parseInt(cord_aux [1]);
        if(e%2==0) {
        tabela[x][y] = 1;
		}else {
			tabela[x][y]=4;
		   }
        for (int i = 0; i < tabela.length; i++) {

			for (int j = 0; j < tabela[i].length; j++) {

				
				System.out.print(tabela[i][j] + "\t");

			}
			System.out.println();
        }
         vencedor(tabela);
         
         if(vencedor(tabela)==true) {
        	 if(e%2==0) {
        		 System.out.print(" 1 é o vencedor!");
        	 }else {
        		 System.out.println(" 4 é o vencedor!");
        	 }
        	 break;
         }
         if(e==8) {
        	 System.out.println("Empate");
         }
		}
		
		}
public static boolean vencedor(int[][]tabela) {
			boolean v;
            int soma=0;
            int dp=0, ds=0;
			for (int i = 0; i < tabela.length; i++) {

				for (int j = 0; j < tabela[i].length; j++) {
					soma= soma +tabela[i][j];
				}if(soma==3 || soma==12) {
					v=true;
					return v;
				}
				soma=0;
				}
			for (int j = 0; j < tabela.length; j++) {

				for (int i = 0; i < tabela[j].length; i++) {
					soma= soma +tabela[i][j];
				}if(soma==3 || soma==12) {
					v=true;
					return v;
				}
				soma=0;
				}
			for (int i = 0; i < tabela.length; i++) {

				for (int j = 0; j < tabela[i].length; j++) {
					if (i == j) {
						
						dp += tabela[i] [j];
					}
			
					if(i + j == tabela.length - 1) {
						
						ds += tabela[i] [j];
					}
					
				}if(dp==3 || dp==12 || ds==3 || dp==12) {
					v=true;
					return v;
				}
				soma=0;
				}
			v=false;
			return v;
	}

}
