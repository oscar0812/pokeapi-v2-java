package models.pokemon;

import models.resource.named.PokemonSpecies;

import java.util.ArrayList;

public class Gender {
    // The identifier for this gender resource
    private int id;

    // The name for this gender resource
    private String name;

    // A list of Pokémon species that can be this gender and how likely it is that they will be
    private ArrayList<PokemonSpeciesGender> pokemon_species_details;

    // A list of Pokémon species that required this gender in order for a Pokémon to evolve into them
    private ArrayList<PokemonSpecies> required_for_evolution;

    public Gender(int id, String name, ArrayList<PokemonSpeciesGender> pokemon_species_details,
                  ArrayList<PokemonSpecies> required_for_evolution) {
        this.id = id;
        this.name = name;
        this.pokemon_species_details = pokemon_species_details;
        this.required_for_evolution = required_for_evolution;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<PokemonSpeciesGender> getPokemonSpeciesDetails() {
        return pokemon_species_details;
    }

    public ArrayList<PokemonSpecies> getRequiredForEvolution() {
        return required_for_evolution;
    }
}
