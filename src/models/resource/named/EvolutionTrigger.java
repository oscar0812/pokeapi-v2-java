package models.resource.named;

/*
{
    "id": 1,
    "name": "level-up",
    "names": [{
        "name": "Level up",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pokemon_species": [{
        "name": "ivysaur",
        "url": "http://pokeapi.co/api/v2/pokemon-species/2/"
    }]
}

 */

import models.Name;

import java.util.ArrayList;

public class EvolutionTrigger extends NamedAPIResource {
    // The identifier for this evolution trigger resource
    private int id;

    // The name of this evolution trigger listed in different languages
    private ArrayList<Name> names;

    // A list of pokemon species that result from this evolution trigger
    private PokemonSpecies pokemon_species;

    public EvolutionTrigger(String url, String name, int id, ArrayList<Name> names, PokemonSpecies pokemon_species){
        this.url = url;
        this.name = name;
        this.id = id;
        this.names = names;
        this.pokemon_species = pokemon_species;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public PokemonSpecies getPokemonSpecies() {
        return pokemon_species;
    }
}
