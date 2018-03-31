package models.resource.named;

import models.Name;
import models.location.PalParkEncounterSpecies;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "forest",
    "names": [{
        "name": "Forest",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pokemon_encounters": [{
        "base_score": 30,
        "rate": 50,
        "pokemon_species": {
            "name": "caterpie",
            "url": "http://pokeapi.co/api/v2/pokemon-species/10/"
        }
    }]
}
 */

public class PalParkArea extends NamedAPIResource {
    // The identifier for this pal park area resource
    private int id;

    // The name of this pal park area listed in different languages
    private ArrayList<Name> names;

    // A list of Pokémon encountered in thi pal park area along with details
    private ArrayList<PalParkEncounterSpecies> pokemon_encounters;

    public PalParkArea(String url, int id, String name, ArrayList<Name> names, ArrayList<PalParkEncounterSpecies> pokemon_encounters) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.names = names;
        this.pokemon_encounters = pokemon_encounters;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PalParkEncounterSpecies> getPokemonEncounters() {
        return pokemon_encounters;
    }
}
