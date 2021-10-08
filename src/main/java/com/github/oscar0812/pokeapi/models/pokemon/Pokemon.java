/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;
import com.github.oscar0812.pokeapi.models.utility.VersionGameIndex;
import com.github.oscar0812.pokeapi.utils.Information;
import java.util.ArrayList;

public class Pokemon extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The base experience gained for defeating this Pokémon.
	private int base_experience;

	// The height of this Pokémon in decimetres.
	private int height;

	// Set for exactly one Pokémon used as the default for each species.
	private boolean is_default;

	// Order for sorting. Almost national order, except families are grouped together.
	private int order;

	// The weight of this Pokémon in hectograms.
	private int weight;

	// A list of abilities this Pokémon could potentially have.
	private ArrayList<PokemonAbility> abilities;

	// A list of forms this Pokémon can take on.
	private ArrayList<PokemonForm> forms;

	// A list of game indices relevent to Pokémon item by generation.
	private ArrayList<VersionGameIndex> game_indices;

	// A list of items this Pokémon may be holding when encountered.
	private ArrayList<PokemonHeldItem> held_items;

	// A link to a list of location areas, as well as encounter details pertaining to specific versions.
	private String location_area_encounters;

	// A list of moves along with learn methods and level details pertaining to specific version groups.
	private ArrayList<PokemonMove> moves;

	// A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at PokeAPI/sprites
	private PokemonSprites sprites;

	// The species this Pokémon belongs to.
	private PokemonSpecies species;

	// A list of base stat values for this Pokémon.
	private ArrayList<PokemonStat> stats;

	// A list of details showing types this Pokémon has.
	private ArrayList<PokemonType> types;

	public int getId() {
		return id;
	}

	public Pokemon setId(int id) {
		this.id = id;
		return this;
	}

	public int getBaseExperience() {
		return base_experience;
	}

	public Pokemon setBaseExperience(int base_experience) {
		this.base_experience = base_experience;
		return this;
	}

	public int getHeight() {
		return height;
	}

	public Pokemon setHeight(int height) {
		this.height = height;
		return this;
	}

	public boolean getIsDefault() {
		return is_default;
	}

	public Pokemon setIsDefault(boolean is_default) {
		this.is_default = is_default;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public Pokemon setOrder(int order) {
		this.order = order;
		return this;
	}

	public int getWeight() {
		return weight;
	}

	public Pokemon setWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public ArrayList<PokemonAbility> getAbilities() {
		return abilities;
	}

	public Pokemon setAbilities(ArrayList<PokemonAbility> abilities) {
		this.abilities = abilities;
		return this;
	}

	public ArrayList<PokemonForm> getForms() {
		return forms;
	}

	public Pokemon setForms(ArrayList<PokemonForm> forms) {
		this.forms = forms;
		return this;
	}

	public ArrayList<VersionGameIndex> getGameIndices() {
		return game_indices;
	}

	public Pokemon setGameIndices(ArrayList<VersionGameIndex> game_indices) {
		this.game_indices = game_indices;
		return this;
	}

	public ArrayList<PokemonHeldItem> getHeldItems() {
		return held_items;
	}

	public Pokemon setHeldItems(ArrayList<PokemonHeldItem> held_items) {
		this.held_items = held_items;
		return this;
	}

	public String getLocationAreaEncounters() {
		return location_area_encounters;
	}

	public Pokemon setLocationAreaEncounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
		return this;
	}

	public ArrayList<PokemonMove> getMoves() {
		return moves;
	}

	public Pokemon setMoves(ArrayList<PokemonMove> moves) {
		this.moves = moves;
		return this;
	}

	public PokemonSprites getSprites() {
		return sprites;
	}

	public Pokemon setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
		return this;
	}

	public PokemonSpecies getSpecies() {
		if(!species.getIsFetched()) {
			species = species.get();
		}
		return species;
	}

	public Pokemon setSpecies(PokemonSpecies species) {
		this.species = species;
		return this;
	}

	public ArrayList<PokemonStat> getStats() {
		return stats;
	}

	public Pokemon setStats(ArrayList<PokemonStat> stats) {
		this.stats = stats;
		return this;
	}

	public ArrayList<PokemonType> getTypes() {
		return types;
	}

	public Pokemon setTypes(ArrayList<PokemonType> types) {
		this.types = types;
		return this;
	}

	private static Pokemon get(String url) {
		Pokemon obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Pokemon.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Pokemon get() {
		return Pokemon.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon", limit, offset);
	}

	public static Pokemon getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon/" + id);
	}

	public static Pokemon getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon/" + name);
	}
}