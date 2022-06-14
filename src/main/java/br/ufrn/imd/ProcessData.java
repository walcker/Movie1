package br.ufrn.imd;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Iterator;


public class ProcessData {

    //private static JSONObject JSONObject;

    public ProcessData() {
    }

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        Movie movie = new Movie();

        try (Reader reader = new FileReader("src/main/resources/movies.json")) {

            JSONArray jsonArray = (JSONArray) parser.parse(reader);
            Iterator<String> iterator = jsonArray.iterator();
            System.out.println(jsonArray);
            while (iterator.hasNext()) {
                System.out.println(iterator.next());

                String title = (String) jsonArray.get(Integer.parseInt(iterator.next()));
                System.out.println(title);

                double budget = (double) jsonArray.get(Integer.parseInt(iterator.next()));
                System.out.println(budget);

                int imdbVotes = (int) jsonArray.get(Integer.parseInt(iterator.next()));
                System.out.println(imdbVotes);

                double imdbRating = (double) jsonArray.get(Integer.parseInt(iterator.next()));
                System.out.println(imdbRating);

                String director = (String) jsonArray.get(Integer.parseInt(iterator.next()));
                System.out.println(director);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
