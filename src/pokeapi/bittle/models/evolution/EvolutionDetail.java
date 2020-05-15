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

import pokeapi.bittle.models.items.Item;
import pokeapi.bittle.models.locations.Location;
import pokeapi.bittle.models.moves.Move;
import pokeapi.bittle.models.pokemon.PokemonSpecies;
import pokeapi.bittle.models.pokemon.Type;

public class EvolutionDetail {
	// The item required to cause evolution this into Pokémon species.
	private Item item;

	// The type of event that triggers evolution into this Pokémon species.
	private EvolutionTrigger trigger;

	// The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
	private int gender;

	// The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
	private Item held_item;

	// The move that must be known by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
	private Move known_move;

	// The evolving Pokémon species must know a move with this type during the evolution trigger event in order to evolve into this Pokémon species.
	private Type known_move_type;

	// The location the evolution must be triggered at.
	private Location location;

	// The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
	private int min_level;

	// The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
	private int min_happiness;

	// The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
	private int min_beauty;

	// The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
	private int min_affection;

	// Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
	private boolean needs_overworld_rain;

	// The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
	private PokemonSpecies party_species;

	// The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
	private Type party_type;

	// The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
	private int relative_physical_stats;

	// The required time of day. Day or night.
	private String time_of_day;

	// Pokémon species for which this one must be traded.
	private PokemonSpecies trade_species;

	// Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
	private boolean turn_upside_down;

	public Item getItem() {
		if(!item.getIsFetched()) {
			item = item.get();
		}
		return item;
	}

	public EvolutionDetail setItem(Item item) {
		this.item = item;
		return this;
	}

	public EvolutionTrigger getTrigger() {
		if(!trigger.getIsFetched()) {
			trigger = trigger.get();
		}
		return trigger;
	}

	public EvolutionDetail setTrigger(EvolutionTrigger trigger) {
		this.trigger = trigger;
		return this;
	}

	public int getGender() {
		return gender;
	}

	public EvolutionDetail setGender(int gender) {
		this.gender = gender;
		return this;
	}

	public Item getHeldItem() {
		if(!held_item.getIsFetched()) {
			held_item = held_item.get();
		}
		return held_item;
	}

	public EvolutionDetail setHeldItem(Item held_item) {
		this.held_item = held_item;
		return this;
	}

	public Move getKnownMove() {
		if(!known_move.getIsFetched()) {
			known_move = known_move.get();
		}
		return known_move;
	}

	public EvolutionDetail setKnownMove(Move known_move) {
		this.known_move = known_move;
		return this;
	}

	public Type getKnownMoveType() {
		if(!known_move_type.getIsFetched()) {
			known_move_type = known_move_type.get();
		}
		return known_move_type;
	}

	public EvolutionDetail setKnownMoveType(Type known_move_type) {
		this.known_move_type = known_move_type;
		return this;
	}

	public Location getLocation() {
		if(!location.getIsFetched()) {
			location = location.get();
		}
		return location;
	}

	public EvolutionDetail setLocation(Location location) {
		this.location = location;
		return this;
	}

	public int getMinLevel() {
		return min_level;
	}

	public EvolutionDetail setMinLevel(int min_level) {
		this.min_level = min_level;
		return this;
	}

	public int getMinHappiness() {
		return min_happiness;
	}

	public EvolutionDetail setMinHappiness(int min_happiness) {
		this.min_happiness = min_happiness;
		return this;
	}

	public int getMinBeauty() {
		return min_beauty;
	}

	public EvolutionDetail setMinBeauty(int min_beauty) {
		this.min_beauty = min_beauty;
		return this;
	}

	public int getMinAffection() {
		return min_affection;
	}

	public EvolutionDetail setMinAffection(int min_affection) {
		this.min_affection = min_affection;
		return this;
	}

	public boolean getNeedsOverworldRain() {
		return needs_overworld_rain;
	}

	public EvolutionDetail setNeedsOverworldRain(boolean needs_overworld_rain) {
		this.needs_overworld_rain = needs_overworld_rain;
		return this;
	}

	public PokemonSpecies getPartySpecies() {
		if(!party_species.getIsFetched()) {
			party_species = party_species.get();
		}
		return party_species;
	}

	public EvolutionDetail setPartySpecies(PokemonSpecies party_species) {
		this.party_species = party_species;
		return this;
	}

	public Type getPartyType() {
		if(!party_type.getIsFetched()) {
			party_type = party_type.get();
		}
		return party_type;
	}

	public EvolutionDetail setPartyType(Type party_type) {
		this.party_type = party_type;
		return this;
	}

	public int getRelativePhysicalStats() {
		return relative_physical_stats;
	}

	public EvolutionDetail setRelativePhysicalStats(int relative_physical_stats) {
		this.relative_physical_stats = relative_physical_stats;
		return this;
	}

	public String getTimeOfDay() {
		return time_of_day;
	}

	public EvolutionDetail setTimeOfDay(String time_of_day) {
		this.time_of_day = time_of_day;
		return this;
	}

	public PokemonSpecies getTradeSpecies() {
		if(!trade_species.getIsFetched()) {
			trade_species = trade_species.get();
		}
		return trade_species;
	}

	public EvolutionDetail setTradeSpecies(PokemonSpecies trade_species) {
		this.trade_species = trade_species;
		return this;
	}

	public boolean getTurnUpsideDown() {
		return turn_upside_down;
	}

	public EvolutionDetail setTurnUpsideDown(boolean turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}