package models;

import org.jetbrains.annotations.Contract;

public class NamedAPIResource {
    //The name of the referenced resource
    private String name = "";

    // The URL of the referenced resource
    private String url = "";

    public NamedAPIResource(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Contract(pure = true)
    private String getName(){
        return name;
    }

    @Contract(pure = true)
    private String getUrl(){
        return url;
    }
}
