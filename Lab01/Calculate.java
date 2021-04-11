/*calculate sum, difference , product, and quotient of 2 double numbers which
                  are entered by users.*/
import java.io.*;
public class Calculate {
    
    public static void main(String[] args){
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      try {

        System.out.println("ENTRER LE PREMIER NOMBRE");
        String strNum1 = br.readLine();
        Double num1 = Double.parseDouble(strNum1);
        System.out.println("ENTRER LE DEUXIEME NOMBRE");
        String strNum2 = br.readLine();
        Double num2 = Double.parseDouble(strNum2);
        sum(num1,num2);
        multiplication(num1,num2);
        soutraction(num1,num2);
        modulo(num1,num2);
      } 
      catch (Exception e) 
      {
        System.out.println("entrer une valeur correcte");
      }
    }
      // MES METHODES
    public static void sum(Double num1, Double num2) 
    {
        Double somme=num1+num2;
       System.out.println(num1+" + "+num2+" = "+somme);
    }
    public static void multiplication(Double num1, Double num2) 
    {
        Double mult=num1*num2;
       System.out.println(num1+" * "+num2+" = "+mult);
    }

    public static void soutraction(Double num1, Double num2) 
    {
        Double soutrac=num1-num2;
       System.out.println(num1+" - "+num2+" = "+soutrac);
    }

    public static void modulo(Double num1, Double num2)
    {
        Double resol=num1%num2;
        System.out.println(num1+" % "+num2+" = "+resol);
    }
    
}
