package models.item;

public class ItemSprites {

    // The default depiction of this item
    private String def;

    public ItemSprites(String def){
        this.def = def;
    }

    public String getDefault(){
        return def;
    }

}
