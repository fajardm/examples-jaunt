import com.jaunt.JauntException;
import com.jaunt.UserAgent;

/**
 * Created by fajardm on 01/05/17.
 */
public class Example1 {
    public static void main(String[] args) {
        try {
            UserAgent userAgent = new UserAgent(); //create new userAgent (headless browser).
            userAgent.visit("https://news.ycombinator.com/"); //visit a url
            System.out.println(userAgent.doc.innerHTML()); //print the document as HTML
        } catch (JauntException e) { //if an HTTP/connection error occurs, handle JauntException.
            System.err.println(e);
        }
    }
}
