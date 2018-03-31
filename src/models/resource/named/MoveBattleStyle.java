package models.resource.named;

import models.Name;

import java.util.ArrayList;

public class MoveBattleStyle extends NamedAPIResource {
    // The identifier for this move battle style resource
    private int id;

    // The name of this move battle style listed in different languages
    private ArrayList<Name> names;

    public MoveBattleStyle(String url, int id, String name, ArrayList<Name> names) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.names = names;
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
}
