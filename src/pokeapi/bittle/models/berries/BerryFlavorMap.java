/* Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.berries;
/*
{
  "id": 1,
  "name": "cheri",
  "growth_time": 3,
  "max_harvest": 5,
  "natural_gift_power": 60,
  "size": 20,
  "smoothness": 25,
  "soil_dryness": 15,
  "firmness": {
    "name": "soft",
    "url": "https://pokeapi.co/api/v2/berry-firmness/2/"
  },
  "flavors": [
    {
      "potency": 10,
      "flavor": {
        "name": "spicy",
        "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
      }
    }
  ],
  "item": {
    "name": "cheri-berry",
    "url": "https://pokeapi.co/api/v2/item/126/"
  },
  "natural_gift_type": {
    "name": "fire",
    "url": "https://pokeapi.co/api/v2/type/10/"
  }
}
*/

public class BerryFlavorMap {
	// How powerful the referenced flavor is for this berry.
	private int potency;

	// The referenced berry flavor.
	private BerryFlavor flavor;

	public int getPotency() {
		return potency;
	}

	public BerryFlavorMap setPotency(int potency) {
		this.potency = potency;
		return this;
	}

	public BerryFlavor getFlavor() {
		if(!flavor.getIsFetched()) {
			flavor = flavor.get();
		}
		return flavor;
	}

	public BerryFlavorMap setFlavor(BerryFlavor flavor) {
		this.flavor = flavor;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}