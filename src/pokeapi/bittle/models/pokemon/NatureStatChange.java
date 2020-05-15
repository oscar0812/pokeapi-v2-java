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

public class NatureStatChange {
	// The amount of change.
	private int max_change;

	// The stat being affected.
	private PokeathlonStat pokeathlon_stat;

	public int getMaxChange() {
		return max_change;
	}

	public NatureStatChange setMaxChange(int max_change) {
		this.max_change = max_change;
		return this;
	}

	public PokeathlonStat getPokeathlonStat() {
		if(!pokeathlon_stat.getIsFetched()) {
			pokeathlon_stat = pokeathlon_stat.get();
		}
		return pokeathlon_stat;
	}

	public NatureStatChange setPokeathlonStat(PokeathlonStat pokeathlon_stat) {
		this.pokeathlon_stat = pokeathlon_stat;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}