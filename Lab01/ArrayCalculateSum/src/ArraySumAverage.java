import java.util.Scanner;

public class ArraySumAverage {
	 
	  
	  
	   public static void main(String[] args)
	   {
		   Integer a=null;
	        boolean incorrect;
	                    do
	                    { 
	                    	Scanner sc = new Scanner(System.in);
	                        incorrect=false;
	                       System.out.println("ENTRER LA TAILLE DU TABLEAU :");
	                      
	                      try {
	                        a = sc.nextInt(); 
	                      } catch (Exception e) {
	                          incorrect=true;
	                      }
	                       
	                    }while(incorrect || a<=0);
		   
	        int arr[];
	        boolean incorrect2;
	                    do
	                    {
	                      try {
	                    	incorrect2=false;
	                        arr = new int[a];
	                        int elt;
	                        int total=0;
	                        for(int i = 0; i<a; i++) {
	                        	Scanner sc2 = new Scanner(System.in);
	                        	System.out.println("ENTRER L'ELEMENT "+(i+1)+" DU TABLEAU");
	                        	elt = sc2.nextInt();
	                        	total +=elt;
	                        	arr[i]=elt;
	                        }
	                        System.out.println("VOTRE TABLEAU NON TRIE :");
	                        displayTab(arr);
	                        System.out.println("VOTRE TABLEAU TRIE :");
	                        tri_bulle(arr);
	                        displayTab(arr); 
	                        System.out.println("LA SOMME TOTALE DES ELTS DU TABLEAU EST DE: "+total);
	                        System.out.println("LA MOYENNE TOTALE DES ELTS DU TABLEAU EST DE: "+total/a);
	                        
	                      } catch (Exception e) {
	                          incorrect2=true;
	       
	                      }
	                       
	                    }while(incorrect2);
	    }
	   static void tri_bulle(int[] tab)
	   {  
	        int taille = tab.length;  
	        int tmp = 0;  
	        for(int i=0; i < taille; i++) 
	        	{
	                for(int j=1; j < (taille-i); j++)
	                	{  
	                        if(tab[j-1] > tab[j])
	                        {
                                //echanges des elements
                                tmp = tab[j-1];  
                                tab[j-1] = tab[j];  
                                tab[j] = tmp;  
	                        }
	                	}
	        	}
	   }
	   
	   static void displayTab(int[] tab)
	   {    
	        for(int i=0; i < tab.length; i++)
	        {
	                System.out.print(tab[i] + " ");  
	        }
	        System.out.println();
	   }
	        
	}
