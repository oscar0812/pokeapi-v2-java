/* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. */

package com.github.oscar0812.pokeapi.models.evolution;

import com.github.oscar0812.pokeapi.models.items.Item;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.APIResource;
import com.github.oscar0812.pokeapi.utils.Information;

public class EvolutionChain extends APIResource {
	// The identifier for this resource.
	private int id;

	// The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	private Item baby_trigger_item;

	// The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	private ChainLink chain;

	public int getId() {
		return id;
	}

	public EvolutionChain setId(int id) {
		this.id = id;
		return this;
	}

	public Item getBabyTriggerItem() {
		if(!baby_trigger_item.getIsFetched()) {
			baby_trigger_item = baby_trigger_item.get();
		}
		return baby_trigger_item;
	}

	public EvolutionChain setBabyTriggerItem(Item baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
		return this;
	}

	public ChainLink getChain() {
		return chain;
	}

	public EvolutionChain setChain(ChainLink chain) {
		this.chain = chain;
		return this;
	}

	private static EvolutionChain get(String url) {
		EvolutionChain obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), EvolutionChain.class);
		obj.setIsFetched(true);
		return obj;
	}

	public EvolutionChain get() {
		return EvolutionChain.get(this.getUrl());
	}

	public static EvolutionChain getById(int id) {
		return get("https://pokeapi.co/api/v2/evolution-chain/" + id);
	}
}