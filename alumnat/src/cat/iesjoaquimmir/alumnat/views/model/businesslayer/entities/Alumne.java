package cat.iesjoaquimmir.alumnat.views.model.businesslayer.entities;


public class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
        private int edat;
        private String nom;
        private String dni;
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
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructores">
        public Alumne(int edat, String nom, String dni){
                this.setEdat(edat);
                this.setNom(nom);
                this.setDni(dni);
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
    //</editor-fold>
   //</editor-fold>
    
}
