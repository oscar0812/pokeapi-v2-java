/* Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 413,
  "name": "wormadam-plant",
  "order": 503,
  "form_order": 1,
  "is_default": true,
  "is_battle_only": false,
  "is_mega": false,
  "form_name": "plant",
  "pokemon": {
    "name": "wormadam-plant",
    "url": "https://pokeapi.co/api/v2/pokemon/413/"
  },
  "sprites": {
    "back_default": "http://pokeapi.co/media/sprites/pokemon/back/413.png",
    "back_shiny": "http://pokeapi.co/media/sprites/pokemon/back/shiny/413.png",
    "front_default": "http://pokeapi.co/media/sprites/pokemon/413.png",
    "front_shiny": "http://pokeapi.co/media/sprites/pokemon/shiny/413.png"
  },
  "version_group": {
    "name": "diamond-pearl",
    "url": "https://pokeapi.co/api/v2/version-group/8/"
  }
}
*/

public class PokemonFormSprites {
	// The default depiction of this Pokémon form from the front in battle.
	private String front_default;

	// The shiny depiction of this Pokémon form from the front in battle.
	private String front_shiny;

	// The default depiction of this Pokémon form from the back in battle.
	private String back_default;

	// The shiny depiction of this Pokémon form from the back in battle.
	private String back_shiny;

	public String getFrontDefault() {
		return front_default;
	}

	public PokemonFormSprites setFrontDefault(String front_default) {
		this.front_default = front_default;
		return this;
	}

	public String getFrontShiny() {
		return front_shiny;
	}

	public PokemonFormSprites setFrontShiny(String front_shiny) {
		this.front_shiny = front_shiny;
		return this;
	}

	public String getBackDefault() {
		return back_default;
	}

	public PokemonFormSprites setBackDefault(String back_default) {
		this.back_default = back_default;
		return this;
	}

	public String getBackShiny() {
		return back_shiny;
	}

	public PokemonFormSprites setBackShiny(String back_shiny) {
		this.back_shiny = back_shiny;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}