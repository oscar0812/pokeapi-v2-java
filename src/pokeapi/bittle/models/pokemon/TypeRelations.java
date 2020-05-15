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

public class TypeRelations {
	// A list of types this type has no effect on.
	private ArrayList<Type> no_damage_to;

	// A list of types this type is not very effect against.
	private ArrayList<Type> half_damage_to;

	// A list of types this type is very effect against.
	private ArrayList<Type> double_damage_to;

	// A list of types that have no effect on this type.
	private ArrayList<Type> no_damage_from;

	// A list of types that are not very effective against this type.
	private ArrayList<Type> half_damage_from;

	// A list of types that are very effective against this type.
	private ArrayList<Type> double_damage_from;

	public ArrayList<Type> getNoDamageTo() {
		return no_damage_to;
	}

	public TypeRelations setNoDamageTo(ArrayList<Type> no_damage_to) {
		this.no_damage_to = no_damage_to;
		return this;
	}

	public ArrayList<Type> getHalfDamageTo() {
		return half_damage_to;
	}

	public TypeRelations setHalfDamageTo(ArrayList<Type> half_damage_to) {
		this.half_damage_to = half_damage_to;
		return this;
	}

	public ArrayList<Type> getDoubleDamageTo() {
		return double_damage_to;
	}

	public TypeRelations setDoubleDamageTo(ArrayList<Type> double_damage_to) {
		this.double_damage_to = double_damage_to;
		return this;
	}

	public ArrayList<Type> getNoDamageFrom() {
		return no_damage_from;
	}

	public TypeRelations setNoDamageFrom(ArrayList<Type> no_damage_from) {
		this.no_damage_from = no_damage_from;
		return this;
	}

	public ArrayList<Type> getHalfDamageFrom() {
		return half_damage_from;
	}

	public TypeRelations setHalfDamageFrom(ArrayList<Type> half_damage_from) {
		this.half_damage_from = half_damage_from;
		return this;
	}

	public ArrayList<Type> getDoubleDamageFrom() {
		return double_damage_from;
	}

	public TypeRelations setDoubleDamageFrom(ArrayList<Type> double_damage_from) {
		this.double_damage_from = double_damage_from;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}