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

public class EvolutionChain extends pokeapi.bittle.models.utility.APIResource {
	// The identifier for this resource.
	private int id;

	// The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	private pokeapi.bittle.models.items.Item baby_trigger_item;

	// The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	private pokeapi.bittle.models.evolution.ChainLink chain;

	public int getId() {
		return id;
	}

	public EvolutionChain setId(int id) {
		this.id = id;
		return this;
	}

	public pokeapi.bittle.models.items.Item getBabyTriggerItem() {
		if(!baby_trigger_item.getIsFetched()) {
			baby_trigger_item = baby_trigger_item.get();
		}
		return baby_trigger_item;
	}

	public EvolutionChain setBabyTriggerItem(pokeapi.bittle.models.items.Item baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
		return this;
	}

	public pokeapi.bittle.models.evolution.ChainLink getChain() {
		return chain;
	}

	public EvolutionChain setChain(pokeapi.bittle.models.evolution.ChainLink chain) {
		this.chain = chain;
		return this;
	}

	private static EvolutionChain get(String url) {
		EvolutionChain obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), EvolutionChain.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EvolutionChain get() {
		return EvolutionChain.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.APIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("evolution-chain", limit, offset);
	}

	public static EvolutionChain getById(int id) {
		return get("https://pokeapi.co/api/v2/evolution-chain/" + id);
	}
}