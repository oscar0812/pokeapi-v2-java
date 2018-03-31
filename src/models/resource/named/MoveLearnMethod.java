package models.resource.named;

/*
{
    "id": 1,
    "name": "level-up",
    "names": [{
        "name": "Level up",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "descriptions": [{
        "description": "Wird gelernt, wenn ein Pokémon ein bestimmtes Level erreicht.",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "version_groups": [{
        "name": "red-blue",
        "url": "http://pokeapi.co/api/v2/version-group/1/"
    }]
}
 */

import models.Description;
import models.Name;

import java.util.ArrayList;

public class MoveLearnMethod extends NamedAPIResource {
    // The identifier for this move learn method resource
    private int id;

    // The description of this move learn method listed in different languages
    private ArrayList<Description> descriptions;

    // The name of this move learn method listed in different languages
    private ArrayList<Name> names;

    // A list of version groups where moves can be learned through this method
    private ArrayList<VersionGroup> version_groups;

    public MoveLearnMethod(String url, int id, String name, ArrayList<Description> descriptions, ArrayList<Name> names, ArrayList<VersionGroup> version_groups) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.names = names;
        this.version_groups = version_groups;
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

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<VersionGroup> getVersionGroups() {
        return version_groups;
    }
}
