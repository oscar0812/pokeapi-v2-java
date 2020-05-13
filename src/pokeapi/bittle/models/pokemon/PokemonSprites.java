/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 12,
  "name": "butterfree",
  "base_experience": 178,
  "height": 11,
  "is_default": true,
  "order": 16,
  "weight": 320,
  "abilities": [
    {
      "is_hidden": true,
      "slot": 3,
      "ability": {
        "name": "tinted-lens",
        "url": "https://pokeapi.co/api/v2/ability/110/"
      }
    }
  ],
  "forms": [
    {
      "name": "butterfree",
      "url": "https://pokeapi.co/api/v2/pokemon-form/12/"
    }
  ],
  "game_indices": [
    {
      "game_index": 12,
      "version": {
        "name": "white-2",
        "url": "https://pokeapi.co/api/v2/version/22/"
      }
    }
  ],
  "held_items": [
    {
      "item": {
        "name": "silver-powder",
        "url": "https://pokeapi.co/api/v2/item/199/"
      },
      "version_details": [
        {
          "rarity": 5,
          "version": {
            "name": "y",
            "url": "https://pokeapi.co/api/v2/version/24/"
          }
        }
      ]
    }
  ],
  "location_area_encounters": [
    {
      "location_area": {
        "name": "kanto-route-2-south-towards-viridian-city",
        "url": "https://pokeapi.co/api/v2/location-area/296/"
      },
      "version_details": [
        {
          "max_chance": 10,
          "encounter_details": [
            {
              "min_level": 7,
              "max_level": 7,
              "condition_values": [
                {
                  "name": "time-morning",
                  "url": "https://pokeapi.co/api/v2/encounter-condition-value/3/"
                }
              ],
              "chance": 5,
              "method": {
                "name": "walk",
                "url": "https://pokeapi.co/api/v2/encounter-method/1/"
              }
            }
          ],
          "version": {
            "name": "heartgold",
            "url": "https://pokeapi.co/api/v2/version/15/"
          }
        }
      ]
    }
  ],
  "moves": [
    {
      "move": {
        "name": "flash",
        "url": "https://pokeapi.co/api/v2/move/148/"
      },
      "version_group_details": [
        {
          "level_learned_at": 0,
          "version_group": {
            "name": "x-y",
            "url": "https://pokeapi.co/api/v2/version-group/15/"
          },
          "move_learn_method": {
            "name": "machine",
            "url": "https://pokeapi.co/api/v2/move-learn-method/4/"
          }
        }
      ]
    }
  ],
  "species": {
    "name": "butterfree",
    "url": "https://pokeapi.co/api/v2/pokemon-species/12/"
  },
  "sprites": {
    "back_female": "http://pokeapi.co/media/sprites/pokemon/back/female/12.png",
    "back_shiny_female": "http://pokeapi.co/media/sprites/pokemon/back/shiny/female/12.png",
    "back_default": "http://pokeapi.co/media/sprites/pokemon/back/12.png",
    "front_female": "http://pokeapi.co/media/sprites/pokemon/female/12.png",
    "front_shiny_female": "http://pokeapi.co/media/sprites/pokemon/shiny/female/12.png",
    "back_shiny": "http://pokeapi.co/media/sprites/pokemon/back/shiny/12.png",
    "front_default": "http://pokeapi.co/media/sprites/pokemon/12.png",
    "front_shiny": "http://pokeapi.co/media/sprites/pokemon/shiny/12.png"
  },
  "stats": [
    {
      "base_stat": 70,
      "effort": 0,
      "stat": {
        "name": "speed",
        "url": "https://pokeapi.co/api/v2/stat/6/"
      }
    }
  ],
  "types": [
    {
      "slot": 2,
      "type": {
        "name": "flying",
        "url": "https://pokeapi.co/api/v2/type/3/"
      }
    }
  ]
}
*/

public class PokemonSprites {
	// The default depiction of this Pokémon from the front in battle.
	private String front_default;

	// The shiny depiction of this Pokémon from the front in battle.
	private String front_shiny;

	// The female depiction of this Pokémon from the front in battle.
	private String front_female;

	// The shiny female depiction of this Pokémon from the front in battle.
	private String front_shiny_female;

	// The default depiction of this Pokémon from the back in battle.
	private String back_default;

	// The shiny depiction of this Pokémon from the back in battle.
	private String back_shiny;

	// The female depiction of this Pokémon from the back in battle.
	private String back_female;

	// The shiny female depiction of this Pokémon from the back in battle.
	private String back_shiny_female;

	public String getFrontDefault() {
		return front_default;
	}

	public PokemonSprites setFrontDefault(String front_default) {
		this.front_default = front_default;
		return this;
	}

	public String getFrontShiny() {
		return front_shiny;
	}

	public PokemonSprites setFrontShiny(String front_shiny) {
		this.front_shiny = front_shiny;
		return this;
	}

	public String getFrontFemale() {
		return front_female;
	}

	public PokemonSprites setFrontFemale(String front_female) {
		this.front_female = front_female;
		return this;
	}

	public String getFrontShinyFemale() {
		return front_shiny_female;
	}

	public PokemonSprites setFrontShinyFemale(String front_shiny_female) {
		this.front_shiny_female = front_shiny_female;
		return this;
	}

	public String getBackDefault() {
		return back_default;
	}

	public PokemonSprites setBackDefault(String back_default) {
		this.back_default = back_default;
		return this;
	}

	public String getBackShiny() {
		return back_shiny;
	}

	public PokemonSprites setBackShiny(String back_shiny) {
		this.back_shiny = back_shiny;
		return this;
	}

	public String getBackFemale() {
		return back_female;
	}

	public PokemonSprites setBackFemale(String back_female) {
		this.back_female = back_female;
		return this;
	}

	public String getBackShinyFemale() {
		return back_shiny_female;
	}

	public PokemonSprites setBackShinyFemale(String back_shiny_female) {
		this.back_shiny_female = back_shiny_female;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}