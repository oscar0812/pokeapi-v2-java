/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.github.oscar0812.pokeapi.models.pokemon;

import java.util.ArrayList;

import com.github.oscar0812.pokeapi.models.moves.MoveDamageClass;
import com.github.oscar0812.pokeapi.utils.Information;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Name;
import com.github.oscar0812.pokeapi.models.utility.NamedAPIResource;

public class Stat extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// ID the games use for this stat.
	private int game_index;

	// Whether this stat only exists within a battle.
	private boolean is_battle_only;

	// A detail of moves which affect this stat positively or negatively.
	private MoveStatAffectSets affecting_moves;

	// A detail of natures which affect this stat positively or negatively.
	private NatureStatAffectSets affecting_natures;

	// A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	private ArrayList<Characteristic> characteristics;

	// The class of damage this stat is directly related to.
	private MoveDamageClass move_damage_class;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	public int getId() {
		return id;
	}

	public Stat setId(int id) {
		this.id = id;
		return this;
	}

	public int getGameIndex() {
		return game_index;
	}

	public Stat setGameIndex(int game_index) {
		this.game_index = game_index;
		return this;
	}

	public boolean getIsBattleOnly() {
		return is_battle_only;
	}

	public Stat setIsBattleOnly(boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
		return this;
	}

	public MoveStatAffectSets getAffectingMoves() {
		return affecting_moves;
	}

	public Stat setAffectingMoves(MoveStatAffectSets affecting_moves) {
		this.affecting_moves = affecting_moves;
		return this;
	}

	public NatureStatAffectSets getAffectingNatures() {
		return affecting_natures;
	}

	public Stat setAffectingNatures(NatureStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
		return this;
	}

	public ArrayList<Characteristic> getCharacteristics() {
		return characteristics;
	}

	public Stat setCharacteristics(ArrayList<Characteristic> characteristics) {
		this.characteristics = characteristics;
		return this;
	}

	public MoveDamageClass getMoveDamageClass() {
		if(!move_damage_class.getIsFetched()) {
			move_damage_class = move_damage_class.get();
		}
		return move_damage_class;
	}

	public Stat setMoveDamageClass(MoveDamageClass move_damage_class) {
		this.move_damage_class = move_damage_class;
		return this;
	}

	public ArrayList<Name> getNames() {
		return names;
	}

	public Stat setNames(ArrayList<Name> names) {
		this.names = names;
		return this;
	}

	private static Stat get(String url) {
		Stat obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), Stat.class);
		obj.setIsFetched(true);
		return obj;
	}

	public Stat get() {
		return Stat.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("stat", limit, offset);
	}

	public static Stat getById(int id) {
		return get("https://pokeapi.co/api/v2/stat/" + id);
	}

	public static Stat getByName(String name) {
		return get("https://pokeapi.co/api/v2/stat/" + name);
	}
}