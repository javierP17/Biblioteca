
package cat.iesjoaquimmir.javier.biblioteca.articles.multimedia;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;


public class DiscCompacte extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
    private String ismn;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public String getIsmn() {
                return ismn;
            }
            
            private void setIsmn(String ismn) {
                this.ismn = ismn;
            }   
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
             public DiscCompacte(String titol, String autor, Categoria categoria, String durada, String ismn){
                super(titol, autor, categoria, durada);
                this.setIsmn(ismn);
                
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
            @Override
            public String toString() {
            return String.format("DADES CD:\n"
                    + "ismn del Cd: %s\n"
                    + "%s\n", getIsmn(),
                     super.toString());
            }
         //</editor-fold>
    //</editor-fold>  
}
