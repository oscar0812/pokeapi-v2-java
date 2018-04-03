package models.pokemon;
/*
{
    "id": 2,
    "name": "attack",
    "game_index": 2,
    "is_battle_only": false,
    "affecting_moves": {
        "increase": [{
            "change": 2,
            "move": {
                "name": "swords-dance",
                "url": "http://pokeapi.co/api/v2/move/14/"
            }
        }],
        "decrease": [{
            "change": -1,
            "move": {
                "name": "growl",
                "url": "http://pokeapi.co/api/v2/move/45/"
            }
        }]
    },
    "affecting_natures": {
        "increase": [{
            "name": "lonely",
            "url": "http://pokeapi.co/api/v2/nature/6/"
        }],
        "decrease": [{
            "name": "bold",
            "url": "http://pokeapi.co/api/v2/nature/2/"
        }]
    },
    "characteristics": [{
        "url": "http://pokeapi.co/api/v2/characteristic/2/"
    }],
    "move_damage_class": {
        "name": "physical",
        "url": "http://pokeapi.co/api/v2/move-damage-class/2/"
    },
    "names": [{
        "name": "ã“ã†ã’ã",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }]
}
*/

public class Stat extends models.common.NamedAPIResource {
	// The identifier for this stat resource
	private int id;

	// ID the games use for this stat
	private int game_index;

	// Whether this stat only exists within a battle
	private boolean is_battle_only;

	// A detail of moves which affect this stat positively or negatively
	private models.pokemon.MoveStatAffectSets affecting_moves;

	// A detail of natures which affect this stat positively or negatively
	private models.pokemon.NatureStatAffectSets affecting_natures;

	// A list of characteristics that are set on a Pokémon when its highest base stat is this stat
	private java.util.ArrayList<models.pokemon.Characteristic> characteristics;

	// The class of damage this stat is directly related to
	private models.moves.MoveDamageClass move_damage_class;

	// The name of this region listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	private static Stat get(String url) {
		String json = api.Information.fromInternet(url);
		Stat obj = new com.google.gson.Gson().fromJson(json, Stat.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Stat getById(int id) {
		return get("https://pokeapi.co/api/v2/stat/" + id);
	}

	public static Stat getByName(String name) {
		return get("https://pokeapi.co/api/v2/stat/" + name);
	}

	public int getId() {
		return id;
	}

	public Stat setId(int id) {
		this.id = id;
		return this;
	}

	public int getGameIndex() {
		return game_index;
	}

	public Stat setGameIndex(int game_index) {
		this.game_index = game_index;
		return this;
	}

	public boolean isBattleOnly() {
		return is_battle_only;
	}

	public Stat setIsBattleOnly(boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
		return this;
	}

	public models.pokemon.MoveStatAffectSets getAffectingMoves() {
		return affecting_moves;
	}

	public Stat setAffectingMoves(models.pokemon.MoveStatAffectSets affecting_moves) {
		this.affecting_moves = affecting_moves;
		return this;
	}

	public models.pokemon.NatureStatAffectSets getAffectingNatures() {
		return affecting_natures;
	}

	public Stat setAffectingNatures(models.pokemon.NatureStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	public java.util.ArrayList<models.pokemon.Characteristic> getCharacteristics() {
		return characteristics;
	}

	public Stat setCharacteristics(java.util.ArrayList<models.pokemon.Characteristic> characteristics) {
		this.characteristics = characteristics;
		return this;
	}

	public models.moves.MoveDamageClass getMoveDamageClass() {
		return move_damage_class;
	}

	public Stat setMoveDamageClass(models.moves.MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Stat setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}