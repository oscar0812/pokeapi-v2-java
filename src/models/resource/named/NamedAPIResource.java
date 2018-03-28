package models.resource.named;

import models.resource.APIResource;

public abstract class NamedAPIResource extends APIResource {
    //The name of the referenced resource
    public String name = "";

    public String getName(){
        return name;
    }
}
