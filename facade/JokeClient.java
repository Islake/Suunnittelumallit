package facade;

import org.json.simple.parser.ParseException;
import java.io.IOException;

public class JokeClient {
    private ApiFacade apiFacade;

    public JokeClient() {
        this.apiFacade = new ApiFacade();
    }

    public String getRandomJoke() throws IOException, ParseException {
        return apiFacade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
    }

    public static void main(String[] args) {
        JokeClient client = new JokeClient();
        try {
            String jokeText = client.getRandomJoke();
            System.out.println(jokeText);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}