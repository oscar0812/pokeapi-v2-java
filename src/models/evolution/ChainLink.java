package models.evolution;

import models.resource.named.PokemonSpecies;

import java.util.ArrayList;

public class ChainLink {

    // Whether or not this link is for a baby Pokémon. This would only ever be true on the base link
    private boolean is_baby;

    // The Pokémon species at this point in the evolution chain
    private PokemonSpecies species;

    // All details regarding the specific details of the referenced Pokémon species evolution
    private ArrayList<EvolutionDetail> evolution_details;

    // A List of chain objects
    private ChainLink evolves_to;

    public ChainLink(boolean is_baby, PokemonSpecies species,
                     ArrayList<EvolutionDetail> evolution_details, ChainLink evolves_to) {
        this.is_baby = is_baby;
        this.species = species;
        this.evolution_details = evolution_details;
        this.evolves_to = evolves_to;
    }

    public boolean isBaby() {
        return is_baby;
    }

    public PokemonSpecies getSpecies() {
        return species;
    }

    public ArrayList<EvolutionDetail> getEvolutionDetails() {
        return evolution_details;
    }

    public ChainLink getEvolvesTo() {
        return evolves_to;
    }
}
