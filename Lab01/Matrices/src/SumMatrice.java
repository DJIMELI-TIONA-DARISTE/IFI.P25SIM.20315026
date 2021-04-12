import java.util.Scanner;
public class SumMatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("******NOUS ALLONS EFFECTUE LA SOMME DE DEUX******");
		System.out.println("         ******MATRICES IDENTIQUE******");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTRER LE NOMBRE DE LIGNE DES MATRICES");
		int Ligne = sc.nextInt();
		System.out.println("ENTRER LE NOMBRE DE COLONNE DES MATRICES");
		int Colonne = sc.nextInt();
		
		int[][] Matrice1 = new int[Ligne][Colonne];
		int[][] Matrice2 = new int[Ligne][Colonne];
		int[][] MatriceSum = new int[Ligne][Colonne];
		ClearConsoleScreen();
		System.out.println("ENTRER LES COORDONNER DE LA PREMIERE MATRICE");
		System.out.println("");
		RemplireMatrice(Ligne,Colonne,Matrice1);
		ClearConsoleScreen();
		System.out.println("");
		System.out.println("ENTRER LES COORDONNER DE LA DEUXIEMME MATRICE");
		System.out.println("");
		RemplireMatrice(Ligne,Colonne,Matrice2);
		ClearConsoleScreen();
		System.out.println("");
		System.out.println("****PREMIERE MATRICE****");
		AfficheMatrice(Ligne,Colonne,Matrice1);
		System.out.println("");
		System.out.println("****DEUXIEMME MATRICE****");
		AfficheMatrice(Ligne,Colonne,Matrice2);
		SumDesMatrice(Ligne,Colonne,MatriceSum,Matrice1,Matrice2);
		System.out.println("");
		System.out.println("*****SOMME DES DEUX MATRICES****");
		AfficheMatrice(Ligne,Colonne,MatriceSum);
		
	}
	

	public static void RemplireMatrice (int ligne, int colone,int[][] matrice) {
		Scanner sc1= new Scanner(System.in);
		for(int i=0;i<ligne;i++) {
			for(int j=0; j<colone;j++) {
				System.out.println("ENTRER LA VALEUR DU COORDONNE{"+i+","+j+"}");
				matrice[i][j]=sc1.nextInt();
				
			}
		}
	}
	
	public static void AfficheMatrice (int ligne, int colone,int[][] matrice) {
		for(int i=0;i<ligne;i++) {
			for(int j=0; j<colone;j++) {
				System.out.print("["+matrice[i][j]+"]");	
			}
			System.out.println("");
		}
	}
	
	public static void SumDesMatrice (int ligne, int colone,int[][] SumMatrice1,int[][] matrice1,int[][] matrice2) {
		for(int i=0;i<ligne;i++) {
			for(int j=0; j<colone;j++) {
				SumMatrice1[i][j]=matrice1[i][j]+matrice2[i][j];		
			}
		}
	}
	
	
	public static void ClearConsoleScreen() {
	    
	        
	        System.out.print("\033[H\033[2J");
	        System.out.flush();
	    
	}

}
