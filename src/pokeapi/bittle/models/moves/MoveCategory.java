package pokeapi.bittle.models.moves;

import java.util.ArrayList;
import pokeapi.bittle.models.moves.Move;
import pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokeapi.bittle.models.utility.Description;
import pokeapi.bittle.models.utility.NamedAPIResource;
import pokeapi.bittle.utils.Information;

public class MoveCategory extends NamedAPIResource {
	// 
	private int id;

	// 
	private ArrayList<Description> descriptions;

	// 
	private ArrayList<Move> moves;

	public int getId() {
		return id;
	}

	public MoveCategory setId(int id) {
		this.id = id;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public MoveCategory setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public MoveCategory setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	private static MoveCategory get(String url) {
		MoveCategory obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), MoveCategory.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveCategory get() {
		return MoveCategory.get(this.getUrl());
	}

	public static NamedAPIResourceList getList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-category", limit, offset);
	}

	public static MoveCategory getById(int id) {
		return get("https://pokeapi.co/api/v2/move-category/" + id);
	}

	public static MoveCategory getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-category/" + name);
	}
}