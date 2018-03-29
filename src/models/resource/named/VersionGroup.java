package models.resource.named;

import java.util.ArrayList;

/*

{
    "id": 1,
    "name": "red-blue",
    "order": 1,
    "generation": {
        "name": "generation-i",
        "url": "http://pokeapi.co/api/v2/generation/1/"
    },
    "move_learn_methods": [{
        "name": "level-up",
        "url": "http://pokeapi.co/api/v2/move-learn-method/1/"
    }],
    "pokedexes": [{
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/pokedex/2/"
    }],
    "regions": [{
        "name": "kanto",
        "url": "http://pokeapi.co/api/v2/region/1/"
    }],
    "versions": [{
        "name": "red",
        "url": "http://pokeapi.co/api/v2/version/1/"
    }]
}

 */
public class VersionGroup extends NamedAPIResource {
    // The identifier for this version group resource
    private int id;

    // Order for sorting. Almost by date of release, except similar versions are grouped together
    private int order;

    // The generation this version was introduced in
    private Generation generation;

    // A list of methods in which Pokémon can learn moves in this version group
    private ArrayList<MoveLearnMethod> move_learn_methods;

    // A list of Pokédexes introduces in this version group
    private ArrayList<Pokedex> pokedexes;

    // A list of regions that can be visited in this version group
    private ArrayList<Region> regions;

    // The versions this version group owns
    private ArrayList<Version> versions;

    public VersionGroup(String url, String name, int id, int order, Generation generation,
                        ArrayList<MoveLearnMethod> move_learn_methods, ArrayList<Pokedex> pokedexes,
                        ArrayList<Region> regions, ArrayList<Version> versions) {
        this.url = url;
        this.name = name;
        this.id = id;
        this.order = order;
        this.generation = generation;
        this.move_learn_methods = move_learn_methods;
        this.pokedexes = pokedexes;
        this.regions = regions;
        this.versions = versions;
    }

    public int getId() {
        return id;
    }

    public int getOrder() {
        return order;
    }

    public Generation getGeneration() {
        return generation;
    }

    public ArrayList<MoveLearnMethod> getMoveLearnMethods() {
        return move_learn_methods;
    }

    public ArrayList<Pokedex> getPokedexes() {
        return pokedexes;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public ArrayList<Version> getVersions() {
        return versions;
    }
}
