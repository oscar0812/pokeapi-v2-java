package models.resource.named;

import models.Description;
import models.pokemon.GrowthRateExperienceLevel;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "slow",
    "formula": "\\frac{5x^3}{4}",
    "descriptions": [{
        "description": "langsam",
        "language": {
            "name": "de",
            "url": "http://pokeapi.co/api/v2/language/6/"
        }
    }],
    "levels": [{
        "level": 100,
        "experience": 1250000
    }],
    "pokemon_species": [{
        "name": "growlithe",
        "url": "http://pokeapi.co/api/v2/pokemon-species/58/"
    }]
}
 */

public class GrowthRate extends NamedAPIResource {
    // The identifier for this gender resource
    private int id;

    // The formula used to calculate the rate at which the Pokémon species gains level
    private String formula;

    // The descriptions of this characteristic listed in different languages
    private ArrayList<Description> descriptions;

    // A list of levels and the amount of experienced needed to atain them based on this growth rate
    private ArrayList<GrowthRateExperienceLevel> levels;

    // A list of Pokémon species that gain levels at this growth rate
    private ArrayList<PokemonSpecies> pokemon_species;

    public GrowthRate(String url, int id, String name, String formula, ArrayList<Description> descriptions,
                      ArrayList<GrowthRateExperienceLevel> levels, ArrayList<PokemonSpecies> pokemon_species) {
        this.url = url;
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.descriptions = descriptions;
        this.levels = levels;
        this.pokemon_species = pokemon_species;
    }

    public int getId() {
        return id;
    }

    public String getFormula() {
        return formula;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    public ArrayList<PokemonSpecies> getPokemonSpecies() {
        return pokemon_species;
    }
}
