/* An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. */

package pokeapi.bittle.models.items;
/*
{
  "id": 1,
  "name": "master-ball",
  "cost": 0,
  "fling_power": 10,
  "fling_effect": {
    "name": "flinch",
    "url": "https://pokeapi.co/api/v2/item-fling-effect/7/"
  },
  "attributes": [
    {
      "name": "holdable",
      "url": "https://pokeapi.co/api/v2/item-attribute/5/"
    }
  ],
  "category": {
    "name": "standard-balls",
    "url": "https://pokeapi.co/api/v2/item-category/34/"
  },
  "effect_entries": [
    {
      "effect": "Used in battle\n:   [Catches]{mechanic:catch} a wild Pokémon without fail.\n\n    If used in a trainer battle, nothing happens and the ball is lost.",
      "short_effect": "Catches a wild Pokémon every time.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "text": "The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail.",
      "version_group": {
        "name": "x-y",
        "url": "https://pokeapi.co/api/v2/version-group/15/"
      },
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "game_indices": [
    {
      "game_index": 1,
      "generation": {
        "name": "generation-vi",
        "url": "https://pokeapi.co/api/v2/generation/6/"
      }
    }
  ],
  "names": [
    {
      "name": "Master Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "sprites": {
    "default": "http://pokeapi.co/media/sprites/items/master-ball.png"
  },
  "held_by_pokemon": [
    {
      "pokemon": {
        "name": "chansey",
        "url": "https://pokeapi.co/api/v2/pokemon/113/"
      },
      "version_details": [
        {
          "rarity": 50,
          "version": {
            "name": "soulsilver",
            "url": "https://pokeapi.co/api/v2/version/16/"
          }
        }
      ]
    }
  ],
  "baby_trigger_for": {
    "url": "https://pokeapi.co/api/v2/evolution-chain/1/"
  }
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.evolution.EvolutionChain;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.GenerationGameIndex;
import pokeapi.bittle.models.utility.MachineVersionDetail;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.models.utility.VerboseEffect;
import pokeapi.bittle.models.utility.VersionGroupFlavorText;
import pokeapi.bittle.utils.Information;

public class Item extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The price of this item in stores.
	private int cost;

	// The power of the move Fling when used with this item.
	private int fling_power;

	// The effect of the move Fling when used with this item.
	private ItemFlingEffect fling_effect;

	// A list of attributes this item has.
	private ArrayList<ItemAttribute> attributes;

	// The category of items this item falls into.
	private ItemCategory category;

	// The effect of this ability listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The flavor text of this ability listed in different languages.
	private ArrayList<VersionGroupFlavorText> flavor_text_entries;

	// A list of game indices relevent to this item by generation.
	private ArrayList<GenerationGameIndex> game_indices;

	// The name of this item listed in different languages.
	private ArrayList<Name> names;

	// A set of sprites used to depict this item in the game.
	private ItemSprites sprites;

	// A list of Pokémon that might be found in the wild holding this item.
	private ArrayList<ItemHolderPokemon> held_by_pokemon;

	// An evolution chain this item requires to produce a bay during mating.
	private EvolutionChain baby_trigger_for;

	// A list of the machines related to this item.
	private ArrayList<MachineVersionDetail> machines;

	public int getId() {
		return id;
	}

	public Item setId(int id) {
		this.id = id;
		return this;
	}

	public int getCost() {
		return cost;
	}

	public Item setCost(int cost) {
		this.cost = cost;
		return this;
	}

	public int getFlingPower() {
		return fling_power;
	}

	public Item setFlingPower(int fling_power) {
		this.fling_power = fling_power;
		return this;
	}

	public ItemFlingEffect getFlingEffect() {
		if(!fling_effect.getIsFetched()) {
			fling_effect = fling_effect.get();
		}
		return fling_effect;
	}

	public Item setFlingEffect(ItemFlingEffect fling_effect) {
		this.fling_effect = fling_effect;
		return this;
	}

	public ArrayList<ItemAttribute> getAttributes() {
		return attributes;
	}

	public Item setAttributes(ArrayList<ItemAttribute> attributes) {
		this.attributes = attributes;
		return this;
	}

	public ItemCategory getCategory() {
		if(!category.getIsFetched()) {
			category = category.get();
		}
		return category;
	}

	public Item setCategory(ItemCategory category) {
		this.category = category;
		return this;
	}

	public ArrayList<VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public Item setEffectEntries(ArrayList<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public ArrayList<VersionGroupFlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public Item setFlavorTextEntries(ArrayList<VersionGroupFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public ArrayList<GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Item setGameIndices(ArrayList<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Item setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ItemSprites getSprites() {
		return sprites;
	}

	public Item setSprites(ItemSprites sprites) {
		this.sprites = sprites;
		return this;
	}

	public ArrayList<ItemHolderPokemon> getHeldByPokemon() {
		return held_by_pokemon;
	}

	public Item setHeldByPokemon(ArrayList<ItemHolderPokemon> held_by_pokemon) {
		this.held_by_pokemon = held_by_pokemon;
		return this;
	}

	public EvolutionChain getBabyTriggerFor() {
		if(!baby_trigger_for.getIsFetched()) {
			baby_trigger_for = baby_trigger_for.get();
		}
		return baby_trigger_for;
	}

	public Item setBabyTriggerFor(EvolutionChain baby_trigger_for) {
		this.baby_trigger_for = baby_trigger_for;
		return this;
	}

	public ArrayList<MachineVersionDetail> getMachines() {
		return machines;
	}

	public Item setMachines(ArrayList<MachineVersionDetail> machines) {
		this.machines = machines;
		return this;
	}

	private static Item get(String url) {
		Item obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Item.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Item get() {
		return Item.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item", limit, offset);
	}

	public static Item getById(int id) {
		return get("https://pokeapi.co/api/v2/item/" + id);
	}

	public static Item getByName(String name) {
		return get("https://pokeapi.co/api/v2/item/" + name);
	}
}