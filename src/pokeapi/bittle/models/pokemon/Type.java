/* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 5,
  "name": "ground",
  "damage_relations": {
    "no_damage_to": [
      {
        "name": "flying",
        "url": "https://pokeapi.co/api/v2/type/3/"
      }
    ],
    "half_damage_to": [
      {
        "name": "bug",
        "url": "https://pokeapi.co/api/v2/type/7/"
      }
    ],
    "double_damage_to": [
      {
        "name": "poison",
        "url": "https://pokeapi.co/api/v2/type/4/"
      }
    ],
    "no_damage_from": [
      {
        "name": "electric",
        "url": "https://pokeapi.co/api/v2/type/13/"
      }
    ],
    "half_damage_from": [
      {
        "name": "poison",
        "url": "https://pokeapi.co/api/v2/type/4/"
      }
    ],
    "double_damage_from": [
      {
        "name": "water",
        "url": "https://pokeapi.co/api/v2/type/11/"
      }
    ]
  },
  "game_indices": [
    {
      "game_index": 4,
      "generation": {
        "name": "generation-i",
        "url": "https://pokeapi.co/api/v2/generation/1/"
      }
    }
  ],
  "generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "move_damage_class": {
    "name": "physical",
    "url": "https://pokeapi.co/api/v2/move-damage-class/2/"
  },
  "names": [
    {
      "name": "ã˜ã‚ã‚“",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ],
  "pokemon": [
    {
      "slot": 1,
      "pokemon": {
        "name": "sandshrew",
        "url": "https://pokeapi.co/api/v2/pokemon/27/"
      }
    }
  ],
  "moves": [
    {
      "name": "sand-attack",
      "url": "https://pokeapi.co/api/v2/move/28/"
    }
  ]
}
*/

public class Type extends pokeapi.bittle.models.utility.NamedAPIResource {
	public int getId() {
				return id;
	}

	public Type setId(int id) {
		this.id = id;
		return this;
	}

	public pokeapi.bittle.models.pokemon.TypeRelations getDamageRelations() {
				return damage_relations;
	}

	public Type setDamageRelations(pokeapi.bittle.models.pokemon.TypeRelations damage_relations) {
		this.damage_relations = damage_relations;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.GenerationGameIndex> getGameIndices() {
				return game_indices;
	}

	public Type setGameIndices(java.util.ArrayList<pokeapi.bittle.models.utility.GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public pokeapi.bittle.models.games.Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}

		return generation;
	}

	public Type setGeneration(pokeapi.bittle.models.games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public pokeapi.bittle.models.moves.MoveDamageClass getMoveDamageClass() {
		if(!move_damage_class.getIsFetched()) {
			move_damage_class = move_damage_class.get();
		}

		return move_damage_class;
	}

	public Type setMoveDamageClass(pokeapi.bittle.models.moves.MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
				return names;
	}

	public Type setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.TypePokemon> getPokemon() {
				return pokemon;
	}

	public Type setPokemon(java.util.ArrayList<pokeapi.bittle.models.pokemon.TypePokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.Move> getMoves() {
				return moves;
	}

	public Type setMoves(java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	// The identifier for this resource.
	private int id;

	// A detail of how effective this type is toward others and vice versa.
	private pokeapi.bittle.models.pokemon.TypeRelations damage_relations;

	// A list of game indices relevent to this item by generation.
	private java.util.ArrayList<pokeapi.bittle.models.utility.GenerationGameIndex> game_indices;

	// The generation this type was introduced in.
	private pokeapi.bittle.models.games.Generation generation;

	// The class of damage inflicted by this type.
	private pokeapi.bittle.models.moves.MoveDamageClass move_damage_class;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// A list of details of Pokémon that have this type.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.TypePokemon> pokemon;

	// A list of moves that have this type.
	private java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves;

	private static Type get(String url) {
		Type obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Type.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Type get() {
		return Type.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("type", limit, offset);
	}

	public static Type getById(int id) {
		return get("https://pokeapi.co/api/v2/type/" + id);
	}

	public static Type getByName(String name) {
		return get("https://pokeapi.co/api/v2/type/" + name);
	}
}