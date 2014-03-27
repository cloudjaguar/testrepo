package feedsRLWS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  


@Path("/articles")
public class ArticleResource {
private static Map<String, Article> articles = new HashMap<String, Article>(); 
	
	static {  
        
        Article article1 = new Article();  
        article1.setGuid("SB1000");  
        article1.setTitle("Test Head1");  
        
        articles.put(article1.getGuid(), article1);  
          
        Article article2 = new Article();  
        article2.setGuid("SB2000");  
        article2.setTitle("Test Head2");  
        
        articles.put(article2.getGuid(), article2);  
          
    }  
	@GET
	@Produces({MediaType.APPLICATION_JSON})
     public List<Article> listArticlesJSON(){  
         return new ArrayList<Article>(articles.values());  
     } 

}



