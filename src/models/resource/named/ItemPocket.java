package models.resource.named;

import models.Name;
import models.item.ItemCategory;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "misc",
    "categories": [{
        "name": "collectibles",
        "url": "http://pokeapi.co/api/v2/item-category/9/"
    }],
    "names": [{
        "name": "Items",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}

 */
public class ItemPocket extends NamedAPIResource {
    // The identifier for this item pocket resource
    private int id;

    // A list of item categories that are relevant to this item pocket
    private ArrayList<ItemCategory> categories;

    // The name of this item pocket listed in different languages
    private ArrayList<Name> names;

    public ItemPocket(String url, String name, int id, ArrayList<ItemCategory> categories, ArrayList<Name> names){
        this.url = url;
        this.name = name;
        this.id = id;
        this.categories = categories;
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public ArrayList<ItemCategory> getCategories() {
        return categories;
    }

    public ArrayList<Name> getNames() {
        return names;
    }
}
