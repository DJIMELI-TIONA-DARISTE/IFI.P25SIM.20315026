import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=null;
        boolean incorrect;
                    do
                    { 
                    	Scanner sc = new Scanner(System.in);
                        incorrect=false;
                       System.out.println("ENTRER LA TAILLE DU TRIANGLE :");
                      
                      try {
                        a = sc.nextInt(); 
                        print(a);
                      } catch (Exception e) {
                          incorrect=true;
       
                      }
                       
                    }while(incorrect || a<=0);
    }
	
	public static void print(int a) {
		for(int i=0;i<a;i++) {
			 //for(int j=0; j<=i; j++) {
				 printLine(i, a);
				 //System.out.print("*");
			// }
			 System.out.println();
			}
	}
	public static void printLine(int n, int a) {
		
		StringBuilder sb = new StringBuilder();
		
		int taille = 2*a-1;
	
		String[] sb2 = new String[taille];
		
		for(int i =0; i<taille; i++) {
			sb2[i]=" ";
		}
		
		int ref = (taille/2);
		sb2[ref]="*";
		for(int j = 1; j<=n; j++) {
			sb2[ref+j]="*";
			sb2[ref-j]="*";
		}
		
		for(int i =0; i<taille; i++) {
			sb.append(sb2[i]);
		}
		
		System.out.println(sb.toString());

	}
	
}


