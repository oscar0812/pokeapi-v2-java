package models;

import models.resource.named.Pokemon;

public class AbilityPokemon {

    // Whether or not this a hidden ability for the referenced Pokémon
    private boolean is_hidden;

    // Pokémon have 3 ability 'slots' which hold references to possible abilities they could have.
    // This is the slot of this ability for the referenced pokemon.
    private int slot;

    // The Pokémon this ability could belong to
    private Pokemon pokemon;

    public AbilityPokemon(boolean is_hidden, int slot, Pokemon pokemon){
        this.is_hidden = is_hidden;
        this.slot = slot;
        this.pokemon = pokemon;
    }

    public boolean isHidden() {
        return is_hidden;
    }

    public int getSlot() {
        return slot;
    }
}
