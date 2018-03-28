package models.resource.named;


/*

example JSON:

{
    "id": 1,
    "name": "generation-i",
    "abilities": [],
    "main_region": {
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/region/1/"
    },
    "moves": [{
        "name": "pound",
        "url": "http://pokeapi.co/api/v2/move/1/"
    }],
    "names": [{
        "name": "Generation I",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "pokemon_species": [{
        "name": "bulbasaur",
        "url": "http://pokeapi.co/api/v2/pokemon-species/1/"
    }],
    "types": [{
        "name": "normal",
        "url": "http://pokeapi.co/api/v2/type/1/"
    }],
    "version_groups": [{
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }]
}

*/

import models.Name;

import java.util.ArrayList;

public class Generation extends NamedAPIResource {
    // The identifier for this generation resource
    private int id;

    // A list of abilities that were introduced in this generation
    private ArrayList<Ability> abilities;

    // The name of this generation listed in different languages
    private ArrayList<Name> names;

    // The main region travelled in this generation
    private Region main_region;

    // A list of moves that were introduced in this generation
    private ArrayList<Move> moves;

    // A list of Pokémon species that were introduced in this generation
    private ArrayList<PokemonSpecies> pokemon_species;

    // A list of types that were introduced in this generation
    private ArrayList<Type> types;

    // A list of version groups that were introduced in this generation
    private ArrayList<VersionGroup> version_groups;

    public Generation(String url, String name, int id, ArrayList<Ability> abilities, ArrayList<Name> names,
                      Region main_region, ArrayList<Move> moves, ArrayList<PokemonSpecies> pokemon_species,
                      ArrayList<Type> types, ArrayList<VersionGroup> version_groups){
        this.url = url;
        this.name = name;
        this.id = id;
        this.abilities = abilities;
        this.names = names;
        this.main_region = main_region;
        this.moves = moves;
        this.pokemon_species = pokemon_species;
        this.types = types;
        this.version_groups = version_groups;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public Region getMainRegion() {
        return main_region;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public ArrayList<PokemonSpecies> getPokemonSpecies() {
        return pokemon_species;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public ArrayList<VersionGroup> getVersionGroups() {
        return version_groups;
    }
}
