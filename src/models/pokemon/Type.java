package models.pokemon;
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
    "models.pokemon": [{
        "slot": 1,
        "models.pokemon": {
            "name": "sandshrew",
            "url": "http://pokeapi.co/api/v2/pokemon/27/"
        }
    }],
    "models.moves": [{
        "name": "sand-attack",
        "url": "http://pokeapi.co/api/v2/move/28/"
    }]
}
*/

public class Type extends models.common.NamedAPIResource {
	// The identifier for this type models.resource
	private int id;

	// A detail of how effective this type is toward others and vice versa
	private models.pokemon.TypeRelations damage_relations;

	// A list of game indices relevent to this item by generation
	private java.util.ArrayList<models.common.GenerationGameIndex> game_indices;

	// The generation this type was introduced in
	private models.games.Generation generation;

	// The class of damage inflicted by this type
	private models.moves.MoveDamageClass move_damage_class;

	// The name of this type listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of details of Pokémon that have this type
	private java.util.ArrayList<models.pokemon.TypePokemon> pokemon;

	// A list of models.moves that have this type
	private java.util.ArrayList<models.moves.Move> moves;

	private static Type get(String url) {
		String json = api.Information.fromInternet(url);
		Type obj = new com.google.gson.Gson().fromJson(json, Type.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Type getById(int id) {
		return get("https://pokeapi.co/api/v2/type/" + id);
	}

	public static Type getByName(String name) {
		return get("https://pokeapi.co/api/v2/type/" + name);
	}

	public int getId() {
		return id;
	}

	public Type setId(int id) {
		this.id = id;
		return this;
	}

	public models.pokemon.TypeRelations getDamageRelations() {
		return damage_relations;
	}

	public Type setDamageRelations(models.pokemon.TypeRelations damage_relations) {
		this.damage_relations = damage_relations;
		return this;
	}

	public java.util.ArrayList<models.common.GenerationGameIndex> getGameIndices() {
		return game_indices;
	}

	public Type setGameIndices(java.util.ArrayList<models.common.GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public models.games.Generation getGeneration() {
		return generation;
	}

	public Type setGeneration(models.games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public models.moves.MoveDamageClass getMoveDamageClass() {
		return move_damage_class;
	}

	public Type setMoveDamageClass(models.moves.MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public Type setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.TypePokemon> getPokemon() {
		return pokemon;
	}

	public Type setPokemon(java.util.ArrayList<models.pokemon.TypePokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public java.util.ArrayList<models.moves.Move> getMoves() {
		return moves;
	}

	public Type setMoves(java.util.ArrayList<models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}