import pokeapi.bittle.models.items.Item;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Client;

public class Test {
    public static void main(String[] args) {
        NamedAPIResourceList list = Client.getItemList(40, 20);
        for(NamedAPIResource a: list.getResults()) {
            System.out.println(Item.getByName(a.getName()));
        }
        int a = 1;
    }
}
