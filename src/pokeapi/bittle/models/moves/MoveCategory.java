package pokeapi.bittle.models.moves;

public class MoveCategory extends pokeapi.bittle.models.utility.NamedAPIResource {
	// 
	private int id;

	// 
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	public int getId() {
		return id;
	}

	public MoveCategory setId(int id) {
		this.id = id;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
		return descriptions;
	}

	public MoveCategory setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	private static MoveCategory get(String url) {
		MoveCategory obj = new com.google.gson.Gson().fromJson(pokeapi.bittle.utils.Information.fromInternet(url), MoveCategory.class);
		obj.setIsFetched(true);
		return obj;
	}

	public MoveCategory get() {
		return MoveCategory.get(this.getUrl());
	}

	public static pokeapi.bittle.models.resources.NamedAPIResourceList getList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-category", limit, offset);
	}

	public static MoveCategory getById(int id) {
		return get("https://pokeapi.co/api/v2/move-category/" + id);
	}

	public static MoveCategory getByName(String name) {
		return get("https://pokeapi.co/api/v2/move-category/" + name);
	}
}