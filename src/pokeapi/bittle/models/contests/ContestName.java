/* Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.contests;
/*
{
  "id": 1,
  "name": "cool",
  "berry_flavor": {
    "name": "spicy",
    "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
  },
  "names": [
    {
      "name": "Cool",
      "color": "Red",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import pokeapi.bittle.models.utility.Language;

public class ContestName {
	// The name for this contest.
	private String name;

	// The color associated with this contest's name.
	private String color;

	// The language that this name is in.
	private Language language;

	public String getName() {
		return name;
	}

	public ContestName setName(String name) {
		this.name = name;
		return this;
	}

	public String getColor() {
		return color;
	}

	public ContestName setColor(String color) {
		this.color = color;
		return this;
	}

	public Language getLanguage() {
		if(!language.getIsFetched()) {
			language = language.get();
		}
		return language;
	}

	public ContestName setLanguage(Language language) {
		this.language = language;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}