package models.items;
public class ItemHolderPokemon {
	// The Pokémon that holds this item
	private String pokemon;

	// The details for the version that this item is held in by the Pokémon
	private java.util.ArrayList<models.items.ItemHolderPokemonVersionDetail> version_details;

	public String getPokemon() {
		return pokemon;
	}

	public ItemHolderPokemon setPokemon(String pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public java.util.ArrayList<models.items.ItemHolderPokemonVersionDetail> getVersionDetails() {
		return version_details;
	}

	public ItemHolderPokemon setVersionDetails(java.util.ArrayList<models.items.ItemHolderPokemonVersionDetail> version_details) {
		this.version_details = version_details;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}