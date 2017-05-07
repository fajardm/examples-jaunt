import com.jaunt.JauntException;
import com.jaunt.UserAgent;

/**
 * Created by fajardm on 07/05/17.
 */
public class Example2 {
    public static void main(String[] args) {
        try {
            UserAgent userAgent = new UserAgent(); //create new userAgent (headless browser).
            System.out.println("SETTINGS:\n" + userAgent.settings); //print the userAgent's default settings.
            userAgent.settings.autoSaveAsHTML = true; //change settings to autosave last visited page.

            userAgent.visit("https://news.ycombinator.com/"); //visit a url.
            String title = userAgent.doc.findFirst("<title>").getText(); //get child text of title element.
            System.out.println("\nYCombinator website title: " + title); //print the title

            userAgent.visit("https://id.techinasia.com/"); //visit another url.
            title = userAgent.doc.findFirst("<title>").getText(); //get child text of title element.
            System.out.println("\nId techinasia website title: " + title); //print the title
        } catch (JauntException e) { //if title element isn't found or HTTP/connection error occurs, handle JauntException.
            System.err.println(e);
        }
    }
}
