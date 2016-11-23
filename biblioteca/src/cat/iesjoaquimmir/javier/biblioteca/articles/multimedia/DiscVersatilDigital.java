
package cat.iesjoaquimmir.javier.biblioteca.articles.multimedia;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;


public class DiscVersatilDigital extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
    private String isan;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public String getIsan() {
                return isan;
            }
            
            private void setIsan(String isan) {
                this.isan = isan;
            }   
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
            public DiscVersatilDigital(String titol, String autor, Categoria categoria, String durada, String isan){
                super(titol, autor, categoria, durada);
                this.setIsan(isan);
                
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
            @Override
            public String toString() {
            return String.format("DADES DVD:\n"
                    + "isan del Dvd: %s\n"
                    + "%s\n", getIsan(),
                     super.toString());
            }
         //</editor-fold>
    //</editor-fold> 
}
