package models.resource.named;

import models.Name;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "monster",
    "names": [{
        "name": "ã‹ã„ã˜ã‚…ã†",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }],
    "pokemon_species": [{
        "name": "bulbasaur",
        "url": "http://pokeapi.co/api/v2/pokemon-species/1/"
    }]
}
 */

public class EggGroup extends NamedAPIResource {
    // The identifier for this egg group resource
    private int id;

    // The name of this egg group listed in different languages
    private ArrayList<Name> names;

    // A list of all Pokémon species that are members of this egg group
    private ArrayList<PokemonSpecies> pokemon_species;

    public EggGroup(String url, int id, String name, ArrayList<Name> names, ArrayList<PokemonSpecies> pokemon_species) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.names = names;
        this.pokemon_species = pokemon_species;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonSpecies> getPokemonSpecies() {
        return pokemon_species;
    }
}