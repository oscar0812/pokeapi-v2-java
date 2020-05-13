import pokeapi.bittle.models.moves.Move;
import pokeapi.bittle.models.moves.MoveCategory;
import pokeapi.bittle.models.pokemon.Pokemon;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Client;

public class Test {
    public static void main(String[] args) {
        NamedAPIResourceList list = Client.getMoveCategoryList(10, 0);

        for (NamedAPIResource nar:list.getResults()) {
            MoveCategory mc = MoveCategory.getByName(nar.getName());
            for(Move move: mc.getMoves()) {
                System.out.println(move.get());
            }
        }
    }
}
