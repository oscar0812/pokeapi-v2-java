package models.pokemon;
/*
{
    "id": 413,
    "name": "wormadam",
    "order": 441,
    "gender_rate": 8,
    "capture_rate": 45,
    "base_happiness": 70,
    "is_baby": false,
    "hatch_counter": 15,
    "has_gender_differences": false,
    "forms_switchable": false,
    "growth_rate": {
        "name": "medium",
        "url": "http://pokeapi.co/api/v2/growth-rate/2/"
    },
    "pokedex_numbers": [{
        "entry_number": 45,
        "pokedex": {
            "name": "kalos-central",
            "url": "http://pokeapi.co/api/v2/pokedex/12/"
        }
    }],
    "egg_groups": [{
        "name": "bug",
        "url": "http://pokeapi.co/api/v2/egg-group/3/"
    }],
    "color": {
        "name": "gray",
        "url": "http://pokeapi.co/api/v2/pokemon-color/4/"
    },
    "shape": {
        "name": "squiggle",
        "url": "http://pokeapi.co/api/v2/pokemon-shape/2/"
    },
    "evolves_from_species": {
        "name": "burmy",
        "url": "http://pokeapi.co/api/v2/pokemon-species/412/"
    },
    "evolution_chain": {
        "url": "http://pokeapi.co/api/v2/evolution-chain/213/"
    },
    "habitat": null,
    "generation": {
        "name": "generation-iv",
        "url": "http://pokeapi.co/api/v2/generation/4/"
    },
    "names": [{
        "name": "Wormadam",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "flavor_text_entries": [
    {
        "flavor_text": "When the bulb on\nits back grows\nlarge, it appears\fto lose the\nability to stand\non its hind legs.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        },
        "version": {
            "name": "red",
            "url": "http://pokeapi.co/api/v2/version/1/"
        }
    }],
    "form_descriptions": [{
        "description": "Forms have different stats and movepools.  During evolution, Burmy's current cloak becomes Wormadam's form, and can no longer be changed.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "genera": [{
        "genus": "Bagworm",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "varieties": [{
        "is_default": true,
        "pokemon": {
            "name": "wormadam-plant",
            "url": "http://pokeapi.co/api/v2/pokemon/413/"
        }
    }]
}
*/

public class PokemonSpecies extends models.common.NamedAPIResource {
	// The identifier for this Pokémon species resource
	private int id;

	// The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
	private int order;

	// The chance of this Pokémon being female, in eighths; or -1 for genderless
	private int gender_rate;

	// The base capture rate; up to 255. The higher the number, the easier the catch.
	private int capture_rate;

	// The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
	private int base_happiness;

	// Whether or not this is a baby Pokémon
	private boolean is_baby;

	// Initial hatch counter: one must walk 255 × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's
	private int hatch_counter;

	// Whether or not this Pokémon has visual gender differences
	private boolean has_gender_differences;

	// Whether or not this Pokémon has multiple forms and can switch between them
	private boolean forms_switchable;

	// The rate at which this Pokémon species gains levels
	private models.pokemon.GrowthRate growth_rate;

	// A list of Pokedexes and the indexes reserved within them for this Pokémon species
	private java.util.ArrayList<models.pokemon.PokemonSpeciesDexEntry> pokedex_numbers;

	// A list of egg groups this Pokémon species is a member of
	private java.util.ArrayList<models.pokemon.EggGroup> egg_groups;

	// The color of this Pokémon for gimmicky Pokédex search
	private models.pokemon.PokemonColor color;

	// The shape of this Pokémon for gimmicky Pokédex search
	private models.pokemon.PokemonShape shape;

	// The Pokémon species that evolves into this Pokemon_species
	private models.pokemon.PokemonSpecies evolves_from_species;

	// The evolution chain this Pokémon species is a member of
	private models.evolution.EvolutionChain evolution_chain;

	// The habitat this Pokémon species can be encountered in
	private models.pokemon.PokemonHabitat habitat;

	// The generation this Pokémon species was introduced in
	private models.games.Generation generation;

	// The name of this Pokémon species listed in different languages
	private java.util.ArrayList<models.common.Name> names;

	// A list of encounters that can be had with this Pokémon species in pal park
	private java.util.ArrayList<models.pokemon.PalParkEncounterArea> pal_park_encounters;

	// A list of flavor text entries for this Pokémon species
	private java.util.ArrayList<models.common.FlavorText> flavor_text_entries;

	// Descriptions of different forms Pokémon take on within the Pokémon species
	private java.util.ArrayList<models.common.Description> form_descriptions;

	// The genus of this Pokémon species listed in multiple languages
	private java.util.ArrayList<models.pokemon.Genus> genera;

	// A list of the Pokémon that exist within this Pokémon species
	private java.util.ArrayList<models.pokemon.PokemonSpeciesVariety> varieties;

	private static PokemonSpecies get(String url) {
		String json = api.Information.fromInternet(url);
		PokemonSpecies obj = new com.google.gson.Gson().fromJson(json, PokemonSpecies.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PokemonSpecies getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-species/" + id);
	}

	public static PokemonSpecies getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-species/" + name);
	}

	public int getId() {
		return id;
	}

	public PokemonSpecies setId(int id) {
		this.id = id;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public PokemonSpecies setOrder(int order) {
		this.order = order;
		return this;
	}

	public int getGenderRate() {
		return gender_rate;
	}

	public PokemonSpecies setGenderRate(int gender_rate) {
		this.gender_rate = gender_rate;
		return this;
	}

	public int getCaptureRate() {
		return capture_rate;
	}

	public PokemonSpecies setCaptureRate(int capture_rate) {
		this.capture_rate = capture_rate;
		return this;
	}

	public int getBaseHappiness() {
		return base_happiness;
	}

	public PokemonSpecies setBaseHappiness(int base_happiness) {
		this.base_happiness = base_happiness;
		return this;
	}

	public boolean isBaby() {
		return is_baby;
	}

	public PokemonSpecies setIsBaby(boolean is_baby) {
		this.is_baby = is_baby;
		return this;
	}

	public int getHatchCounter() {
		return hatch_counter;
	}

	public PokemonSpecies setHatchCounter(int hatch_counter) {
		this.hatch_counter = hatch_counter;
		return this;
	}

	public boolean hasGenderDifferences() {
		return has_gender_differences;
	}

	public PokemonSpecies setHasGenderDifferences(boolean has_gender_differences) {
		this.has_gender_differences = has_gender_differences;
		return this;
	}

	public boolean formsSwitchable() {
		return forms_switchable;
	}

	public PokemonSpecies setFormsSwitchable(boolean forms_switchable) {
		this.forms_switchable = forms_switchable;
		return this;
	}

	public models.pokemon.GrowthRate getGrowthRate() {
		return growth_rate;
	}

	public PokemonSpecies setGrowthRate(models.pokemon.GrowthRate growth_rate) {
		this.growth_rate = growth_rate;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpeciesDexEntry> getPokedexNumbers() {
		return pokedex_numbers;
	}

	public PokemonSpecies setPokedexNumbers(java.util.ArrayList<models.pokemon.PokemonSpeciesDexEntry> pokedex_numbers) {
		this.pokedex_numbers = pokedex_numbers;
		return this;
	}

	public java.util.ArrayList<models.pokemon.EggGroup> getEggGroups() {
		return egg_groups;
	}

	public PokemonSpecies setEggGroups(java.util.ArrayList<models.pokemon.EggGroup> egg_groups) {
		this.egg_groups = egg_groups;
		return this;
	}

	public models.pokemon.PokemonColor getColor() {
		return color;
	}

	public PokemonSpecies setColor(models.pokemon.PokemonColor color) {
		this.color = color;
		return this;
	}

	public models.pokemon.PokemonShape getShape() {
		return shape;
	}

	public PokemonSpecies setShape(models.pokemon.PokemonShape shape) {
		this.shape = shape;
		return this;
	}

	public models.pokemon.PokemonSpecies getEvolvesFromSpecies() {
		return evolves_from_species;
	}

	public PokemonSpecies setEvolvesFromSpecies(models.pokemon.PokemonSpecies evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
		return this;
	}

	public models.evolution.EvolutionChain getEvolutionChain() {
		return evolution_chain;
	}

	public PokemonSpecies setEvolutionChain(models.evolution.EvolutionChain evolution_chain) {
		this.evolution_chain = evolution_chain;
		return this;
	}

	public models.pokemon.PokemonHabitat getHabitat() {
		return habitat;
	}

	public PokemonSpecies setHabitat(models.pokemon.PokemonHabitat habitat) {
		this.habitat = habitat;
		return this;
	}

	public models.games.Generation getGeneration() {
		return generation;
	}

	public PokemonSpecies setGeneration(models.games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PokemonSpecies setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PalParkEncounterArea> getPalParkEncounters() {
		return pal_park_encounters;
	}

	public PokemonSpecies setPalParkEncounters(java.util.ArrayList<models.pokemon.PalParkEncounterArea> pal_park_encounters) {
		this.pal_park_encounters = pal_park_encounters;
		return this;
	}

	public java.util.ArrayList<models.common.FlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public PokemonSpecies setFlavorTextEntries(java.util.ArrayList<models.common.FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getFormDescriptions() {
		return form_descriptions;
	}

	public PokemonSpecies setFormDescriptions(java.util.ArrayList<models.common.Description> form_descriptions) {
		this.form_descriptions = form_descriptions;
		return this;
	}

	public java.util.ArrayList<models.pokemon.Genus> getGenera() {
		return genera;
	}

	public PokemonSpecies setGenera(java.util.ArrayList<models.pokemon.Genus> genera) {
		this.genera = genera;
		return this;
	}

	public java.util.ArrayList<models.pokemon.PokemonSpeciesVariety> getVarieties() {
		return varieties;
	}

	public PokemonSpecies setVarieties(java.util.ArrayList<models.pokemon.PokemonSpeciesVariety> varieties) {
		this.varieties = varieties;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}