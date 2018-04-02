package berries;
public class FlavorBerryMap {
	// How powerful the referenced flavor is for this berry
	private int potency;

	// The berry with the referenced flavor
	private berries.Berry berry;

	public int getPotency() {
		return potency;
	}

	public FlavorBerryMap setPotency(int potency) {
		this.potency = potency;
		return this;
	}

	public berries.Berry getBerry() {
		return berry;
	}

	public FlavorBerryMap setBerry(berries.Berry berry) {
		this.berry = berry;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}