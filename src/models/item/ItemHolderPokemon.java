package models.item;

import java.util.ArrayList;

public class ItemHolderPokemon {
    // The Pokémon that holds this item
    private String pokemon;

    // The details for the version that this item is held in by the Pokémon
    private ArrayList<ItemHolderPokemonVersionDetail> version_details;

    public ItemHolderPokemon(String pokemon, ArrayList<ItemHolderPokemonVersionDetail> version_details){
        this.pokemon = pokemon;
        this.version_details = version_details;
    }

    public String getPokemon() {
        return pokemon;
    }

    public ArrayList<ItemHolderPokemonVersionDetail> getVersionDetails() {
        return version_details;
    }
}