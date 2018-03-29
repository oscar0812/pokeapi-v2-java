package models.item;

import models.Name;
import models.resource.named.Item;
import models.resource.named.ItemPocket;

import java.util.ArrayList;

public class ItemCategory {
    // The identifier for this item category resource
    private int id;

    // The name for this item category resource
    private String name;

    // A list of items that are a part of this category
    private ArrayList<Item> items;

    // The name of this item category listed in different languages
    private ArrayList<Name> names;

    // The pocket items in this category would be put in
    private ItemPocket pocket;

    public ItemCategory(int id, String name, ArrayList<Item> items, ArrayList<Name> names, ItemPocket pocket){
        this.id = id;
        this.name = name;
        this.items = items;
        this.names = names;
        this.pocket = pocket;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ItemPocket getPocket() {
        return pocket;
    }
}
