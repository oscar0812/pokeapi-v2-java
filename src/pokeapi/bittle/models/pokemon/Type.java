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

import java.util.ArrayList;
import pokeapi.bittle.models.games.Generation;
import pokeapi.bittle.models.moves.Move;
import pokeapi.bittle.models.moves.MoveDamageClass;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.GenerationGameIndex;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class Type extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A detail of how effective this type is toward others and vice versa.
	private TypeRelations damage_relations;

	// A list of game indices relevent to this item by generation.
	private ArrayList<GenerationGameIndex> game_indices;

	// The generation this type was introduced in.
	private Generation generation;

	// The class of damage inflicted by this type.
	private MoveDamageClass move_damage_class;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of details of Pokémon that have this type.
	private ArrayList<TypePokemon> pokemon;

	// A list of moves that have this type.
	private ArrayList<Move> moves;

	public int getId() {
		return id;
	}

	public Type setId(int id) {
		this.id = id;
		return this;
	}

	public TypeRelations getDamageRelations() {
		return damage_relations;
	}

	public Type setDamageRelations(TypeRelations damage_relations) {
		this.damage_relations = damage_relations;
		return this;
	}

	public ArrayList<GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Type setGameIndices(ArrayList<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}
		return generation;
	}

	public Type setGeneration(Generation generation) {
		this.generation = generation;
		return this;
	}

	public MoveDamageClass getMoveDamageClass() {
		if(!move_damage_class.getIsFetched()) {
			move_damage_class = move_damage_class.get();
		}
		return move_damage_class;
	}

	public Type setMoveDamageClass(MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Type setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<TypePokemon> getPokemon() {
		return pokemon;
	}

	public Type setPokemon(ArrayList<TypePokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public Type setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	private static Type get(String url) {
		Type obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Type.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Type get() {
		return Type.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("type", limit, offset);
	}

	public static Type getById(int id) {
		return get("https://pokeapi.co/api/v2/type/" + id);
	}

	public static Type getByName(String name) {
		return get("https://pokeapi.co/api/v2/type/" + name);
	}
}