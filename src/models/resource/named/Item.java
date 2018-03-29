package models.resource.named;


import models.*;
import models.item.ItemCategory;
import models.item.ItemHolderPokemon;
import models.item.ItemSprites;
import models.resource.EvolutionChain;

import java.util.ArrayList;

/*
{
    "id": 1,
    "name": "master-ball",
    "cost": 0,
    "fling_power": 10,
    "fling_effect": {
        "name":"flinch",
        "url":"http://pokeapi.co/api/v2/item-fling-effect/7/"
    },
    "attributes": [{
        "name": "holdable",
        "url": "http://pokeapi.co/api/v2/item-attribute/5/"
    }],
    "category": {
        "name": "standard-balls",
        "url": "http://pokeapi.co/api/v2/item-category/34/"
    },
    "effect_entries": [{
        "effect": "Used in battle\n:   [Catches]{mechanic:catch} a wild Pokémon without fail.\n\n    If used in a trainer battle, nothing happens and the ball is lost.",
        "short_effect": "Catches a wild Pokémon every time.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "flavor_text_entries": [{
        "text": "The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail.",
        "version_group": {
            "name": "x-y",
            "url": "http://pokeapi.co/api/v2/version-group/15/"
        },
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "game_indices": [{
        "game_index": 1,
        "generation": {
            "name": "generation-vi",
            "url": "http://pokeapi.co/api/v2/generation/6/"
        }
    }],
    "names": [{
        "name": "Master Ball",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "sprites": {
        "default": "http://pokeapi.co/media/sprites/items/master-ball.png"
    },
    "held_by_pokemon": [{
        "pokemon": {
            "name": "chansey",
            "url": "http://pokeapi.co/api/v2/pokemon/113/"
        },
        "version_details": [{
            "rarity": 50,
            "version": {
                "name": "soulsilver",
                "url": "http://pokeapi.co/api/v2/version/16/"
            }
        }]
    }],
    "baby_trigger_for": {
        "url":"http://pokeapi.co/api/v2/evolution-chain/1/"
    }
}


 */
public class Item extends NamedAPIResource {
    // The identifier for this item resource
    private int id;

    // The price of this item in stores
    private int cost;

    // The power of the move Fling when used with this item
    private int fling_power;

    // The effect of the move Fling when used with this item
    private ItemFlingEffect fling_effect;

    // A list of attributes this item has
    private ArrayList<ItemAttribute> attributes;

    // The category of items this item falls into
    private ItemCategory category;

    // The effect of this ability listed in different languages
    private ArrayList<VerboseEffect> effect_entries;

    // The flavor text of this ability listed in different languages
    private ArrayList<VersionGroupFlavorText> flavor_text_entries;

    // A list of game indices relevent to this item by generation
    private ArrayList<GenerationGameIndex> game_indices;

    // The name of this item listed in different languages
    private ArrayList<Name> names;

    // A set of sprites used to depict this item in the game
    private ItemSprites sprites;

    // A list of Pokémon that might be found in the wild holding this item
    private ArrayList<ItemHolderPokemon> held_by_pokemon;

    // An evolution chain this item requires to produce a bay during mating
    private EvolutionChain baby_trigger_for;

    // A list of the machines related to this item
    private ArrayList<MachineVersionDetail> machines;

    public Item(String url, String name, int id, int cost, int fling_power, ItemFlingEffect fling_effect,
                ArrayList<ItemAttribute> attributes, ItemCategory category, ArrayList<VerboseEffect> effect_entries,
                ArrayList<VersionGroupFlavorText> flavor_text_entries, ArrayList<GenerationGameIndex> game_indices,
                ArrayList<Name> names, ItemSprites sprites, ArrayList<ItemHolderPokemon> held_by_pokemon,
                EvolutionChain baby_trigger_for, ArrayList<MachineVersionDetail> machines) {
        this.url = url;
        this.name = name;
        this.id = id;
        this.cost = cost;
        this.fling_power = fling_power;
        this.fling_effect = fling_effect;
        this.attributes = attributes;
        this.category = category;
        this.effect_entries = effect_entries;
        this.flavor_text_entries = flavor_text_entries;
        this.game_indices = game_indices;
        this.names = names;
        this.sprites = sprites;
        this.held_by_pokemon = held_by_pokemon;
        this.baby_trigger_for = baby_trigger_for;
        this.machines = machines;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public int getFlingPower() {
        return fling_power;
    }

    public ItemFlingEffect getFlingEffect() {
        return fling_effect;
    }

    public ArrayList<ItemAttribute> getAttributes() {
        return attributes;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public ArrayList<VerboseEffect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<VersionGroupFlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<GenerationGameIndex> getGameIndices() {
        return game_indices;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ItemSprites getSprites() {
        return sprites;
    }

    public ArrayList<ItemHolderPokemon> getHeldByPokemon() {
        return held_by_pokemon;
    }

    public EvolutionChain getBabyTriggerFor() {
        return baby_trigger_for;
    }

    public ArrayList<MachineVersionDetail> getMachines() {
        return machines;
    }
}