/* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. */

package pokeapi.bittle.models.pokemon;
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
    "url": "https://pokeapi.co/api/v2/growth-rate/2/"
  },
  "pokedex_numbers": [
    {
      "entry_number": 45,
      "pokedex": {
        "name": "kalos-central",
        "url": "https://pokeapi.co/api/v2/pokedex/12/"
      }
    }
  ],
  "egg_groups": [
    {
      "name": "bug",
      "url": "https://pokeapi.co/api/v2/egg-group/3/"
    }
  ],
  "color": {
    "name": "gray",
    "url": "https://pokeapi.co/api/v2/pokemon-color/4/"
  },
  "shape": {
    "name": "squiggle",
    "url": "https://pokeapi.co/api/v2/pokemon-shape/2/"
  },
  "evolves_from_species": {
    "name": "burmy",
    "url": "https://pokeapi.co/api/v2/pokemon-species/412/"
  },
  "evolution_chain": {
    "url": "https://pokeapi.co/api/v2/evolution-chain/213/"
  },
  "habitat": null,
  "generation": {
    "name": "generation-iv",
    "url": "https://pokeapi.co/api/v2/generation/4/"
  },
  "names": [
    {
      "name": "Wormadam",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "When the bulb on\nits back grows\nlarge, it appears\fto lose the\nability to stand\non its hind legs.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      },
      "version": {
        "name": "red",
        "url": "https://pokeapi.co/api/v2/version/1/"
      }
    }
  ],
  "form_descriptions": [
    {
      "description": "Forms have different stats and movepools.  During evolution, Burmy's current cloak becomes Wormadam's form, and can no longer be changed.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "genera": [
    {
      "genus": "Bagworm",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "varieties": [
    {
      "is_default": true,
      "pokemon": {
        "name": "wormadam-plant",
        "url": "https://pokeapi.co/api/v2/pokemon/413/"
      }
    }
  ]
}
*/

public class Genus {
	// The localized genus for the referenced Pokémon species
	private String genus;

	// The language this genus is in.
	private pokeapi.bittle.models.utility.Language language;

	public String getGenus() {
		return genus;
	}

	public Genus setGenus(String genus) {
		this.genus = genus;
		return this;
	}

	public pokeapi.bittle.models.utility.Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public Genus setLanguage(pokeapi.bittle.models.utility.Language language) {
		this.language = language;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}