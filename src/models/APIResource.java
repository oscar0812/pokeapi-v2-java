package models;

public class APIResource {
    // The URL of the referenced resource
    private String url = "";

    public APIResource(String url) {
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

}