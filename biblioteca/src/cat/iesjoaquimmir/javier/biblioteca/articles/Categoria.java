
package cat.iesjoaquimmir.javier.biblioteca.articles;


public enum Categoria {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
            INFANTIL("infantil"),
            JUVENIL("juvenil"),
            ADULT("adult");
            private final String descripcio;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
         //</editor-fold>
            Categoria(String descripcio){
                this.descripcio = descripcio;
            }
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">
           public String getDescripcio(){
            return descripcio;
           }
         //</editor-fold>
          //<editor-fold defaultstate="collapsed" desc="Sobreescritura">

         //</editor-fold>
    //</editor-fold>
}
