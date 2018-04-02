package berries;
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

public class Berry extends common.NamedAPIResource {
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

	// The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
	private int soil_dryness;

	// The firmness of this berry, used in making Pokéblocks or Poffins
	private berries.BerryFirmness firmness;

	// A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry
	private java.util.ArrayList<berries.BerryFlavorMap> flavors;

	// Berries are actually items. This is a reference to the item specific data for this berry.
	private items.Item item;

	// The type inherited by "Natural Gift" when used with this Berry
	private pokemon.Type natural_gift_type;

	public static Berry getById(int id) {
		String url = "https://pokeapi.co/api/v2/berry/" + id;
		String json = tools.Internet.get(url);
		Berry obj = new com.google.gson.Gson().fromJson(json, Berry.class);
		return obj;
	}

	public static Berry getByName(String name) {
		String url = "https://pokeapi.co/api/v2/berry/" + name;
		String json = tools.Internet.get(url);
		Berry obj = new com.google.gson.Gson().fromJson(json, Berry.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Berry setId(int id) {
		this.id = id;
		return this;
	}

	public int getGrowthTime() {
		return growth_time;
	}

	public Berry setGrowthTime(int growth_time) {
		this.growth_time = growth_time;
		return this;
	}

	public int getMaxHarvest() {
		return max_harvest;
	}

	public Berry setMaxHarvest(int max_harvest) {
		this.max_harvest = max_harvest;
		return this;
	}

	public int getNaturalGiftPower() {
		return natural_gift_power;
	}

	public Berry setNaturalGiftPower(int natural_gift_power) {
		this.natural_gift_power = natural_gift_power;
		return this;
	}

	public int getSize() {
		return size;
	}

	public Berry setSize(int size) {
		this.size = size;
		return this;
	}

	public int getSmoothness() {
		return smoothness;
	}

	public Berry setSmoothness(int smoothness) {
		this.smoothness = smoothness;
		return this;
	}

	public int getSoilDryness() {
		return soil_dryness;
	}

	public Berry setSoilDryness(int soil_dryness) {
		this.soil_dryness = soil_dryness;
		return this;
	}

	public berries.BerryFirmness getFirmness() {
		return firmness;
	}

	public Berry setFirmness(berries.BerryFirmness firmness) {
		this.firmness = firmness;
		return this;
	}

	public java.util.ArrayList<berries.BerryFlavorMap> getFlavors() {
		return flavors;
	}

	public Berry setFlavors(java.util.ArrayList<berries.BerryFlavorMap> flavors) {
		this.flavors = flavors;
		return this;
	}

	public items.Item getItem() {
		return item;
	}

	public Berry setItem(items.Item item) {
		this.item = item;
		return this;
	}

	public pokemon.Type getNaturalGiftType() {
		return natural_gift_type;
	}

	public Berry setNaturalGiftType(pokemon.Type natural_gift_type) {
		this.natural_gift_type = natural_gift_type;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}