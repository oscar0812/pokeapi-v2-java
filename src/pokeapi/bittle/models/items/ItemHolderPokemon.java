/* An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. */

package pokeapi.bittle.models.items;
/*
{
  "id": 1,
  "name": "master-ball",
  "cost": 0,
  "fling_power": 10,
  "fling_effect": {
    "name": "flinch",
    "url": "https://pokeapi.co/api/v2/item-fling-effect/7/"
  },
  "attributes": [
    {
      "name": "holdable",
      "url": "https://pokeapi.co/api/v2/item-attribute/5/"
    }
  ],
  "category": {
    "name": "standard-balls",
    "url": "https://pokeapi.co/api/v2/item-category/34/"
  },
  "effect_entries": [
    {
      "effect": "Used in battle\n:   [Catches]{mechanic:catch} a wild Pokémon without fail.\n\n    If used in a trainer battle, nothing happens and the ball is lost.",
      "short_effect": "Catches a wild Pokémon every time.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "text": "The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail.",
      "version_group": {
        "name": "x-y",
        "url": "https://pokeapi.co/api/v2/version-group/15/"
      },
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "game_indices": [
    {
      "game_index": 1,
      "generation": {
        "name": "generation-vi",
        "url": "https://pokeapi.co/api/v2/generation/6/"
      }
    }
  ],
  "names": [
    {
      "name": "Master Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "sprites": {
    "default": "http://pokeapi.co/media/sprites/items/master-ball.png"
  },
  "held_by_pokemon": [
    {
      "pokemon": {
        "name": "chansey",
        "url": "https://pokeapi.co/api/v2/pokemon/113/"
      },
      "version_details": [
        {
          "rarity": 50,
          "version": {
            "name": "soulsilver",
            "url": "https://pokeapi.co/api/v2/version/16/"
          }
        }
      ]
    }
  ],
  "baby_trigger_for": {
    "url": "https://pokeapi.co/api/v2/evolution-chain/1/"
  }
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.pokemon.Pokemon;

public class ItemHolderPokemon {
	// The Pokémon that holds this item.
	private Pokemon pokemon;

	// The details for the version that this item is held in by the Pokémon.
	private ArrayList<ItemHolderPokemonVersionDetail> version_details;

	public Pokemon getPokemon() {
		if(!pokemon.getIsFetched()) {
			pokemon = pokemon.get();
		}
		return pokemon;
	}

	public ItemHolderPokemon setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public ArrayList<ItemHolderPokemonVersionDetail> getVersionDetails() {
		return version_details;
	}

	public ItemHolderPokemon setVersionDetails(ArrayList<ItemHolderPokemonVersionDetail> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}