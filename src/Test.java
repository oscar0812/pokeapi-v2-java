import pokeapi.bittle.models.pokemon.Pokemon;
import pokeapi.bittle.models.pokemon.PokemonMove;
import pokeapi.bittle.utils.Client;

import java.util.ArrayList;

public class Test {
    public static void main(String [] args){
        Pokemon pkm = Client.getPokemonByName("milotic");
        ArrayList<PokemonMove> a = pkm.getMoves();
    }
}
