package cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities;
import cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities.Domicili;
import cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities.Modul;
import java.util.ArrayList;


public class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
        private int edat;
        private String nom;
        private String dni;
        private String cognom1;
        private String cognom2;
        //private String telefon;
        private ArrayList<String> telefon;
        private ArrayList<Modul> modul;
        private Domicili domicili;
        public static final int EDAT=99;
        public static final String DNI="00000000A";
        public static final String NOM="Anonymous";
   //</editor-fold>
   //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
     
        public int getEdat() {
            return edat;
        }

        public void setEdat(int edat) {
            if (edat<=0){
                    throw new IllegalArgumentException(
                        String.format("No pots introduïr aquesta edat per l'alumne: %d ", edat )); 
                }
            this.edat = edat;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
              if (!nom.matches("^[A-Z-a-z]+$")){
                    throw new IllegalArgumentException(
                        String.format("El nom %s no és correcte", nom )); 
                }
            this.nom = nom;
        }

        public String getDni() {
            return dni;
        }


        public void setDni(String dni) {
            if (!dni.matches("^[0-9]{8}+[A-Z]$")){
                    throw new IllegalArgumentException(
                        String.format("El dni %s no és correcte", dni )); 
                }
            this.dni = dni;
        }
        
        public String getCognom1() {
            return cognom1;
        }


        public void setCognom1(String cognom1) {
            this.cognom1 = cognom1;
        }
        public String getCognom2() {
            return cognom2;
        }


        public void setCognom2(String cognom2) {
            this.cognom2 = cognom2;
        }
        /*public String getTelefon() {
            return telefon;
        }


        public void setTelefon(String telefon) {
                if (telefon== null){
                    throw new IllegalArgumentException(
                        String.format("El Telefon no pot ser nul", telefon )); 
                }
            this.telefon = telefon;
        }*/
        public ArrayList<String> getTelefon() {
            return telefon;
        }
        public void setTelefon(ArrayList<String> telefon) {
            this.telefon = telefon;
        }
         public Domicili getDomicili() {
            return domicili;
        }


        public void setDomicili(Domicili domicili) {
            this.domicili = domicili;
        }
        //Getters i setters de l'array de moduls de tipus de la classe mòdul
        public ArrayList<Modul> getModul() {
           return modul;
        }

        public void setModul(ArrayList<Modul> modul) {
           this.modul = modul;
        }
        
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructores">
         public Alumne(int edat, String nom, String dni, String cognom1, String cognom2, ArrayList<String> telefon, Domicili domicili,ArrayList<Modul> modul){
                this.setEdat(edat);
                this.setNom(nom);
                this.setDni(dni);
                this.setCognom1(cognom1);
                this.setCognom2(cognom2);
                this.setTelefon(telefon);
                this.setDomicili(domicili);
                this.setModul(modul);
                
            }
         public Alumne(int edat, String nom, String dni, String cognom1, String cognom2, ArrayList<String> telefon){
                this(edat,nom,dni,cognom1,cognom2,telefon,null,null);          
            }
        public Alumne(int edat, String nom, String dni){
                /*this.setEdat(edat);
                this.setNom(nom);
                this.setDni(dni);*/
                this(edat,nom,dni,null,null,null);
            }
            //Sobrecaàrrega del constructor
            public Alumne(String dni){
                this(EDAT,NOM,dni);
            }
            public Alumne(int edat,String nom){
                this(edat,nom,DNI);
            }
            public Alumne(String dni,int edat){
                this(edat,NOM,dni);
            }
            public Alumne(String nom, String dni){
                this(EDAT,nom,dni);
            }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="mètodes d'objecte">
            public String getSalutacio(){
                return String.format("Hola sóc en/la %s amb identificació %s i tinc %d anys",
                getNom(), getDni(), getEdat());
            }
            public String getNomComplert(){
                return String.format("Nom complert de l'alumne: %s %s %s ",
                getCognom2(), getCognom1(), getNom());
            }
            public String getMajorMenor(){
                if(getEdat()<18){
                return String.format("L'alumne %s amb edat %s és menor d'edat",getNom(),
                getEdat());
                }else{
                return String.format("L'alumne %s amb edat %s és major d'edat",getNom(),
                getEdat());  
                }
            }
            
            /*//mètode Array de telefons
            public String getArray(){
                for (int i=0; i<getTelefon().size();i++){
                   return String.format("%s",getTelefon().get(i));
                }
            }*/
    //</editor-fold>
   //</editor-fold>

 


    
}
