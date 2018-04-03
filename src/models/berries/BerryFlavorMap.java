package models.berries;
public class BerryFlavorMap {
	// How powerful the referenced flavor is for this berry
	private int potency;

	// The referenced berry flavor
	private models.berries.BerryFlavor flavor;

	public int getPotency() {
		return potency;
	}

	public BerryFlavorMap setPotency(int potency) {
		this.potency = potency;
		return this;
	}

	public models.berries.BerryFlavor getFlavor() {
		return flavor;
	}

	public BerryFlavorMap setFlavor(models.berries.BerryFlavor flavor) {
		this.flavor = flavor;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}