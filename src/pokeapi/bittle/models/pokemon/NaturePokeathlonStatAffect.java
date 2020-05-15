/* Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "speed",
  "affecting_natures": {
    "increase": [
      {
        "max_change": 2,
        "nature": {
          "name": "timid",
          "url": "https://pokeapi.co/api/v2/nature/5/"
        }
      }
    ],
    "decrease": [
      {
        "max_change": -1,
        "nature": {
          "name": "hardy",
          "url": "https://pokeapi.co/api/v2/nature/1/"
        }
      }
    ]
  },
  "names": [
    {
      "name": "Speed",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class NaturePokeathlonStatAffect {
	// The maximum amount of change to the referenced Pokéathlon stat.
	private int max_change;

	// The nature causing the change.
	private Nature nature;

	public int getMaxChange() {
		return max_change;
	}

	public NaturePokeathlonStatAffect setMaxChange(int max_change) {
		this.max_change = max_change;
		return this;
	}

	public Nature getNature() {
		if(!nature.getIsFetched()) {
			nature = nature.get();
		}
		return nature;
	}

	public NaturePokeathlonStatAffect setNature(Nature nature) {
		this.nature = nature;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}