import java.net.MalformedURLException;
import java.net.URL;

public class Prac_12 {

    public static void main(String[] args) {
        try {
            // Replace the URL with the desired URL you want to demonstrate
            URL url = new URL("https://www.example.com");

            System.out.println("URL: " + url.toString());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Ref: " + url.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

/*<APPLET CODE="Prac_12.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */
