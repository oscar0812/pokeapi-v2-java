package models.resource.named;

import models.GenerationGameIndex;
import models.Name;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "canalave-city",
    "region": {
        "name": "sinnoh",
        "url": "http://pokeapi.co/api/v2/region/4/"
    },
    "names": [{
        "name": "Canalave City",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "game_indices": [{
        "game_index": 7,
        "generation": {
            "name": "generation-iv",
            "url": "http://pokeapi.co/api/v2/generation/4/"
        }
    }],
    "areas": [{
        "name": "canalave-city-area",
        "url": "http://pokeapi.co/api/v2/location-area/1/"
    }]
}
 */

public class Location extends NamedAPIResource {
    // The identifier for this location resource
    private int id;

    // The region this location can be found in
    private Region region;

    // The name of this language listed in different languages
    private ArrayList<Name> names;

    // A list of game indices relevent to this location by generation
    private ArrayList<GenerationGameIndex> game_indices;

    // Areas that can be found within this location
    private ArrayList<LocationArea> areas;

    public Location(String url, int id, String name, Region region, ArrayList<Name> names, ArrayList<GenerationGameIndex> game_indices, ArrayList<LocationArea> areas) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.region = region;
        this.names = names;
        this.game_indices = game_indices;
        this.areas = areas;
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

    public Region getRegion() {
        return region;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<GenerationGameIndex> getGameIndices() {
        return game_indices;
    }

    public ArrayList<LocationArea> getAreas() {
        return areas;
    }
}
