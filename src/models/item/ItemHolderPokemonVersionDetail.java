package models.item;

import models.resource.named.Version;

public class ItemHolderPokemonVersionDetail {
    // How often this Pokémon holds this item in this version
    private String rarity;

    // The version that this item is held in by the Pokémon
    private Version version;

    public ItemHolderPokemonVersionDetail(String rarity, Version version){
        this.rarity = rarity;
        this.version = version;
    }

    public String getRarity() {
        return rarity;
    }

    public Version getVersion() {
        return version;
    }
}
