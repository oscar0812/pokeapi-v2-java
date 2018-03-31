package models.resource.named;

import models.Name;
import models.location.EncounterMethodRate;
import models.location.PokemonEncounter;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "canalave-city-area",
    "game_index": 1,
    "encounter_method_rates": [{
        "encounter_method": {
            "name": "old-rod",
            "url": "http://pokeapi.co/api/v2/encounter-method/2/"
        },
        "version_details": [{
            "rate": 25,
            "version": {
                "name": "platinum",
                "url": "http://pokeapi.co/api/v2/version/14/"
            }
        }]
    }],
    "location": {
        "name": "canalave-city",
        "url": "http://pokeapi.co/api/v2/location/1/"
    },
    "names": [{
        "name": "",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "pokemon_encounters": [{
        "pokemon": {
            "name": "tentacool",
            "url": "http://pokeapi.co/api/v2/pokemon/72/"
        },
        "version_details": [{
            "version": {
                "name": "diamond",
                "url": "http://pokeapi.co/api/v2/version/12/"
            },
            "max_chance": 60,
            "encounter_details": [{
                "min_level": 20,
                "max_level": 30,
                "condition_values": [],
                "chance": 60,
                "method": {
                    "name": "surf",
                    "url": "http://pokeapi.co/api/v2/encounter-method/5/"
                }
            }]
        }]
    }]
}
 */

public class LocationArea extends NamedAPIResource {
    // The identifier for this location resource
    private int id;

    // The internal id of an API resource within game data
    private int game_index;

    // A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game
    private ArrayList<EncounterMethodRate> encounter_method_rates;

    // The region this location can be found in
    private Region location;

    // The name of this location area listed in different languages
    private ArrayList<Name> names;

    // A list of Pokémon that can be encountered in this area along with version specific details about the encounter
    private ArrayList<PokemonEncounter> pokemon_encounters;

    public LocationArea(String url,int id,String name,int game_index,ArrayList<EncounterMethodRate> encounter_method_rates,Region location,ArrayList<Name> names,ArrayList<PokemonEncounter> pokemon_encounters) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.game_index = game_index;
        this.encounter_method_rates = encounter_method_rates;
        this.location = location;
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

    public int getGameIndex() {
        return game_index;
    }

    public ArrayList<EncounterMethodRate> getEncounterMethodRates() {
        return encounter_method_rates;
    }

    public Region getLocation() {
        return location;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonEncounter> getPokemonEncounters() {
        return pokemon_encounters;
    }
}
