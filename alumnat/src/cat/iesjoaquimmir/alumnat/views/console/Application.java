
package cat.iesjoaquimmir.alumnat.views.console;
import cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities.Alumne;
import cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities.Domicili;
import cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities.Modul;
import java.util.ArrayList;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        
        int opc;
        Scanner inici = new Scanner(System.in);
        do{
            System.out.println("\nEscull una opció:\n1.Edat-Nom-Dni\n2.dni\n3.Edat-Nom\n4.Dni-Edat\n5.Nom-Dni\n6.Pt8a\n7.Surt\n");
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
                case 6:
                    f();
                    break;
            } 
          }while(opc!=7);
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
      private static void f(){
               //Generem l'ArrayList
               String carrer;
               int num;
               String pis;
               String cp;
               String poblacio;
               String provincia;
               String nom;
               String c1;
               String c2;
               String dni;
               int edat;
               int telefonQ;
               String nomM;
               String descM;
               String horesM;
                //Array de telèfons
                ArrayList<String> telefon = new ArrayList<String>();  
                //Array de mòduls
                ArrayList<Modul> modul = new ArrayList<Modul>();
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el nom i el dni de l'alumne:
                    System.out.printf("Introdueix el nom ");
                    nom = pregunta.next();
                    System.out.printf("Introdueix el primer cognom ");
                    c1 = pregunta.next();
                    System.out.printf("Introdueix el segon cognom ");
                    c2 = pregunta.next();
                    System.out.printf("Introdueix la edat ");
                    edat = pregunta.nextInt();
                    System.out.printf("Introdueix el dni ");
                    dni = pregunta.next();
                    System.out.printf("Introdueix la provincia ");
                    provincia = pregunta.next();
                    System.out.printf("Introdueix la població ");
                    poblacio = pregunta.next();
                    System.out.printf("Introdueix el codi postal ");
                    cp = pregunta.next();
                    System.out.printf("Introdueix el carrer ");
                    carrer = pregunta.next();
                    System.out.printf("Introdueix la número ");
                    num = pregunta.nextInt();
                    System.out.printf("Introdueix el pis ");
                    pis = pregunta.next();
                    System.out.printf("Quants telèfons vols introduïr? ");
                    telefonQ = pregunta.nextInt();
                    for(int o=0;o<telefonQ;o++){
                    System.out.printf("Introdueix el telefon ");
                    telefon.add(pregunta.next());
                    }
                    //System.out.printf("Introdueix un segon telefon ");
                    //telefon.add(pregunta.next());
                    
                    //Introducció de mòduls a l'array
                    System.out.printf("Introdueix el nom del mòdul ");
                    nomM = pregunta.next();
                    System.out.printf("Introdueix la descripció del mòdul ");
                    descM = pregunta.next();
                    System.out.printf("Introdueix la durada en hores del mòdul ");
                    horesM = pregunta.next();                  
                    Modul modul1 = new Modul(nomM,descM,horesM);
                    modul.add(modul1);
                    
                    System.out.printf("Introdueix el nom del mòdul 2 ");
                    nomM = pregunta.next();
                    System.out.printf("Introdueix la descripció del mòdul 2 ");
                    descM = pregunta.next();
                    System.out.printf("Introdueix la durada en hores del mòdul 2 ");
                    horesM = pregunta.next();                  
                    Modul modul2 = new Modul(nomM,descM,horesM);
                    modul.add(modul2);
                    
                
                Domicili domicili = new Domicili(carrer, num, pis, cp, poblacio, provincia);
                Alumne alumne = new Alumne( edat,nom,dni, c1,c2 ,telefon,domicili,modul);
                //mostra el format cognom1 cognom2, nom
                System.out.println(alumne.getNomComplert());
                //Pinta el mateix que la linia anterior
                System.out.println(alumne.getDomicili().getDomiciliAmigable());
                //Industria 188, 2o 1a, 08025, Badalona (Barcelona)
                System.out.println(domicili.getDomiciliAmigable());
                System.out.println(alumne.getMajorMenor());
                
                //imprimeix els telefons de l'alumne
                for (int i=0; i<alumne.getTelefon().size();i++){
                   System.out.printf("Telèfon %d: %s\n",i,alumne.getTelefon().get(i));
                }
                
                //imprimeix els mòduls de l'alumne
                for (int i=0; i<alumne.getModul().size();i++){
                   System.out.printf("Mòdul %d:\n Nom del mòdul: %s\n Descripció del mòdul: %s\n hores del mòdul: %s\n",i,
                   alumne.getModul().get(i).getNom(), 
                   alumne.getModul().get(i).getDescripcio(), 
                   alumne.getModul().get(i).getDurada());
                }
      } 
}