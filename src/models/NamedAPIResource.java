package models;

public class NamedAPIResource {
    //The name of the referenced resource
    private String name = "";

    // The URL of the referenced resource
    private String url = "";

    public NamedAPIResource(String name, String url){
        this.name = name;
        this.url = url;
    }

    private String getName(){
        return name;
    }

    private String getUrl(){
        return url;
    }
}
