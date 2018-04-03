package models.pokemon;
public class AbilityPokemon {
	// Whether or not this a hidden ability for the referenced Pokémon
	private boolean is_hidden;

	// Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	private int slot;

	// The Pokémon this ability could belong to
	private models.pokemon.Pokemon pokemon;

	public boolean isHidden() {
		return is_hidden;
	}

	public AbilityPokemon setIsHidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
		return this;
	}

	public int getSlot() {
		return slot;
	}

	public AbilityPokemon setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public models.pokemon.Pokemon getPokemon() {
		return pokemon;
	}

	public AbilityPokemon setPokemon(models.pokemon.Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}