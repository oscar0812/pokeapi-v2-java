package pokemon;
/*
{
    "id": 2,
    "name": "bold",
    "decreased_stat": {
        "name": "attack",
        "url": "http://pokeapi.co/api/v2/stat/2/"
    },
    "increased_stat": {
        "name": "defense",
        "url": "http://pokeapi.co/api/v2/stat/3/"
    },
    "likes_flavor": {
        "name": "sour",
        "url": "http://pokeapi.co/api/v2/berry-flavor/5/"
    },
    "hates_flavor": {
        "name": "spicy",
        "url": "http://pokeapi.co/api/v2/berry-flavor/1/"
    },
    "pokeathlon_stat_changes": [{
        "max_change": -2,
        "pokeathlon_stat": {
            "name": "speed",
            "url": "http://pokeapi.co/api/v2/pokeathlon-stat/1/"
        }
    }],
    "move_battle_style_preferences": [{
        "low_hp_preference": 32,
        "high_hp_preference": 30,
        "move_battle_style": {
            "name": "attack",
            "url": "http://pokeapi.co/api/v2/move-battle-style/1/"
        }
    }],
    "names": [{
        "name": "ãšã¶ã¨ã„",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }]
}
*/

public class Nature extends common.NamedAPIResource {
	// The identifier for this nature resource
	private int id;

	// The stat decreased by 10% in Pokémon with this nature
	private pokemon.Stat decreased_stat;

	// The stat increased by 10% in Pokémon with this nature
	private pokemon.Stat increased_stat;

	// The flavor hated by Pokémon with this nature
	private berries.BerryFlavor hates_flavor;

	// The flavor liked by Pokémon with this nature
	private berries.BerryFlavor likes_flavor;

	// A list of Pokéathlon stats this nature effects and how much it effects them
	private java.util.ArrayList<pokemon.NatureStatChange> pokeathlon_stat_changes;

	// A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	private java.util.ArrayList<pokemon.MoveBattleStylePreference> move_battle_style_preferences;

	// The name of this nature listed in different languages
	private java.util.ArrayList<common.Name> names;

	public static Nature getById(int id) {
		String url = "https://pokeapi.co/api/v2/nature/" + id;
		String json = tools.Internet.get(url);
		Nature obj = new com.google.gson.Gson().fromJson(json, Nature.class);
		return obj;
	}

	public static Nature getByName(String name) {
		String url = "https://pokeapi.co/api/v2/nature/" + name;
		String json = tools.Internet.get(url);
		Nature obj = new com.google.gson.Gson().fromJson(json, Nature.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Nature setId(int id) {
		this.id = id;
		return this;
	}

	public pokemon.Stat getDecreasedStat() {
		return decreased_stat;
	}

	public Nature setDecreasedStat(pokemon.Stat decreased_stat) {
		this.decreased_stat = decreased_stat;
		return this;
	}

	public pokemon.Stat getIncreasedStat() {
		return increased_stat;
	}

	public Nature setIncreasedStat(pokemon.Stat increased_stat) {
		this.increased_stat = increased_stat;
		return this;
	}

	public berries.BerryFlavor getHatesFlavor() {
		return hates_flavor;
	}

	public Nature setHatesFlavor(berries.BerryFlavor hates_flavor) {
		this.hates_flavor = hates_flavor;
		return this;
	}

	public berries.BerryFlavor getLikesFlavor() {
		return likes_flavor;
	}

	public Nature setLikesFlavor(berries.BerryFlavor likes_flavor) {
		this.likes_flavor = likes_flavor;
		return this;
	}

	public java.util.ArrayList<pokemon.NatureStatChange> getPokeathlonStatChanges() {
		return pokeathlon_stat_changes;
	}

	public Nature setPokeathlonStatChanges(java.util.ArrayList<pokemon.NatureStatChange> pokeathlon_stat_changes) {
		this.pokeathlon_stat_changes = pokeathlon_stat_changes;
		return this;
	}

	public java.util.ArrayList<pokemon.MoveBattleStylePreference> getMoveBattleStylePreferences() {
		return move_battle_style_preferences;
	}

	public Nature setMoveBattleStylePreferences(java.util.ArrayList<pokemon.MoveBattleStylePreference> move_battle_style_preferences) {
		this.move_battle_style_preferences = move_battle_style_preferences;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Nature setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}