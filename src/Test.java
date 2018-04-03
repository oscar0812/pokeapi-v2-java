import api.Client;
import models.pokemon.Pokemon;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        Pokemon pokemon = client.getPokemonById(1);
        System.out.println(pokemon.getHeight());
    }
}
