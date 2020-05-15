/* Shapes used for sorting Pokémon in a Pokédex. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "ball",
  "awesome_names": [
    {
      "awesome_name": "Pomaceous",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "names": [
    {
      "name": "Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "shellder",
      "url": "https://pokeapi.co/api/v2/pokemon-species/90/"
    }
  ]
}
*/

import pokeapi.bittle.models.utility.Language;

public class AwesomeName {
	// The localized "scientific" name for an API resource in a specific language.
	private String awesome_name;

	// The language this "scientific" name is in.
	private Language language;

	public String getAwesomeName() {
		return awesome_name;
	}

	public AwesomeName setAwesomeName(String awesome_name) {
		this.awesome_name = awesome_name;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public AwesomeName setLanguage(Language language) {
		this.language = language;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}