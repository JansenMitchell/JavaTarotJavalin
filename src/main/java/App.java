import io.javalin.Javalin;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<String> tarotDeck = Arrays.asList(
                "The Fool", "The Magician", "The High Priestess", "The Empress", "The Emperor", "The Hierophant",
                "The Lovers", "The Chariot", "Strength", "The Hermit", "Wheel of Fortune", "Justice", "The Hanged Man",
                "Death", "Temperance", "The Devil", "The Tower", "The Star", "The Moon", "The Sun", "Judgement", "The World"
        );

        Javalin app = Javalin.create().start(7000);
        app.get("/hello", ctx -> ctx.result(drawRandomCard(tarotDeck)));
    }

    public static String drawRandomCard(List<String> deck) {
        Random rand = new Random();
        return deck.get(rand.nextInt(deck.size()));
    }
}
