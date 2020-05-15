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

import java.util.ArrayList;

public class NatureStatAffectSets {
	// A list of natures and how they change the referenced stat.
	private ArrayList<Nature> increase;

	// A list of nature sand how they change the referenced stat.
	private ArrayList<Nature> decrease;

	public ArrayList<Nature> getIncrease() {
		return increase;
	}

	public NatureStatAffectSets setIncrease(ArrayList<Nature> increase) {
		this.increase = increase;
		return this;
	}

	public ArrayList<Nature> getDecrease() {
		return decrease;
	}

	public NatureStatAffectSets setDecrease(ArrayList<Nature> decrease) {
		this.decrease = decrease;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}