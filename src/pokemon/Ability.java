package pokemon;
/*
{
    "id": 1,
    "name": "stench",
    "is_main_series": true,
    "generation": {
        "name": "generation-iii",
        "url": "http://pokeapi.co/api/v2/generation/3/"
    },
    "names": [{
        "name": "Stench",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "effect_entries": [{
        "effect": "This Pokémon's damaging moves have a 10% chance to make the target [flinch]{mechanic:flinch} with each hit if they do not already cause flinching as a secondary effect.\n\nThis ability does not stack with a held item.\n\nOverworld: The wild encounter rate is halved while this Pokémon is first in the party.",
        "short_effect": "Has a 10% chance of making target Pokémon [flinch]{mechanic:flinch} with each hit.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "effect_changes": [{
        "version_group": {
            "name": "black-white",
            "url": "http://pokeapi.co/api/v2/version-group/11/"
        },
        "effect_entries": [{
            "effect": "Has no effect in battle.",
            "language": {
                "name": "en",
                "url": "http://pokeapi.co/api/v2/language/9/"
            }
        }]
    }],
    "flavor_text_entries": [{
        "flavor_text": "è‡­ãã¦ã€€ç›¸æ‰‹ãŒ\nã²ã‚‹ã‚€ã€€ã“ã¨ãŒã‚ã‚‹ã€‚",
        "language": {
            "name": "ja-kanji",
            "url": "http://pokeapi.co/api/v2/language/11/"
        },
        "version_group": {
            "name": "x-y",
            "url": "http://pokeapi.co/api/v2/version-group/15/"
        }
    }],
    "pokemon": [{
        "is_hidden": true,
        "slot": 3,
        "pokemon": {
            "name": "gloom",
            "url": "http://pokeapi.co/api/v2/pokemon/44/"
        }
    }]
}
*/

public class Ability extends common.NamedAPIResource {
	// The identifier for this ability resource
	private int id;

	// Whether or not this ability originated in the main series of the video games
	private boolean is_main_series;

	// The generation this ability originated in
	private games.Generation generation;

	// The name of this ability listed in different languages
	private java.util.ArrayList<common.Name> names;

	// The effect of this ability listed in different languages
	private java.util.ArrayList<common.VerboseEffect> effect_entries;

	// The list of previous effects this ability has had across version groups
	private java.util.ArrayList<pokemon.AbilityEffectChange> effect_changes;

	// The flavor text of this ability listed in different languages
	private java.util.ArrayList<pokemon.AbilityFlavorText> flavor_text_entries;

	// A list of Pokémon that could potentially have this ability
	private java.util.ArrayList<pokemon.AbilityPokemon> pokemon;

	public static Ability getById(int id) {
		String url = "https://pokeapi.co/api/v2/ability/" + id;
		String json = tools.Internet.get(url);
		Ability obj = new com.google.gson.Gson().fromJson(json, Ability.class);
		return obj;
	}

	public static Ability getByName(String name) {
		String url = "https://pokeapi.co/api/v2/ability/" + name;
		String json = tools.Internet.get(url);
		Ability obj = new com.google.gson.Gson().fromJson(json, Ability.class);
		return obj;
	}

	public int getId() {
		return id;
	}

	public Ability setId(int id) {
		this.id = id;
		return this;
	}

	public boolean isMainSeries() {
		return is_main_series;
	}

	public Ability setIsMainSeries(boolean is_main_series) {
		this.is_main_series = is_main_series;
		return this;
	}

	public games.Generation getGeneration() {
		return generation;
	}

	public Ability setGeneration(games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public java.util.ArrayList<common.Name> getNames() {
		return names;
	}

	public Ability setNames(java.util.ArrayList<common.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<common.VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public Ability setEffectEntries(java.util.ArrayList<common.VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<pokemon.AbilityEffectChange> getEffectChanges() {
		return effect_changes;
	}

	public Ability setEffectChanges(java.util.ArrayList<pokemon.AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
		return this;
	}

	public java.util.ArrayList<pokemon.AbilityFlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public Ability setFlavorTextEntries(java.util.ArrayList<pokemon.AbilityFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public java.util.ArrayList<pokemon.AbilityPokemon> getPokemon() {
		return pokemon;
	}

	public Ability setPokemon(java.util.ArrayList<pokemon.AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}