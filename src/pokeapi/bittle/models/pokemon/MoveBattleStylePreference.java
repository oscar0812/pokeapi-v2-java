/* Natures influence how a Pokémon's stats grow. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 2,
  "name": "bold",
  "decreased_stat": {
    "name": "attack",
    "url": "https://pokeapi.co/api/v2/stat/2/"
  },
  "increased_stat": {
    "name": "defense",
    "url": "https://pokeapi.co/api/v2/stat/3/"
  },
  "likes_flavor": {
    "name": "sour",
    "url": "https://pokeapi.co/api/v2/berry-flavor/5/"
  },
  "hates_flavor": {
    "name": "spicy",
    "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
  },
  "pokeathlon_stat_changes": [
    {
      "max_change": -2,
      "pokeathlon_stat": {
        "name": "speed",
        "url": "https://pokeapi.co/api/v2/pokeathlon-stat/1/"
      }
    }
  ],
  "move_battle_style_preferences": [
    {
      "low_hp_preference": 32,
      "high_hp_preference": 30,
      "move_battle_style": {
        "name": "attack",
        "url": "https://pokeapi.co/api/v2/move-battle-style/1/"
      }
    }
  ],
  "names": [
    {
      "name": "がんばりや",
      "language": {
        "name": "ja",
        "url": "https://pokeapi.co/api/v2/language/1/"
      }
    }
  ]
}
*/

import pokeapi.bittle.models.moves.MoveBattleStyle;

public class MoveBattleStylePreference {
	// Chance of using the move, in percent, if HP is under one half.
	private int low_hp_preference;

	// Chance of using the move, in percent, if HP is over one half.
	private int high_hp_preference;

	// The move battle style.
	private MoveBattleStyle move_battle_style;

	public int getLowHpPreference() {
		return low_hp_preference;
	}

	public MoveBattleStylePreference setLowHpPreference(int low_hp_preference) {
		this.low_hp_preference = low_hp_preference;
		return this;
	}

	public int getHighHpPreference() {
		return high_hp_preference;
	}

	public MoveBattleStylePreference setHighHpPreference(int high_hp_preference) {
		this.high_hp_preference = high_hp_preference;
		return this;
	}

	public MoveBattleStyle getMoveBattleStyle() {
		if(!move_battle_style.getIsFetched()) {
			move_battle_style = move_battle_style.get();
		}
		return move_battle_style;
	}

	public MoveBattleStylePreference setMoveBattleStyle(MoveBattleStyle move_battle_style) {
		this.move_battle_style = move_battle_style;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}