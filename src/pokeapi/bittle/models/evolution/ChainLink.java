/* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. */

package pokeapi.bittle.models.evolution;
/*
{
  "id": 7,
  "baby_trigger_item": null,
  "chain": {
    "is_baby": false,
    "species": {
      "name": "rattata",
      "url": "https://pokeapi.co/api/v2/pokemon-species/19/"
    },
    "evolution_details": null,
    "evolves_to": [
      {
        "is_baby": false,
        "species": {
          "name": "raticate",
          "url": "https://pokeapi.co/api/v2/pokemon-species/20/"
        },
        "evolution_details": [
          {
            "item": null,
            "trigger": {
              "name": "level-up",
              "url": "https://pokeapi.co/api/v2/evolution-trigger/1/"
            },
            "gender": null,
            "held_item": null,
            "known_move": null,
            "known_move_type": null,
            "location": null,
            "min_level": 20,
            "min_happiness": null,
            "min_beauty": null,
            "min_affection": null,
            "needs_overworld_rain": false,
            "party_species": null,
            "party_type": null,
            "relative_physical_stats": null,
            "time_of_day": "",
            "trade_species": null,
            "turn_upside_down": false
          }
        ],
        "evolves_to": []
      }
    ]
  }
}
*/

import java.util.ArrayList;
import pokeapi.bittle.models.pokemon.PokemonSpecies;

public class ChainLink {
	// Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	private boolean is_baby;

	// The Pokémon species at this point in the evolution chain.
	private PokemonSpecies species;

	// All details regarding the specific details of the referenced Pokémon species evolution.
	private ArrayList<EvolutionDetail> evolution_details;

	// A List of chain objects.
	private ArrayList<ChainLink> evolves_to;

	public boolean getIsBaby() {
		return is_baby;
	}

	public ChainLink setIsBaby(boolean is_baby) {
		this.is_baby = is_baby;
		return this;
	}

	public PokemonSpecies getSpecies() {
		if(!species.getIsFetched()) {
			species = species.get();
		}
		return species;
	}

	public ChainLink setSpecies(PokemonSpecies species) {
		this.species = species;
		return this;
	}

	public ArrayList<EvolutionDetail> getEvolutionDetails() {
		return evolution_details;
	}

	public ChainLink setEvolutionDetails(ArrayList<EvolutionDetail> evolution_details) {
		this.evolution_details = evolution_details;
		return this;
	}

	public ArrayList<ChainLink> getEvolvesTo() {
		return evolves_to;
	}

	public ChainLink setEvolvesTo(ArrayList<ChainLink> evolves_to) {
		this.evolves_to = evolves_to;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}