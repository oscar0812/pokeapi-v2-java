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

import java.util.ArrayList;
import pokeapi.bittle.models.games.VersionGroup;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Name;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class PokemonForm extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
	private int order;

	// The order in which forms should be sorted within a species' forms.
	private int form_order;

	// True for exactly one form used as the default for each Pokémon.
	private boolean is_default;

	// Whether or not this form can only happen during battle.
	private boolean is_battle_only;

	// Whether or not this form requires mega evolution.
	private boolean is_mega;

	// The name of this form.
	private String form_name;

	// The Pokémon that can take on this form.
	private Pokemon pokemon;

	// A set of sprites used to depict this Pokémon form in the game.
	private PokemonFormSprites sprites;

	// The version group this Pokémon form was introduced in.
	private VersionGroup version_group;

	// The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
	private ArrayList<Name> names;

	// The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
	private ArrayList<Name> form_names;

	public int getId() {
		return id;
	}

	public PokemonForm setId(int id) {
		this.id = id;
		return this;
	}

	public int getOrder() {
		return order;
	}

	public PokemonForm setOrder(int order) {
		this.order = order;
		return this;
	}

	public int getFormOrder() {
		return form_order;
	}

	public PokemonForm setFormOrder(int form_order) {
		this.form_order = form_order;
		return this;
	}

	public boolean getIsDefault() {
		return is_default;
	}

	public PokemonForm setIsDefault(boolean is_default) {
		this.is_default = is_default;
		return this;
	}

	public boolean getIsBattleOnly() {
		return is_battle_only;
	}

	public PokemonForm setIsBattleOnly(boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
		return this;
	}

	public boolean getIsMega() {
		return is_mega;
	}

	public PokemonForm setIsMega(boolean is_mega) {
		this.is_mega = is_mega;
		return this;
	}

	public String getFormName() {
		return form_name;
	}

	public PokemonForm setFormName(String form_name) {
		this.form_name = form_name;
		return this;
	}

	public Pokemon getPokemon() {
		if(!pokemon.getIsFetched()) {
			pokemon = pokemon.get();
		}
		return pokemon;
	}

	public PokemonForm setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public PokemonFormSprites getSprites() {
		return sprites;
	}

	public PokemonForm setSprites(PokemonFormSprites sprites) {
		this.sprites = sprites;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public PokemonForm setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public PokemonForm setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	public ArrayList<Name> getFormNames() {
		return form_names;
	}

	public PokemonForm setFormNames(ArrayList<Name> form_names) {
		this.form_names = form_names;
		return this;
	}

	private static PokemonForm get(String url) {
		PokemonForm obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), PokemonForm.class);
		obj.setIsFetched(true);
		return obj;
	}

	public PokemonForm get() {
		return PokemonForm.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-form", limit, offset);
	}

	public static PokemonForm getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-form/" + id);
	}

	public static PokemonForm getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-form/" + name);
	}
}