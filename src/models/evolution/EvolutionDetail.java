package models.evolution;

import models.resource.named.*;

public class EvolutionDetail {
    // The item required to cause evolution this into Pokémon species
    private Item item;

    // The type of event that triggers evolution into this Pokémon species
    private EvolutionTrigger trigger;

    // The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species
    private int gender;

    // The item the evolving Pokémon species must be holding during the evolution trigger event
    // to evolve into this Pokémon species
    private Item held_item;

    // The move that must be known by the evolving Pokémon species during the evolution trigger event
    // in order to evolve into this Pokémon species
    private Move known_move;

    // The evolving Pokémon species must know a move with this type
    // during the evolution trigger event in order to evolve into this Pokémon species
    private Type known_move_type;

    // The location the evolution must be triggered at
    private Location location;

    // The minimum required level of the evolving Pokémon species to evolve into this Pokémon species
    private int min_level;

    // The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species
    private int min_happiness;

    // The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species
    private int min_beauty;

    // The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species
    private int min_affection;

    // Whether or not it must be raining in the overworld to cause evolution this Pokémon species
    private boolean needs_overworld_rain;

    // The Pokémon species that must be in the players party in order for the evolving
    // Pokémon species to evolve into this Pokémon species
    private PokemonSpecies party_species;

    // The player must have a Pokémon of this type in their party during the evolution trigger
    // event in order for the evolving Pokémon species to evolve into this Pokémon species
    private Type party_type;

    // The required relation between the Pokémon's Attack and Defense stats. 1 means
    // Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense
    private int relative_physical_stats;

    // The required time of day. Day or night
    private String time_of_day;

    // Pokémon species for which this one must be traded
    private String trade_species;

    // Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up
    private boolean turn_upside_down;

    public EvolutionDetail(Item item, EvolutionTrigger trigger, int gender, Item held_item, Move known_move,
                           Type known_move_type, Location location, int min_level, int min_happiness,
                           int min_beauty, int min_affection, boolean needs_overworld_rain, PokemonSpecies party_species,
                           Type party_type, int relative_physical_stats, String time_of_day, String trade_species,
                           boolean turn_upside_down) {
        this.item = item;
        this.trigger = trigger;
        this.gender = gender;
        this.held_item = held_item;
        this.known_move = known_move;
        this.known_move_type = known_move_type;
        this.location = location;
        this.min_level = min_level;
        this.min_happiness = min_happiness;
        this.min_beauty = min_beauty;
        this.min_affection = min_affection;
        this.needs_overworld_rain = needs_overworld_rain;
        this.party_species = party_species;
        this.party_type = party_type;
        this.relative_physical_stats = relative_physical_stats;
        this.time_of_day = time_of_day;
        this.trade_species = trade_species;
        this.turn_upside_down = turn_upside_down;
    }

    public Item getItem() {
        return item;
    }

    public EvolutionTrigger getTrigger() {
        return trigger;
    }

    public int getGender() {
        return gender;
    }

    public Item getHeldItem() {
        return held_item;
    }

    public Move getKnownMove() {
        return known_move;
    }

    public Type getKnownMoveType() {
        return known_move_type;
    }

    public Location getLocation() {
        return location;
    }

    public int getMinLevel() {
        return min_level;
    }

    public int getMinHappiness() {
        return min_happiness;
    }

    public int getMinBeauty() {
        return min_beauty;
    }

    public int getMinAffection() {
        return min_affection;
    }

    public boolean needsOverworldRain() {
        return needs_overworld_rain;
    }

    public PokemonSpecies getPartySpecies() {
        return party_species;
    }

    public Type getPartyType() {
        return party_type;
    }

    public int getRelativePhysicalStats() {
        return relative_physical_stats;
    }

    public String getTimeOfDay() {
        return time_of_day;
    }

    public String getTradeSpecies() {
        return trade_species;
    }

    public boolean turnUpsideDown() {
        return turn_upside_down;
    }
}
