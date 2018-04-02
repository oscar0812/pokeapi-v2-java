package tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Internet {

    // go the url, and grab all the text on the page, then return it as a string
    public static String get(String targetURL)
    {
        try {
            URL url = new URL(targetURL);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            StringBuilder stringBuilder = new StringBuilder();

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(inputLine);
                stringBuilder.append(System.lineSeparator());
            }

            bufferedReader.close();
            return stringBuilder.toString().trim();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
