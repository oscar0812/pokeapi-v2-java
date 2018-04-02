package pokemon;
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

public class GrowthRate extends common.NamedAPIResource {
	// The identifier for this gender resource
	private int id;

	// The formula used to calculate the rate at which the Pokémon species gains level
	private String formula;

	// The descriptions of this characteristic listed in different languages
	private java.util.ArrayList<common.Description> descriptions;

	// A list of levels and the amount of experienced needed to atain them based on this growth rate
	private java.util.ArrayList<pokemon.GrowthRateExperienceLevel> levels;

	// A list of Pokémon species that gain levels at this growth rate
	private java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species;

	public static GrowthRate getById(int id) {
		String url = "https://pokeapi.co/api/v2/growth-rate/" + id;
		String json = tools.Internet.get(url);
		GrowthRate obj = new com.google.gson.Gson().fromJson(json, GrowthRate.class);
		return obj;
	}

	public static GrowthRate getByName(String name) {
		String url = "https://pokeapi.co/api/v2/growth-rate/" + name;
		String json = tools.Internet.get(url);
		GrowthRate obj = new com.google.gson.Gson().fromJson(json, GrowthRate.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public GrowthRate setId(int id) {
		this.id = id;
		return this;
	}

	public String getFormula() {
		return formula;
	}

	public GrowthRate setFormula(String formula) {
		this.formula = formula;
		return this;
	}

	public java.util.ArrayList<common.Description> getDescriptions() {
		return descriptions;
	}

	public GrowthRate setDescriptions(java.util.ArrayList<common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public java.util.ArrayList<pokemon.GrowthRateExperienceLevel> getLevels() {
		return levels;
	}

	public GrowthRate setLevels(java.util.ArrayList<pokemon.GrowthRateExperienceLevel> levels) {
		this.levels = levels;
		return this;
	}

	public java.util.ArrayList<pokemon.PokemonSpecies> getPokemonSpecies() {
		return pokemon_species;
	}

	public GrowthRate setPokemonSpecies(java.util.ArrayList<pokemon.PokemonSpecies> pokemon_species) {
		this.pokemon_species = pokemon_species;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}