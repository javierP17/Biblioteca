
package cat.iesjoaquimmir.javier.biblioteca;
import cat.iesjoaquimmir.javier.biblioteca.articles.multimedia.DiscCompacte;
import cat.iesjoaquimmir.javier.biblioteca.articles.multimedia.DiscVersatilDigital;
import cat.iesjoaquimmir.javier.biblioteca.articles.publicacio.Llibre;
import cat.iesjoaquimmir.javier.biblioteca.articles.Article;
import cat.iesjoaquimmir.javier.biblioteca.articles.publicacio.Revista;
import cat.iesjoaquimmir.javier.biblioteca.articles.Categoria;
import java.util.ArrayList;
public class Application {

    public static void main(String[] args) {
        //Creem l'array d'articles
        ArrayList<Article> arrayArticles = new ArrayList<Article>();
        //Creem els objectes i tot seguit els guardem a l'array
        DiscCompacte a0 = new DiscCompacte("Mis grandes éxitos", "Luis Miguel", Categoria.ADULT, "65", "04900009");
        arrayArticles.add(a0);
        DiscVersatilDigital a1 = new DiscVersatilDigital("Bamby", "Walt Disney", Categoria.INFANTIL, "89", "04965407");
        arrayArticles.add(a1);
        Llibre a2 = new Llibre("Ulises", "James Joyce", Categoria.JUVENIL, 456, "03012309");
        arrayArticles.add(a2);
        Revista a3 = new Revista("Patufet", "Ed. Infantil", Categoria.INFANTIL, 87, "80002432");
        arrayArticles.add(a3);
        //Mostrem els articles guardats a l'array amb for habitual
        for (int i=0; i<arrayArticles.size();i++){
            System.out.printf("%s\n",arrayArticles.get(i).toString());
        }
        //Mostrem els articles guardats a l'array amb for reduït
        for (Article s : arrayArticles) System.out.println(s);
        
    }
    
}
