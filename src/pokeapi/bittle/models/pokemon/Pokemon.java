/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 12,
  "name": "butterfree",
  "base_experience": 178,
  "height": 11,
  "is_default": true,
  "order": 16,
  "weight": 320,
  "abilities": [
    {
      "is_hidden": true,
      "slot": 3,
      "ability": {
        "name": "tinted-lens",
        "url": "https://pokeapi.co/api/v2/ability/110/"
      }
    }
  ],
  "forms": [
    {
      "name": "butterfree",
      "url": "https://pokeapi.co/api/v2/pokemon-form/12/"
    }
  ],
  "game_indices": [
    {
      "game_index": 12,
      "version": {
        "name": "white-2",
        "url": "https://pokeapi.co/api/v2/version/22/"
      }
    }
  ],
  "held_items": [
    {
      "item": {
        "name": "silver-powder",
        "url": "https://pokeapi.co/api/v2/item/199/"
      },
      "version_details": [
        {
          "rarity": 5,
          "version": {
            "name": "y",
            "url": "https://pokeapi.co/api/v2/version/24/"
          }
        }
      ]
    }
  ],
  "location_area_encounters": [
    {
      "location_area": {
        "name": "kanto-route-2-south-towards-viridian-city",
        "url": "https://pokeapi.co/api/v2/location-area/296/"
      },
      "version_details": [
        {
          "max_chance": 10,
          "encounter_details": [
            {
              "min_level": 7,
              "max_level": 7,
              "condition_values": [
                {
                  "name": "time-morning",
                  "url": "https://pokeapi.co/api/v2/encounter-condition-value/3/"
                }
              ],
              "chance": 5,
              "method": {
                "name": "walk",
                "url": "https://pokeapi.co/api/v2/encounter-method/1/"
              }
            }
          ],
          "version": {
            "name": "heartgold",
            "url": "https://pokeapi.co/api/v2/version/15/"
          }
        }
      ]
    }
  ],
  "moves": [
    {
      "move": {
        "name": "flash",
        "url": "https://pokeapi.co/api/v2/move/148/"
      },
      "version_group_details": [
        {
          "level_learned_at": 0,
          "version_group": {
            "name": "x-y",
            "url": "https://pokeapi.co/api/v2/version-group/15/"
          },
          "move_learn_method": {
            "name": "machine",
            "url": "https://pokeapi.co/api/v2/move-learn-method/4/"
          }
        }
      ]
    }
  ],
  "species": {
    "name": "butterfree",
    "url": "https://pokeapi.co/api/v2/pokemon-species/12/"
  },
  "sprites": {
    "back_female": "http://pokeapi.co/media/sprites/pokemon/back/female/12.png",
    "back_shiny_female": "http://pokeapi.co/media/sprites/pokemon/back/shiny/female/12.png",
    "back_default": "http://pokeapi.co/media/sprites/pokemon/back/12.png",
    "front_female": "http://pokeapi.co/media/sprites/pokemon/female/12.png",
    "front_shiny_female": "http://pokeapi.co/media/sprites/pokemon/shiny/female/12.png",
    "back_shiny": "http://pokeapi.co/media/sprites/pokemon/back/shiny/12.png",
    "front_default": "http://pokeapi.co/media/sprites/pokemon/12.png",
    "front_shiny": "http://pokeapi.co/media/sprites/pokemon/shiny/12.png"
  },
  "stats": [
    {
      "base_stat": 70,
      "effort": 0,
      "stat": {
        "name": "speed",
        "url": "https://pokeapi.co/api/v2/stat/6/"
      }
    }
  ],
  "types": [
    {
      "slot": 2,
      "type": {
        "name": "flying",
        "url": "https://pokeapi.co/api/v2/type/3/"
      }
    }
  ]
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.models.utility.VersionGameIndex;
import pokeapi.bittle.utils.Information;

public class Pokemon extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The base experience gained for defeating this Pokémon.
	private int base_experience;

	// The height of this Pokémon in decimetres.
	private int height;

	// Set for exactly one Pokémon used as the default for each species.
	private boolean is_default;

	// Order for sorting. Almost national order, except families are grouped together.
	private int order;

	// The weight of this Pokémon in hectograms.
	private int weight;

	// A list of abilities this Pokémon could potentially have.
	private ArrayList<PokemonAbility> abilities;

	// A list of forms this Pokémon can take on.
	private ArrayList<PokemonForm> forms;

	// A list of game indices relevent to Pokémon item by generation.
	private ArrayList<VersionGameIndex> game_indices;

	// A list of items this Pokémon may be holding when encountered.
	private ArrayList<PokemonHeldItem> held_items;

	// A link to a list of location areas, as well as encounter details pertaining to specific versions.
	private String location_area_encounters;

	// A list of moves along with learn methods and level details pertaining to specific version groups.
	private ArrayList<PokemonMove> moves;

	// A set of sprites used to depict this Pokémon in the game.
	private PokemonSprites sprites;

	// The species this Pokémon belongs to.
	private PokemonSpecies species;

	// A list of base stat values for this Pokémon.
	private ArrayList<PokemonStat> stats;

	// A list of details showing types this Pokémon has.
	private ArrayList<PokemonType> types;

	public int getId() {
		return id;
	}

	public Pokemon setId(int id) {
		this.id = id;
		return this;
	}

	public int getBaseExperience() {
		return base_experience;
	}

	public Pokemon setBaseExperience(int base_experience) {
		this.base_experience = base_experience;
		return this;
	}

	public int getHeight() {
		return height;
	}

	public Pokemon setHeight(int height) {
		this.height = height;
		return this;
	}

	public boolean getIsDefault() {
		return is_default;
	}

	public Pokemon setIsDefault(boolean is_default) {
		this.is_default = is_default;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public Pokemon setOrder(int order) {
		this.order = order;
		return this;
	}

	public int getWeight() {
		return weight;
	}

	public Pokemon setWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public ArrayList<PokemonAbility> getAbilities() {
		return abilities;
	}

	public Pokemon setAbilities(ArrayList<PokemonAbility> abilities) {
		this.abilities = abilities;
		return this;
	}

	public ArrayList<PokemonForm> getForms() {
		return forms;
	}

	public Pokemon setForms(ArrayList<PokemonForm> forms) {
		this.forms = forms;
		return this;
	}

	public ArrayList<VersionGameIndex> getGameIndices() {
		return game_indices;
	}

	public Pokemon setGameIndices(ArrayList<VersionGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public ArrayList<PokemonHeldItem> getHeldItems() {
		return held_items;
	}

	public Pokemon setHeldItems(ArrayList<PokemonHeldItem> held_items) {
		this.held_items = held_items;
		return this;
	}

	public String getLocationAreaEncounters() {
		return location_area_encounters;
	}

	public Pokemon setLocationAreaEncounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
		return this;
	}

	public ArrayList<PokemonMove> getMoves() {
		return moves;
	}

	public Pokemon setMoves(ArrayList<PokemonMove> moves) {
		this.moves = moves;
		return this;
	}

	public PokemonSprites getSprites() {
		return sprites;
	}

	public Pokemon setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
		return this;
	}

	public PokemonSpecies getSpecies() {
		if(!species.getIsFetched()) {
			species = species.get();
		}
		return species;
	}

	public Pokemon setSpecies(PokemonSpecies species) {
		this.species = species;
		return this;
	}

	public ArrayList<PokemonStat> getStats() {
		return stats;
	}

	public Pokemon setStats(ArrayList<PokemonStat> stats) {
		this.stats = stats;
		return this;
	}

	public ArrayList<PokemonType> getTypes() {
		return types;
	}

	public Pokemon setTypes(ArrayList<PokemonType> types) {
		this.types = types;
		return this;
	}

	private static Pokemon get(String url) {
		Pokemon obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Pokemon.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Pokemon get() {
		return Pokemon.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon", limit, offset);
	}

	public static Pokemon getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon/" + id);
	}

	public static Pokemon getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon/" + name);
	}
}