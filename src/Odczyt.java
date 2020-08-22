import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Odczyt {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.mbnet.com.pl/dl.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        OperNaPliku opr = new OperNaPliku();
        opr.wyszukajLiczby(in);
        in.close();
        System.out.println("koniec");
    }


    }

