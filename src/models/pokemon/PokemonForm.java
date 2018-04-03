package models.pokemon;
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
        "url": "http://pokeapi.co/api/v2/pokemon/413/"
    },
    "sprites": {
        "back_default": "http://pokeapi.co/media/sprites/pokemon/back/413.png",
        "back_shiny": "http://pokeapi.co/media/sprites/pokemon/back/shiny/413.png",
        "front_default": "http://pokeapi.co/media/sprites/pokemon/413.png",
        "front_shiny": "http://pokeapi.co/media/sprites/pokemon/shiny/413.png"
    },
    "version_group": {
        "name": "diamond-pearl",
        "url": "http://pokeapi.co/api/v2/version-group/8/"
    }
}
*/

public class PokemonForm extends models.common.NamedAPIResource {
	// The identifier for this Pokémon form resource
	private int id;

	// The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
	private int order;

	// The order in which forms should be sorted within a species' forms
	private int form_order;

	// True for exactly one form used as the default for each Pokémon
	private boolean is_default;

	// Whether or not this form can only happen during battle
	private boolean is_battle_only;

	// Whether or not this form requires mega evolution
	private boolean is_mega;

	// The name of this form
	private String form_name;

	// The Pokémon that can take on this form
	private models.pokemon.Pokemon pokemon;

	// A set of sprites used to depict this Pokémon form in the game
	private models.pokemon.PokemonFormSprites sprites;

	// The version group this Pokémon form was introduced in
	private models.games.VersionGroup version_group;

	// The form specific full name of this Pokémon form, or empty if the form does not have a specific name
	private java.util.ArrayList<models.common.Name> names;

	// The form specific form name of this Pokémon form, or empty if the form does not have a specific name
	private java.util.ArrayList<models.common.Name> form_names;

	private static PokemonForm get(String url) {
		String json = api.Information.fromInternet(url);
		PokemonForm obj = new com.google.gson.Gson().fromJson(json, PokemonForm.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static PokemonForm getById(int id) {
		return get("https://pokeapi.co/api/v2/pokemon-form/" + id);
	}

	public static PokemonForm getByName(String name) {
		return get("https://pokeapi.co/api/v2/pokemon-form/" + name);
	}

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

	public boolean isDefault() {
		return is_default;
	}

	public PokemonForm setIsDefault(boolean is_default) {
		this.is_default = is_default;
		return this;
	}

	public boolean isBattleOnly() {
		return is_battle_only;
	}

	public PokemonForm setIsBattleOnly(boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
		return this;
	}

	public boolean isMega() {
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

	public models.pokemon.Pokemon getPokemon() {
		return pokemon;
	}

	public PokemonForm setPokemon(models.pokemon.Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	public models.pokemon.PokemonFormSprites getSprites() {
		return sprites;
	}

	public PokemonForm setSprites(models.pokemon.PokemonFormSprites sprites) {
		this.sprites = sprites;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public PokemonForm setVersionGroup(models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getNames() {
		return names;
	}

	public PokemonForm setNames(java.util.ArrayList<models.common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<models.common.Name> getFormNames() {
		return form_names;
	}

	public PokemonForm setFormNames(java.util.ArrayList<models.common.Name> form_names) {
		this.form_names = form_names;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}