/* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See Bulbapedia for greater detail. */

package com.github.oscar0812.pokeapi.models.pokemon;

public class PokemonSprites {
	// The default depiction of this Pokémon from the front in battle.
	private String front_default;

	// The shiny depiction of this Pokémon from the front in battle.
	private String front_shiny;

	// The female depiction of this Pokémon from the front in battle.
	private String front_female;

	// The shiny female depiction of this Pokémon from the front in battle.
	private String front_shiny_female;

	// The default depiction of this Pokémon from the back in battle.
	private String back_default;

	// The shiny depiction of this Pokémon from the back in battle.
	private String back_shiny;

	// The female depiction of this Pokémon from the back in battle.
	private String back_female;

	// The shiny female depiction of this Pokémon from the back in battle.
	private String back_shiny_female;

	public String getFrontDefault() {
		return front_default;
	}

	public PokemonSprites setFrontDefault(String front_default) {
		this.front_default = front_default;
		return this;
	}

	public String getFrontShiny() {
		return front_shiny;
	}

	public PokemonSprites setFrontShiny(String front_shiny) {
		this.front_shiny = front_shiny;
		return this;
	}

	public String getFrontFemale() {
		return front_female;
	}

	public PokemonSprites setFrontFemale(String front_female) {
		this.front_female = front_female;
		return this;
	}

	public String getFrontShinyFemale() {
		return front_shiny_female;
	}

	public PokemonSprites setFrontShinyFemale(String front_shiny_female) {
		this.front_shiny_female = front_shiny_female;
		return this;
	}

	public String getBackDefault() {
		return back_default;
	}

	public PokemonSprites setBackDefault(String back_default) {
		this.back_default = back_default;
		return this;
	}

	public String getBackShiny() {
		return back_shiny;
	}

	public PokemonSprites setBackShiny(String back_shiny) {
		this.back_shiny = back_shiny;
		return this;
	}

	public String getBackFemale() {
		return back_female;
	}

	public PokemonSprites setBackFemale(String back_female) {
		this.back_female = back_female;
		return this;
	}

	public String getBackShinyFemale() {
		return back_shiny_female;
	}

	public PokemonSprites setBackShinyFemale(String back_shiny_female) {
		this.back_shiny_female = back_shiny_female;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}