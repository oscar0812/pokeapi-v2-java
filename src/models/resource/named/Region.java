package models.resource.named;

import models.Name;

import java.util.ArrayList;

public class Region extends NamedAPIResource {
    // The identifier for this region resource
    private int id;

    // A list of locations that can be found in this region
    private ArrayList<Location> locations;

    // The generation this region was introduced in
    private Generation main_generation;

    // The name of this region listed in different languages
    private ArrayList<Name> names;

    // A list of pokédexes that catalogue Pokémon in this region
    private ArrayList<Pokedex> pokedexes;

    // A list of version groups where this region can be visited
    private ArrayList<VersionGroup> version_groups;

    public Region(String url, String name, int id, ArrayList<Location> locations, Generation main_generation,
                  ArrayList<Name> names, ArrayList<Pokedex> pokedexes, ArrayList<VersionGroup> version_groups) {
        this.url = url;
        this.name = name;
        this.id = id;
        this.locations = locations;
        this.main_generation = main_generation;
        this.names = names;
        this.pokedexes = pokedexes;
        this.version_groups = version_groups;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public Generation getMainGeneration() {
        return main_generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<Pokedex> getPokedexes() {
        return pokedexes;
    }

    public ArrayList<VersionGroup> getVersionGroups() {
        return version_groups;
    }
}
