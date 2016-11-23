
package cat.iesjoaquimmir.javier.biblioteca.articles;

public abstract class Article implements InArticle {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
    private String titol;
    private String autor;
    private Categoria categoria;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">

            public String getTitol() {
                return titol;
            }
            
            private void setTitol(String titol) {
                this.titol = titol;
            }

            public String getAutor() {
                return autor;
            }

            private void setAutor(String autor) {
                this.autor = autor;
            }
            public Categoria getCategoria() {
                return categoria;
            }

            private void setCategoria(Categoria categoria) {
                this.categoria = categoria;
            }
    
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
         //</editor-fold>
            public Article(String titol, String autor, Categoria categoria){
                this.setTitol(titol);
                this.setAutor(autor);  
                this.setCategoria(categoria);
            }
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">

         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
           @Override
            public String toString() {
            return String.format("%s\n"
                    + "%s\n"
                    + "%s\n", getTitol(), getAutor(), categoria.getDescripcio());
            }
         //</editor-fold>
    //</editor-fold>



}
