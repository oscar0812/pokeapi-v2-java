package models.pokemon;
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

public class Nature extends models.common.NamedAPIResource {
	// The identifier for this nature resource
	private int id;

	// The stat decreased by 10% in Pokémon with this nature
	private models.pokemon.Stat decreased_stat;

	// The stat increased by 10% in Pokémon with this nature
	private models.pokemon.Stat increased_stat;

	// The flavor hated by Pokémon with this nature
	private models.berries.BerryFlavor hates_flavor;

	// The flavor liked by Pokémon with this nature
	private models.berries.BerryFlavor likes_flavor;

	// A list of Pokéathlon stats this nature effects and how much it effects them
	private java.util.ArrayList<models.pokemon.NatureStatChange> pokeathlon_stat_changes;

	// A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	private java.util.ArrayList<models.pokemon.MoveBattleStylePreference> move_battle_style_preferences;

	// The name of this nature listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static Nature get(String url) {
		String json = api.Information.fromInternet(url);
		Nature obj = new com.google.gson.Gson().fromJson(json, Nature.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Nature getById(int id) {
		return get("https://pokeapi.co/api/v2/nature/" + id);
	}

	public static Nature getByName(String name) {
		return get("https://pokeapi.co/api/v2/nature/" + name);
	}

	public int getId() {
		return id;
	}

	public Nature setId(int id) {
		this.id = id;
		return this;
	}

	public models.pokemon.Stat getDecreasedStat() {
		return decreased_stat;
	}

	public Nature setDecreasedStat(models.pokemon.Stat decreased_stat) {
		this.decreased_stat = decreased_stat;
		return this;
	}

	public models.pokemon.Stat getIncreasedStat() {
		return increased_stat;
	}

	public Nature setIncreasedStat(models.pokemon.Stat increased_stat) {
		this.increased_stat = increased_stat;
		return this;
	}

	public models.berries.BerryFlavor getHatesFlavor() {
		return hates_flavor;
	}

	public Nature setHatesFlavor(models.berries.BerryFlavor hates_flavor) {
		this.hates_flavor = hates_flavor;
		return this;
	}

	public models.berries.BerryFlavor getLikesFlavor() {
		return likes_flavor;
	}

	public Nature setLikesFlavor(models.berries.BerryFlavor likes_flavor) {
		this.likes_flavor = likes_flavor;
		return this;
	}

	public java.util.ArrayList<models.pokemon.NatureStatChange> getPokeathlonStatChanges() {
		return pokeathlon_stat_changes;
	}

	public Nature setPokeathlonStatChanges(java.util.ArrayList<models.pokemon.NatureStatChange> pokeathlon_stat_changes) {
		this.pokeathlon_stat_changes = pokeathlon_stat_changes;
		return this;
	}

	public java.util.ArrayList<models.pokemon.MoveBattleStylePreference> getMoveBattleStylePreferences() {
		return move_battle_style_preferences;
	}

	public Nature setMoveBattleStylePreferences(java.util.ArrayList<models.pokemon.MoveBattleStylePreference> move_battle_style_preferences) {
		this.move_battle_style_preferences = move_battle_style_preferences;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Nature setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}