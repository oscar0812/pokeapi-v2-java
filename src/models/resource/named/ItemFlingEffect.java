package models.resource.named;

/*
{
    "id": 1,
    "name": "badly-poison",
    "effect_entries": [{
        "effect": "Badly poisons the target.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "items": [{
        "name": "toxic-orb",
        "url": "http://pokeapi.co/api/v2/item/249/"
    }]
}

 */

import models.Effect;

import java.util.ArrayList;

public class ItemFlingEffect extends NamedAPIResource {
    // The identifier for this fling effect resource
    private int id;

    // The result of this fling effect listed in different languages
    private ArrayList<Effect> effect_entries;

    // A list of items that have this fling effect
    private ArrayList<Item> items;

    public ItemFlingEffect(String url, String name, int id, ArrayList<Effect> effect_entries, ArrayList<Item> items){
        this.url = url;
        this.name = name;
        this.id = id;
        this.effect_entries = effect_entries;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Effect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
