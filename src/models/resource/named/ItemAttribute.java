package models.resource.named;

/*

{
    "id": 1,
    "name": "countable",
    "descriptions": [{
        "description": "Has a count in the bag",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "items": [{
        "name": "master-ball",
        "url": "http://pokeapi.co/api/v2/item/1/"
    }],
    "names": [{
        "name": "Countable",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}

 */

import models.Description;
import models.Name;

import java.util.ArrayList;

public class ItemAttribute extends NamedAPIResource {
    // The identifier for this item attribute resource
    private int id;

    // A list of items that have this attribute
    private ArrayList<Item> items;

    // The name of this item attribute listed in different languages
    private ArrayList<Name> names;

    // The description of this item attribute listed in different languages
    private ArrayList<Description> descriptions;

    public ItemAttribute(String url, String name, int id, ArrayList<Item> items,
                         ArrayList<Name> names, ArrayList<Description> descriptions) {
        this.url = url;
        this.name = name;
        this.id = id;
        this.items = items;
        this.names = names;
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }
}
