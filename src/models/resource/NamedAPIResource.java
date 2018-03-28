package models.resource;

public abstract class NamedAPIResource extends APIResource {
    //The name of the referenced resource
    public String name = "";

    public String getName(){
        return name;
    }
}
