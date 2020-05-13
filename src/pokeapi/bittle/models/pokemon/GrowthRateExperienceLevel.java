/* Growth rates are the speed with which Pokémon gain levels through experience. Check out Bulbapedia for greater detail. */

package pokeapi.bittle.models.pokemon;
/*
{
  "id": 1,
  "name": "slow",
  "formula": "\\frac{5x^3}{4}",
  "descriptions": [
    {
      "description": "langsam",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "levels": [
    {
      "level": 100,
      "experience": 1250000
    }
  ],
  "pokemon_species": [
    {
      "name": "growlithe",
      "url": "https://pokeapi.co/api/v2/pokemon-species/58/"
    }
  ]
}
*/

public class GrowthRateExperienceLevel {
	// The level gained.
	private int level;

	// The amount of experience required to reach the referenced level.
	private int experience;

	public int getLevel() {
		return level;
	}

	public GrowthRateExperienceLevel setLevel(int level) {
		this.level = level;
		return this;
	}

	public int getExperience() {
		return experience;
	}

	public GrowthRateExperienceLevel setExperience(int experience) {
		this.experience = experience;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}