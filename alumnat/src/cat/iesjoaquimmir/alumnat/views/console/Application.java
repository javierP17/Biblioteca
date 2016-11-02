
package cat.iesjoaquimmir.alumnat.views.console;
import cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities.Alumne;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        
        int opc;
        Scanner inici = new Scanner(System.in);
        do{
            System.out.println("\nEscull una opció:\n1.Edat-Nom-Dni\n2.dni\n3.Edat-Nom\n4.Dni-Edat\n5.Nom-Dni\n6.Surt\n");
            opc = inici.nextInt();
            switch (opc){
                case 1:
                    a();
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    c();
                    break; 
                case 4:
                    d();
                    break;
                case 5:
                    e();
                    break;
            } 
          }while(opc!=6);
    }
     private static void a(){
                //variables
                String Nom;
                String Dni;
                int Edat;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el la edat, el nom i el dni de l'alumne:
                    System.out.printf("Introdueix la edat ");
                    Edat = pregunta.nextInt();
                    System.out.printf("Introdueix el nom ");
                    Nom = pregunta.next();
                    System.out.printf("Introdueix el Dni ");
                    Dni = pregunta.next();
                    //Objecte Opció A
                    Alumne opcA = new Alumne(Edat,Nom,Dni);
                //imprimeix el resultat:
                System.out.printf(opcA.getSalutacio());
        }
       private static void b(){
                //variables
                String Dni;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el la edat, el nom i el dni de l'alumne:
                    System.out.printf("Introdueix el Dni ");
                    Dni = pregunta.next();
                    //Objecte Opció A
                    Alumne opcA = new Alumne(Dni);
                //imprimeix el resultat:
                System.out.printf(opcA.getSalutacio());
       }
       private static void c(){
                //variables
                String Nom;
                int Edat;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta la edat i el nom de l'alumne:
                    System.out.printf("Introdueix la edat ");
                    Edat = pregunta.nextInt();
                    System.out.printf("Introdueix el nom ");
                    Nom = pregunta.next();
                    //Objecte Opció A
                    Alumne opcA = new Alumne(Edat,Nom);
                //imprimeix el resultat:
                System.out.printf(opcA.getSalutacio());
       }
         private static void d(){
                //variables
                String Dni;
                int Edat;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el dni i  la edat de l'alumne:
                    System.out.printf("Introdueix el dni ");
                    Dni = pregunta.next();
                    System.out.printf("Introdueix la edat ");
                    Edat = pregunta.nextInt();
                    //Objecte Opció A
                    Alumne opcA = new Alumne(Dni,Edat);
                //imprimeix el resultat:
                System.out.printf(opcA.getSalutacio());
         }
      private static void e(){
                //variables
                String Dni;
                String Nom;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el nom i el dni de l'alumne:
                    System.out.printf("Introdueix el nom ");
                    Nom = pregunta.next();
                    System.out.printf("Introdueix el dni ");
                    Dni = pregunta.next();
                    //Objecte Opció A
                    Alumne opcA = new Alumne(Nom,Dni);
                //imprimeix el resultat:
                System.out.printf(opcA.getSalutacio());
      }      
}