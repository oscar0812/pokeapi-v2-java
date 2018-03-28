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


id	The identifier for this generation resource	integer
name	The name for this generation resource	string
abilities	A list of abilities that were introduced in this generation	list NamedAPIResource (Ability)
names	The name of this generation listed in different languages	list Name
main_region	The main region travelled in this generation	NamedAPIResource (Region)
moves	A list of moves that were introduced in this generation	list NamedAPIResource (Move)
pokemon_species	A list of Pokémon species that were introduced in this generation	list NamedAPIResource (PokemonSpecies)
types	A list of types that were introduced in this generation	list NamedAPIResource (Type)
version_groups	A list of version groups that were introduced in this generation	list NamedAPIResource (VersionGroup)

*/

import models.Name;

import java.util.ArrayList;

public class Generation extends NamedAPIResource {
    private int id;
    private ArrayList<Ability> abilities;
    private ArrayList<Name> names;
    private Region main_region;
    private ArrayList<Move> moves;
    private ArrayList<PokemonSpecies> pokemon_species;
    private ArrayList<Type> types;
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
