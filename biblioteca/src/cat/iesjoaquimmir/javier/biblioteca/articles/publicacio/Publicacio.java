
package cat.iesjoaquimmir.javier.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.javier.biblioteca.articles.Article;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;

public abstract class Publicacio extends Article {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
        private int NumPagines;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public int getNumPagines() {
                return NumPagines;
            }

            private void setNumPagines(int NumPagines) {
                this.NumPagines = NumPagines;
            }

         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
            public Publicacio(String titol, String autor, Categoria categoria, int NumPagines){
                super(titol,autor,categoria);
                this.setNumPagines(NumPagines);           
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
           @Override
            public String toString() {
            return String.format("%d\n"
                    + "%s\n", getNumPagines(),
                     super.toString());
            }
         //</editor-fold>
    //</editor-fold>

}
