package pokeapi.bittle.utils;

import java.io.*;
import java.net.URL;

// responsible for grabbing the information from either the online api or the local db (cache)
public class Information {

    private static String get(BufferedReader bufferedReader) {
        try {
            StringBuilder stringBuilder = new StringBuilder();

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(inputLine);
                stringBuilder.append(System.lineSeparator());
            }

            bufferedReader.close();
            return stringBuilder.toString().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String fromInternet(String targetURL) {
        String str;
        // if CACHE is on, and exists in db, get it from db
        if (Client.CACHE && ((str = Database.getInstance().getByUrl(targetURL)) != null)) {
            return str;
        }

        try {
            System.setProperty("http.agent", "Chrome");
            URL url = new URL(targetURL);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            str = Information.get(bufferedReader);

            if (Client.CACHE) {
                if (Database.getInstance().insert(targetURL, str)) {
                    System.out.println("SAVED TO DB");
                } else {
                    System.out.println("ERROR SAVING TO DB");
                }
            }

            return str;
        } catch (Exception e) {
            //e.printStackTrace();
            if ((str = Database.getInstance().getByUrl(targetURL)) != null) {
                System.out.println("URL REQUEST FAILED, FALLING BACK TO CACHE");
                return str;
            }
            System.out.println("COULDN'T REACH API");
            return "";
        }
    }
}
