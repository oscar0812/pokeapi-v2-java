/* Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.berries;

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

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}