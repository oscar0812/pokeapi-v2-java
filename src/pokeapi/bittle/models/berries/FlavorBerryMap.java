/* Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their nature. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.berries;
/*
{
  "id": 1,
  "name": "spicy",
  "berries": [
    {
      "potency": 10,
      "berry": {
        "name": "rowap",
        "url": "https://pokeapi.co/api/v2/berry/64/"
      }
    }
  ],
  "contest_type": {
    "name": "cool",
    "url": "https://pokeapi.co/api/v2/contest-type/1/"
  },
  "names": [
    {
      "name": "Spicy",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class FlavorBerryMap {
	// How powerful the referenced flavor is for this berry.
	private int potency;

	// The berry with the referenced flavor.
	private Berry berry;

	public int getPotency() {
		return potency;
	}

	public FlavorBerryMap setPotency(int potency) {
		this.potency = potency;
		return this;
	}

	public Berry getBerry() {
		if(!berry.getIsFetched()) {
			berry = berry.get();
		}
		return berry;
	}

	public FlavorBerryMap setBerry(Berry berry) {
		this.berry = berry;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}