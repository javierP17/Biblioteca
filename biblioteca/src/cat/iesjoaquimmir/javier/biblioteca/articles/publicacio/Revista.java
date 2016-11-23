
package cat.iesjoaquimmir.javier.biblioteca.articles.publicacio;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;

public class Revista extends Publicacio {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
    private String issn;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public String getIssn() {
                return issn;
            }
            
            private void setIssn(String issn) {
                this.issn = issn;
            }   
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
            public Revista(String titol, String autor, Categoria categoria, int NumPagines, String issn){
                super(titol, autor, categoria, NumPagines);
                this.setIssn(issn);
                
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
             @Override
            public String toString() {
            return String.format("DADES REVISTA:\n"
                    + "issn de la Revista: %s\n"
                    + "%s\n", getIssn(),
                     super.toString());
            }
         //</editor-fold>
    //</editor-fold>  
}
