package models.resource.named;

/*

{
    "id": 1,
    "name": "cheri",
    "growth_time": 3,
    "max_harvest": 5,
    "natural_gift_power": 60,
    "size": 20,
    "smoothness": 25,
    "soil_dryness": 15,
    "firmness": {
        "name": "soft",
        "url": "http://pokeapi.co/api/v2/berry-firmness/2/"
    },
    "flavors": [{
        "potency": 10,
        "flavor": {
            "name": "spicy",
            "url": "http://pokeapi.co/api/v2/berry-flavor/1/"
        }
    }],
    "item": {
        "name": "cheri-berry",
        "url": "http://pokeapi.co/api/v2/item/126/"
    },
    "natural_gift_type": {
        "name": "fire",
        "url": "http://pokeapi.co/api/v2/type/10/"
    }
}

 */

import models.berry.BerryFlavorMap;

import java.util.ArrayList;

public class Berry extends NamedAPIResource {
    // The identifier for this berry resource
    private int id;

    // Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
    private int growth_time;

    // The maximum number of these berries that can grow on one tree in Generation IV
    private int max_harvest;

    // The power of the move "Natural Gift" when used with this Berry
    private int natural_gift_power;

    // The size of this Berry, in millimeters
    private int size;

    // The smoothness of this Berry, used in making Pokéblocks or Poffins
    private int smoothness;

    // The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly
    private int soil_dryness;

    // The firmness of this berry, used in making Pokéblocks or Poffins
    private BerryFirmness firmness;

    // A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry
    private ArrayList<BerryFlavorMap> flavors;

    // Berries are actually items. This is a reference to the item specific data for this berry.
    private Item item;

    // The type inherited by "Natural Gift" when used with this Berry
    private Type natural_gift_type;

    public Berry(String url, String name, int id, int growth_time, int max_harvest, int natural_gift_power,
                 int size, int smoothness, int soil_dryness, BerryFirmness firmness, ArrayList<BerryFlavorMap> flavors,
                 Item item, Type natural_gift_type) {
        this.url = url;
        this.name = name;
        this.id = id;
        this.growth_time = growth_time;
        this.max_harvest = max_harvest;
        this.natural_gift_power = natural_gift_power;
        this.size = size;
        this.smoothness = smoothness;
        this.soil_dryness = soil_dryness;
        this.firmness = firmness;
        this.flavors = flavors;
        this.item = item;
        this.natural_gift_type = natural_gift_type;
    }

    public int getId() {
        return id;
    }

    public int getGrowth_time() {
        return growth_time;
    }

    public int getMaxHarvest() {
        return max_harvest;
    }

    public int getNaturalGiftPower() {
        return natural_gift_power;
    }

    public Type getNaturalGiftType() {
        return natural_gift_type;
    }

    public int getSize() {
        return size;
    }

    public int getSmoothness() {
        return smoothness;
    }

    public int getSoilDryness() {
        return soil_dryness;
    }

    public BerryFirmness getFirmness() {
        return firmness;
    }

    public ArrayList<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public Item getItem() {
        return item;
    }
}
