package models.evolution;
public class EvolutionDetail {
	// The item required to cause models.evolution this into Pokémon species
	private models.items.Item item;

	// The type of event that triggers models.evolution into this Pokémon species
	private models.evolution.EvolutionTrigger trigger;

	// The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species
	private int gender;

	// The item the evolving Pokémon species must be holding during the models.evolution trigger event to evolve into this Pokémon species
	private models.items.Item held_item;

	// The move that must be known by the evolving Pokémon species during the models.evolution trigger event in order to evolve into this Pokémon species
	private models.moves.Move known_move;

	// The evolving Pokémon species must know a move with this type during the models.evolution trigger event in order to evolve into this Pokémon species
	private models.pokemon.Type known_move_type;

	// The location the models.evolution must be triggered at.
	private models.locations.Location location;

	// The minimum required level of the evolving Pokémon species to evolve into this Pokémon species
	private int min_level;

	// The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species
	private int min_happiness;

	// The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species
	private int min_beauty;

	// The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species
	private int min_affection;

	// Whether or not it must be raining in the overworld to cause models.evolution this Pokémon species
	private boolean needs_overworld_rain;

	// The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species
	private models.pokemon.PokemonSpecies party_species;

	// The player must have a Pokémon of this type in their party during the models.evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species
	private models.pokemon.Type party_type;

	// The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
	private int relative_physical_stats;

	// The required time of day. Day or night.
	private String time_of_day;

	// Pokémon species for which this one must be traded.
	private models.pokemon.PokemonSpecies trade_species;

	// Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
	private boolean turn_upside_down;

	public models.items.Item getItem() {
		return item;
	}

	public EvolutionDetail setItem(models.items.Item item) {
		this.item = item;
		return this;
	}

	public models.evolution.EvolutionTrigger getTrigger() {
		return trigger;
	}

	public EvolutionDetail setTrigger(models.evolution.EvolutionTrigger trigger) {
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

	public models.items.Item getHeldItem() {
		return held_item;
	}

	public EvolutionDetail setHeldItem(models.items.Item held_item) {
		this.held_item = held_item;
		return this;
	}

	public models.moves.Move getKnownMove() {
		return known_move;
	}

	public EvolutionDetail setKnownMove(models.moves.Move known_move) {
		this.known_move = known_move;
		return this;
	}

	public models.pokemon.Type getKnownMoveType() {
		return known_move_type;
	}

	public EvolutionDetail setKnownMoveType(models.pokemon.Type known_move_type) {
		this.known_move_type = known_move_type;
		return this;
	}

	public models.locations.Location getLocation() {
		return location;
	}

	public EvolutionDetail setLocation(models.locations.Location location) {
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

	public boolean needsOverworldRain() {
		return needs_overworld_rain;
	}

	public EvolutionDetail setNeedsOverworldRain(boolean needs_overworld_rain) {
		this.needs_overworld_rain = needs_overworld_rain;
		return this;
	}

	public models.pokemon.PokemonSpecies getPartySpecies() {
		return party_species;
	}

	public EvolutionDetail setPartySpecies(models.pokemon.PokemonSpecies party_species) {
		this.party_species = party_species;
		return this;
	}

	public models.pokemon.Type getPartyType() {
		return party_type;
	}

	public EvolutionDetail setPartyType(models.pokemon.Type party_type) {
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

	public models.pokemon.PokemonSpecies getTradeSpecies() {
		return trade_species;
	}

	public EvolutionDetail setTradeSpecies(models.pokemon.PokemonSpecies trade_species) {
		this.trade_species = trade_species;
		return this;
	}

	public boolean turnUpsideDown() {
		return turn_upside_down;
	}

	public EvolutionDetail setTurnUpsideDown(boolean turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}