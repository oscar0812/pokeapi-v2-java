/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 2,
  "name": "attack",
  "game_index": 2,
  "is_battle_only": false,
  "affecting_moves": {
    "increase": [
      {
        "change": 2,
        "move": {
          "name": "swords-dance",
          "url": "https://pokeapi.co/api/v2/move/14/"
        }
      }
    ],
    "decrease": [
      {
        "change": -1,
        "move": {
          "name": "growl",
          "url": "https://pokeapi.co/api/v2/move/45/"
        }
      }
    ]
  },
  "affecting_natures": {
    "increase": [
      {
        "name": "lonely",
        "url": "https://pokeapi.co/api/v2/nature/6/"
      }
    ],
    "decrease": [
      {
        "name": "bold",
        "url": "https://pokeapi.co/api/v2/nature/2/"
      }
    ]
  },
  "characteristics": [
    {
      "url": "https://pokeapi.co/api/v2/characteristic/2/"
    }
  ],
  "move_damage_class": {
    "name": "physical",
    "url": "https://pokeapi.co/api/v2/move-damage-class/2/"
  },
  "names": [
    {
      "name": "ã“ã†ã’ã",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ]
}
*/

public class Stat extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// ID the games use for this stat.
	private int game_index;

	// Whether this stat only exists within a battle.
	private boolean is_battle_only;

	// A detail of moves which affect this stat positively or negatively.
	private pokeapi.bittle.models.pokemon.MoveStatAffectSets affecting_moves;

	// A detail of natures which affect this stat positively or negatively.
	private pokeapi.bittle.models.pokemon.NatureStatAffectSets affecting_natures;

	// A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.Characteristic> characteristics;

	// The class of damage this stat is directly related to.
	private pokeapi.bittle.models.moves.MoveDamageClass move_damage_class;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

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

	public boolean getIsBattleOnly() {
		return is_battle_only;
	}

	public Stat setIsBattleOnly(boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
		return this;
	}

	public pokeapi.bittle.models.pokemon.MoveStatAffectSets getAffectingMoves() {
		return affecting_moves;
	}

	public Stat setAffectingMoves(pokeapi.bittle.models.pokemon.MoveStatAffectSets affecting_moves) {
		this.affecting_moves = affecting_moves;
		return this;
	}

	public pokeapi.bittle.models.pokemon.NatureStatAffectSets getAffectingNatures() {
		return affecting_natures;
	}

	public Stat setAffectingNatures(pokeapi.bittle.models.pokemon.NatureStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.Characteristic> getCharacteristics() {
		return characteristics;
	}

	public Stat setCharacteristics(java.util.ArrayList<pokeapi.bittle.models.pokemon.Characteristic> characteristics) {
		this.characteristics = characteristics;
		return this;
	}

	public pokeapi.bittle.models.moves.MoveDamageClass getMoveDamageClass() {
		if(!move_damage_class.getIsFetched()) {
			move_damage_class = move_damage_class.get();
		}
		return move_damage_class;
	}

	public Stat setMoveDamageClass(pokeapi.bittle.models.moves.MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public Stat setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	private static Stat get(String url) {
		Stat obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Stat.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Stat get() {
		return Stat.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("stat", limit, offset);
	}

	public static Stat getById(int id) {
		return get("https://pokeapi.co/api/v2/stat/" + id);
	}

	public static Stat getByName(String name) {
		return get("https://pokeapi.co/api/v2/stat/" + name);
	}
}