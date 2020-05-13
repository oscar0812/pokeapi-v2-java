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

public class AwesomeName {
	public String getAwesomeName() {
				return awesome_name;
	}

	public AwesomeName setAwesomeName(String awesome_name) {
		this.awesome_name = awesome_name;
		return this;
	}

	public pokeapi.bittle.models.utility.Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}

		return language;
	}

	public AwesomeName setLanguage(pokeapi.bittle.models.utility.Language language) {
		this.language = language;
		return this;
	}

	// The localized "scientific" name for an API resource in a specific language.
	private String awesome_name;

	// The language this "scientific" name is in.
	private pokeapi.bittle.models.utility.Language language;

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}