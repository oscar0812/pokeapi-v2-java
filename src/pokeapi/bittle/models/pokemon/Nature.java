/* Natures influence how a Pokémon's stats grow. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 2,
  "name": "bold",
  "decreased_stat": {
    "name": "attack",
    "url": "https://pokeapi.co/api/v2/stat/2/"
  },
  "increased_stat": {
    "name": "defense",
    "url": "https://pokeapi.co/api/v2/stat/3/"
  },
  "likes_flavor": {
    "name": "sour",
    "url": "https://pokeapi.co/api/v2/berry-flavor/5/"
  },
  "hates_flavor": {
    "name": "spicy",
    "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
  },
  "pokeathlon_stat_changes": [
    {
      "max_change": -2,
      "pokeathlon_stat": {
        "name": "speed",
        "url": "https://pokeapi.co/api/v2/pokeathlon-stat/1/"
      }
    }
  ],
  "move_battle_style_preferences": [
    {
      "low_hp_preference": 32,
      "high_hp_preference": 30,
      "move_battle_style": {
        "name": "attack",
        "url": "https://pokeapi.co/api/v2/move-battle-style/1/"
      }
    }
  ],
  "names": [
    {
      "name": "がんばりや",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ]
}
*/

public class Nature extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public Nature setId(int id) {
		this.id = id;
		return this;
	}

	public pokeapi.bittle.models.pokemon.Stat getDecreasedStat() {
		if(!decreased_stat.getIsFetched()) {
			decreased_stat = decreased_stat.get();
		}

		return decreased_stat;
	}

	public Nature setDecreasedStat(pokeapi.bittle.models.pokemon.Stat decreased_stat) {
		this.decreased_stat = decreased_stat;
		return this;
	}

	public pokeapi.bittle.models.pokemon.Stat getIncreasedStat() {
		if(!increased_stat.getIsFetched()) {
			increased_stat = increased_stat.get();
		}

		return increased_stat;
	}

	public Nature setIncreasedStat(pokeapi.bittle.models.pokemon.Stat increased_stat) {
		this.increased_stat = increased_stat;
		return this;
	}

	public pokeapi.bittle.models.berries.BerryFlavor getHatesFlavor() {
		if(!hates_flavor.getIsFetched()) {
			hates_flavor = hates_flavor.get();
		}

		return hates_flavor;
	}

	public Nature setHatesFlavor(pokeapi.bittle.models.berries.BerryFlavor hates_flavor) {
		this.hates_flavor = hates_flavor;
		return this;
	}

	public pokeapi.bittle.models.berries.BerryFlavor getLikesFlavor() {
		if(!likes_flavor.getIsFetched()) {
			likes_flavor = likes_flavor.get();
		}

		return likes_flavor;
	}

	public Nature setLikesFlavor(pokeapi.bittle.models.berries.BerryFlavor likes_flavor) {
		this.likes_flavor = likes_flavor;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.NatureStatChange> getPokeathlonStatChanges() {
				return pokeathlon_stat_changes;
	}

	public Nature setPokeathlonStatChanges(java.util.ArrayList<pokeapi.bittle.models.pokemon.NatureStatChange> pokeathlon_stat_changes) {
		this.pokeathlon_stat_changes = pokeathlon_stat_changes;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.MoveBattleStylePreference> getMoveBattleStylePreferences() {
				return move_battle_style_preferences;
	}

	public Nature setMoveBattleStylePreferences(java.util.ArrayList<pokeapi.bittle.models.pokemon.MoveBattleStylePreference> move_battle_style_preferences) {
		this.move_battle_style_preferences = move_battle_style_preferences;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public Nature setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// The stat decreased by 10% in Pokémon with this nature.
	private pokeapi.bittle.models.pokemon.Stat decreased_stat;

	// The stat increased by 10% in Pokémon with this nature.
	private pokeapi.bittle.models.pokemon.Stat increased_stat;

	// The flavor hated by Pokémon with this nature.
	private pokeapi.bittle.models.berries.BerryFlavor hates_flavor;

	// The flavor liked by Pokémon with this nature.
	private pokeapi.bittle.models.berries.BerryFlavor likes_flavor;

	// A list of Pokéathlon stats this nature effects and how much it effects them.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.NatureStatChange> pokeathlon_stat_changes;

	// A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.MoveBattleStylePreference> move_battle_style_preferences;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	private static Nature get(String url) {
		Nature obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Nature.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Nature get() {
		return Nature.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("nature", limit, offset);
	}

	public static Nature getById(int id) {
		return get("https://pokeapi.co/api/v2/nature/" + id);
	}

	public static Nature getByName(String name) {
		return get("https://pokeapi.co/api/v2/nature/" + name);
	}
}