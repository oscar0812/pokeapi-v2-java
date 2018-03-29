package models.resource;

/*
{
    "id": 7,
    "baby_trigger_item": null,
    "chain": {
        "is_baby": false,
        "species": {
            "name": "rattata",
            "url": "http://pokeapi.co/api/v2/pokemon-species/19/"
        },
        "evolution_details": null,
        "evolves_to": [{
            "is_baby": false,
            "species": {
                "name": "raticate",
                "url": "http://pokeapi.co/api/v2/pokemon-species/20/"
            },
            "evolution_details": {
                "item": null,
                "trigger": {
                    "name": "level-up",
                    "url": "http://pokeapi.co/api/v2/evolution-trigger/1/"
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
            },
            "evolves_to": []
        }]
    }
}

 */

import models.evolution.ChainLink;
import models.resource.named.Item;

public class EvolutionChain extends APIResource {
    // The identifier for this evolution chain resource
    private int id;

    // The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon
    // rather than a basic Pokémon
    private Item baby_trigger;

    // The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link
    // references the next Pokémon in the natural evolution order.
    private ChainLink chain;

    public EvolutionChain(String url, int id, Item baby_trigger, ChainLink chain){
        this.url = url;
        this.id = id;
        this.baby_trigger = baby_trigger;
        this.chain = chain;
    }

    public int getId() {
        return id;
    }

    public Item getBabyTrigger() {
        return baby_trigger;
    }

    public ChainLink getChain() {
        return chain;
    }
}
