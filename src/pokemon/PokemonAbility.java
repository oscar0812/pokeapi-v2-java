package pokemon;
public class PokemonAbility {
	// Whether or not this is a hidden ability
	private boolean is_hidden;

	// The slot this ability occupies in this Pokémon species
	private int slot;

	// The ability the Pokémon may have
	private pokemon.Ability ability;

	public boolean isHidden() {
		return is_hidden;
	}

	public PokemonAbility setIsHidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
		return this;
	}

	public int getSlot() {
		return slot;
	}

	public PokemonAbility setSlot(int slot) {
		this.slot = slot;
		return this;
	}

	public pokemon.Ability getAbility() {
		return ability;
	}

	public PokemonAbility setAbility(pokemon.Ability ability) {
		this.ability = ability;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}