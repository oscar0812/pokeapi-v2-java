package models.pokemon;
public class PokemonHeldItem {
	// The item the referenced Pokémon holds
	private models.items.Item item;

	// The details of the different versions in which the item is held
	private java.util.ArrayList<models.pokemon.PokemonHeldItemVersion> version_details;

	public models.items.Item getItem() {
		return item;
	}

	public PokemonHeldItem setItem(models.items.Item item) {
		this.item = item;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonHeldItemVersion> getVersionDetails() {
		return version_details;
	}

	public PokemonHeldItem setVersionDetails(java.util.ArrayList<models.pokemon.PokemonHeldItemVersion> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}