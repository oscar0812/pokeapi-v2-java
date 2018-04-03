package models.evolution;
public class ChainLink {
	// Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	private boolean is_baby;

	// The Pokémon species at this point in the models.evolution chain
	private models.pokemon.PokemonSpecies species;

	// All details regarding the specific details of the referenced Pokémon species models.evolution
	private java.util.ArrayList<models.evolution.EvolutionDetail> evolution_details;

	// A List of chain objects.
	private java.util.ArrayList<models.evolution.ChainLink> evolves_to;

	public boolean isBaby() {
		return is_baby;
	}

	public ChainLink setIsBaby(boolean is_baby) {
		this.is_baby = is_baby;
		return this;
	}

	public models.pokemon.PokemonSpecies getSpecies() {
		return species;
	}

	public ChainLink setSpecies(models.pokemon.PokemonSpecies species) {
		this.species = species;
		return this;
	}

	public java.util.ArrayList<models.evolution.EvolutionDetail> getEvolutionDetails() {
		return evolution_details;
	}

	public ChainLink setEvolutionDetails(java.util.ArrayList<models.evolution.EvolutionDetail> evolution_details) {
		this.evolution_details = evolution_details;
		return this;
	}

	public java.util.ArrayList<models.evolution.ChainLink> getEvolvesTo() {
		return evolves_to;
	}

	public ChainLink setEvolvesTo(java.util.ArrayList<models.evolution.ChainLink> evolves_to) {
		this.evolves_to = evolves_to;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}