
package cat.iesjoaquimmir.javier.biblioteca.articles.publicacio;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;

public class Llibre extends Publicacio {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
    private String isbn;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public String getIsbn() {
                return isbn;
            }
            
            private void setIsbn(String isbn) {
                this.isbn = isbn;
            }   
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">

            public Llibre(String titol, String autor, Categoria categoria, int NumPagines, String isbn){
                super(titol, autor, categoria, NumPagines);
                this.setIsbn(isbn);
                
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
            @Override
            public String toString() {
            return String.format("DADES LLIBRE:\n"
                    + "isbn del llibre: %s\n"
                    + "%s\n", getIsbn(),
                     super.toString());
            }
         //</editor-fold>
    //</editor-fold>  
}
