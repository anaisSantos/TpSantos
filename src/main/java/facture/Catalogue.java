package facture;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    List<Article> catalogueArticles = new ArrayList<>();
    
    public void addArticle(Article article) {
        catalogueArticles.add(article);
    }
    
    public Article findByCode(String code) {
        for( int i=0; i< catalogueArticles.size(); i++){
            if (code == catalogueArticles.get(i).getCode()){
                return catalogueArticles.get(i);
            }
        }
        return null;
    }
}
