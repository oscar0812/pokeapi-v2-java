package models.resource.named;

import models.Name;

import java.util.ArrayList;

public class BerryFirmness extends NamedAPIResource {
    // The identifier for this berry firmness resource
    private int id;

    // A list of the berries with this firmness
    private ArrayList<Berry> berries;

    // The name of this berry firmness listed in different languages
    private ArrayList<Name> names;

    public BerryFirmness(String url, String name, int id, ArrayList<Berry> berries, ArrayList<Name> names){
        this.url = url;
        this.name = name;
        this.id = id;
        this.berries = berries;
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Berry> getBerries() {
        return berries;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
