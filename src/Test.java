import pokemon.Pokemon;

public class Test {

    public static void main(String[] args){
        System.setProperty("http.agent", "Chrome");
        Pokemon pokemon = Pokemon.getByName("charizard");

        System.out.println(pokemon);
    }
}
