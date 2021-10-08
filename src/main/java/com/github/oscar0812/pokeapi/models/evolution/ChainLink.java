/* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. */

package com.github.oscar0812.pokeapi.models.evolution;

import com.github.oscar0812.pokeapi.models.pokemon.PokemonSpecies;
import java.util.ArrayList;

public class ChainLink {
	// Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	private boolean is_baby;

	// The Pokémon species at this point in the evolution chain.
	private PokemonSpecies species;

	// All details regarding the specific details of the referenced Pokémon species evolution.
	private ArrayList<EvolutionDetail> evolution_details;

	// A List of chain objects.
	private ArrayList<ChainLink> evolves_to;

	public boolean getIsBaby() {
		return is_baby;
	}

	public ChainLink setIsBaby(boolean is_baby) {
		this.is_baby = is_baby;
		return this;
	}

	public PokemonSpecies getSpecies() {
		if(!species.getIsFetched()) {
			species = species.get();
		}
		return species;
	}

	public ChainLink setSpecies(PokemonSpecies species) {
		this.species = species;
		return this;
	}

	public ArrayList<EvolutionDetail> getEvolutionDetails() {
		return evolution_details;
	}

	public ChainLink setEvolutionDetails(ArrayList<EvolutionDetail> evolution_details) {
		this.evolution_details = evolution_details;
		return this;
	}

	public ArrayList<ChainLink> getEvolvesTo() {
		return evolves_to;
	}

	public ChainLink setEvolvesTo(ArrayList<ChainLink> evolves_to) {
		this.evolves_to = evolves_to;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}