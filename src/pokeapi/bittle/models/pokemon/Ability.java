/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "stench",
  "is_main_series": true,
  "generation": {
    "name": "generation-iii",
    "url": "https://pokeapi.co/api/v2/generation/3/"
  },
  "names": [
    {
      "name": "Stench",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "effect_entries": [
    {
      "effect": "This Pokémon's damaging moves have a 10% chance to make the target [flinch]{mechanic:flinch} with each hit if they do not already cause flinching as a secondary effect.\n\nThis ability does not stack with a held item.\n\nOverworld: The wild encounter rate is halved while this Pokémon is first in the party.",
      "short_effect": "Has a 10% chance of making target Pokémon [flinch]{mechanic:flinch} with each hit.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "effect_changes": [
    {
      "version_group": {
        "name": "black-white",
        "url": "https://pokeapi.co/api/v2/version-group/11/"
      },
      "effect_entries": [
        {
          "effect": "Has no effect in battle.",
          "language": {
            "name": "en",
            "url": "https://pokeapi.co/api/v2/language/9/"
          }
        }
      ]
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "è‡­ãã¦ã€€ç›¸æ‰‹ãŒ\nã²ã‚‹ã‚€ã€€ã“ã¨ãŒã‚ã‚‹ã€‚",
      "language": {
        "name": "ja-kanji",
        "url": "https://pokeapi.co/api/v2/language/11/"
      },
      "version_group": {
        "name": "x-y",
        "url": "https://pokeapi.co/api/v2/version-group/15/"
      }
    }
  ],
  "pokemon": [
    {
      "is_hidden": true,
      "slot": 3,
      "pokemon": {
        "name": "gloom",
        "url": "https://pokeapi.co/api/v2/pokemon/44/"
      }
    }
  ]
}
*/

public class Ability extends pokeapi.bittle.models.utility.NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Whether or not this ability originated in the main series of the video games.
	private boolean is_main_series;

	// The generation this ability originated in.
	private pokeapi.bittle.models.games.Generation generation;

	// The name of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Name> names;

	// The effect of this ability listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.VerboseEffect> effect_entries;

	// The list of previous effects this ability has had across version groups.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityEffectChange> effect_changes;

	// The flavor text of this ability listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityFlavorText> flavor_text_entries;

	// A list of Pokémon that could potentially have this ability.
	private java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityPokemon> pokemon;

	public int getId() {
		return id;
	}

	public Ability setId(int id) {
		this.id = id;
		return this;
	}

	public boolean getIsMainSeries() {
		return is_main_series;
	}

	public Ability setIsMainSeries(boolean is_main_series) {
		this.is_main_series = is_main_series;
		return this;
	}

	public pokeapi.bittle.models.games.Generation getGeneration() {
		if(!generation.getIsFetched()) {
			generation = generation.get();
		}
		return generation;
	}

	public Ability setGeneration(pokeapi.bittle.models.games.Generation generation) {
		this.generation = generation;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Name> getNames() {
		return names;
	}

	public Ability setNames(java.util.ArrayList<pokeapi.bittle.models.utility.Name> names) {
		this.names = names;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.VerboseEffect> getEffectEntries() {
		return effect_entries;
	}

	public Ability setEffectEntries(java.util.ArrayList<pokeapi.bittle.models.utility.VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityEffectChange> getEffectChanges() {
		return effect_changes;
	}

	public Ability setEffectChanges(java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityFlavorText> getFlavorTextEntries() {
		return flavor_text_entries;
	}

	public Ability setFlavorTextEntries(java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityPokemon> getPokemon() {
		return pokemon;
	}

	public Ability setPokemon(java.util.ArrayList<pokeapi.bittle.models.pokemon.AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	private static Ability get(String url) {
		Ability obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), Ability.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Ability get() {
		return Ability.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("ability", limit, offset);
	}

	public static Ability getById(int id) {
		return get("https://pokeapi.co/api/v2/ability/" + id);
	}

	public static Ability getByName(String name) {
		return get("https://pokeapi.co/api/v2/ability/" + name);
	}
}