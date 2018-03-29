package models.resource.named;

import models.Description;
import models.Name;
import models.game.PokemonEntry;

import java.util.ArrayList;

public class Pokedex extends NamedAPIResource {
    // The identifier for this Pokédex resource
    private int id;

    // Whether or not this Pokédex originated in the main series of the video games
    private boolean is_main_series;

    // The description of this Pokédex listed in different languages
    private ArrayList<Description> descriptions;

    // The name of this Pokédex listed in different languages
    private ArrayList<Name> names;

    // A list of Pokémon catalogued in this Pokédex and their indexes
    private ArrayList<PokemonEntry> pokemon_entries;

    // The region this Pokédex catalogues Pokémon for
    private Region region;

    // A list of version groups this Pokédex is relevant to
    private VersionGroup version_group;

    public Pokedex(String url, String name, int id, boolean is_main_series,ArrayList<Description> descriptions,
                   ArrayList<Name> names, ArrayList<PokemonEntry> pokemon_entries, Region region,
                   VersionGroup version_group){
        this.url = url;
        this.name = name;
        this.id = id;
        this.is_main_series = is_main_series;
        this.descriptions = descriptions;
        this.names = names;
        this.pokemon_entries = pokemon_entries;
        this.region = region;
        this.version_group = version_group;
    }

    public int getId() {
        return id;
    }

    public boolean isMainSeries() {
        return is_main_series;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonEntry> getPokemonEntries() {
        return pokemon_entries;
    }

    public Region getRegion() {
        return region;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
