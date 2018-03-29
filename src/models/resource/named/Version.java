package models.resource.named;

import models.Name;

import java.util.ArrayList;

public class Version extends NamedAPIResource{
    // The identifier for this version resource
    private int id;

    // The name of this version listed in different languages
    private ArrayList<Name> names;

    // The version group this version belongs to
    private VersionGroup version_group;

    public Version(String url, String name, int id, ArrayList<Name> names, VersionGroup version_group){
        this.url = url;
        this.name = name;
        this.id = id;
        this.names = names;
        this.version_group = version_group;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
