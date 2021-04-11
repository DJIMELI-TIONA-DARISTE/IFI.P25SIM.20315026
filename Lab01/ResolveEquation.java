import java.util.Scanner;
public class ResolveEquation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Double a=null,b,c;
            System.out.println("");
            System.out.println("*******RESOUDRE UNE EQUATION DE PREMIER DEGRE:ax+b=0 (a≠0)**********");
            System.out.println("*******OU UNE EQUATION DE SECOND DEGRE:ax²+bx+c=0*******************");
            System.out.println("ENTRER 1 POUR UNE EQUATION DE PREMIER DEGRE OU 2 POUR LE SECOND DEGRE");
            int choix = sc.nextInt();
                 if(choix==1)
                 {   
                     do
                     {
                        System.out.println("ENTRER LA VALEUR DE a:");
                        a = sc.nextDouble();  
                     }while(a==0);
                       System.out.println("ENTRER LA VALEUR DE b:");
                        b = sc.nextDouble(); 
                       resourdreEquationdDegre1(a,b);
                 }else if(choix==2)
                 {
                    boolean incorrect;
                    do
                    { 
                        incorrect=false;
                       System.out.println("ENTRER LA VALEUR DE a:");
                      
                      try {
                        a = sc.nextDouble(); 
                      } catch (Exception e) {
                          incorrect=true;
                      }
                       
                    }while(a==0);
                      System.out.println("ENTRER LA VALEUR DE b:");
                       b = sc.nextDouble(); 
                       System.out.println("ENTRER LA VALEUR DE c:");
                       c = sc.nextDouble(); 
                      resourEquationDegre2(a,b,c);
                 }else{
                   System.out.println("ENTRER LA VALEUR CORRECTE");
                 }
                
        } 
        catch (Exception e) {
            
        }
        
    }

    // MES METHODE
    public static void resourdreEquationdDegre1(Double a,Double b){
        Double x;
        x=-b/a;
        System.out.println("L'EQUATION: "+a+"x+ "+b+" = 0 \n A POUR SOLUTION x="+x);
    }
    public static void resourEquationDegre2(Double a, Double b,Double c){
        //Math.sqrt();
        Double delta;
        Double z= a*c;
        delta=(b*b)-4*z;
        if(delta>0){
            Double z1,z2 ;
            z1=(-b-Math.sqrt(delta))/2*a;
            z2=(-b+Math.sqrt(delta))/2*a;
            System.out.println("L'EQUATION A POUR SOLUTION X={"+z1+","+z2+"}");

        }else if(delta==0)
        {
            Double z0;
            z0=-b/2*a;
        }
        else{
            System.out.println("INFINITE DE SOLUTION"); 
        }
    }

}