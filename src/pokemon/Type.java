package pokemon;
/*
{
    "id": 5,
    "name": "ground",
    "damage_relations": {
        "no_damage_to": [{
            "name": "flying",
            "url": "http://pokeapi.co/api/v2/type/3/"
        }],
        "half_damage_to": [{
            "name": "bug",
            "url": "http://pokeapi.co/api/v2/type/7/"
        }],
        "double_damage_to": [{
            "name": "poison",
            "url": "http://pokeapi.co/api/v2/type/4/"
        }],
        "no_damage_from": [{
            "name": "electric",
            "url": "http://pokeapi.co/api/v2/type/13/"
        }],
        "half_damage_from": [{
            "name": "poison",
            "url": "http://pokeapi.co/api/v2/type/4/"
        }],
        "double_damage_from": [{
            "name": "water",
            "url": "http://pokeapi.co/api/v2/type/11/"
        }]
    },
    "game_indices": [{
        "game_index": 4,
        "generation": {
            "name": "generation-i",
            "url": "http://pokeapi.co/api/v2/generation/1/"
        }
    }],
    "generation": {
        "name": "generation-i",
        "url": "http://pokeapi.co/api/v2/generation/1/"
    },
    "move_damage_class": {
        "name": "physical",
        "url": "http://pokeapi.co/api/v2/move-damage-class/2/"
    },
    "names": [{
        "name": "ã˜ã‚ã‚“",
        "language": {
            "name": "ja",
            "url": "http://pokeapi.co/api/v2/language/1/"
        }
    }],
    "pokemon": [{
        "slot": 1,
        "pokemon": {
            "name": "sandshrew",
            "url": "http://pokeapi.co/api/v2/pokemon/27/"
        }
    }],
    "moves": [{
        "name": "sand-attack",
        "url": "http://pokeapi.co/api/v2/move/28/"
    }]
}
*/

public class Type extends common.NamedAPIResource {
	// The identifier for this type resource
	private int id;

	// A detail of how effective this type is toward others and vice versa
	private pokemon.TypeRelations damage_relations;

	// A list of game indices relevent to this item by generation
	private java.util.ArrayList<common.GenerationGameIndex> game_indices;

	// The generation this type was introduced in
	private games.Generation generation;

	// The class of damage inflicted by this type
	private moves.MoveDamageClass move_damage_class;

	// The name of this type listed in different languages
	private java.util.ArrayList<common.Name> names;

	// A list of details of Pokémon that have this type
	private java.util.ArrayList<pokemon.TypePokemon> pokemon;

	// A list of moves that have this type
	private java.util.ArrayList<moves.Move> moves;

	public static Type getById(int id) {
		String url = "https://pokeapi.co/api/v2/type/" + id;
		String json = tools.Internet.get(url);
		Type obj = new com.google.gson.Gson().fromJson(json, Type.class);
		return obj;
	}

	public static Type getByName(String name) {
		String url = "https://pokeapi.co/api/v2/type/" + name;
		String json = tools.Internet.get(url);
		Type obj = new com.google.gson.Gson().fromJson(json, Type.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Type setId(int id) {
		this.id = id;
		return this;
	}

	public pokemon.TypeRelations getDamageRelations() {
		return damage_relations;
	}

	public Type setDamageRelations(pokemon.TypeRelations damage_relations) {
		this.damage_relations = damage_relations;
		return this;
	}

	public java.util.ArrayList<common.GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Type setGameIndices(java.util.ArrayList<common.GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public games.Generation getGeneration() {
		return generation;
	}

	public Type setGeneration(games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public moves.MoveDamageClass getMoveDamageClass() {
		return move_damage_class;
	}

	public Type setMoveDamageClass(moves.MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Type setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokemon.TypePokemon> getPokemon() {
		return pokemon;
	}

	public Type setPokemon(java.util.ArrayList<pokemon.TypePokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public java.util.ArrayList<moves.Move> getMoves() {
		return moves;
	}

	public Type setMoves(java.util.ArrayList<moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}