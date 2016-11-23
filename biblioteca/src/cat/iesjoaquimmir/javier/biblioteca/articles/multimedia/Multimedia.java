
package cat.iesjoaquimmir.javier.biblioteca.articles.multimedia;
import cat.iesjoaquimmir.javier.biblioteca.articles.Article;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;

public abstract class Multimedia extends Article {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
        private String durada;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public String getDurada() {
                return durada;
            }

            private void setDurada(String durada) {
                this.durada = durada;
            }
           
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
             public Multimedia(String titol, String autor,Categoria categoria, String durada){
                super(titol,autor, categoria);
                this.setDurada(durada);           
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
           @Override
            public String toString() {
            return String.format("%s\n"
                    + "%s\n", getDurada(),
                     super.toString());
            }
         //</editor-fold>
    //</editor-fold>
    
}
