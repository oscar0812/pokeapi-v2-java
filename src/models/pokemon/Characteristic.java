package models.pokemon;
/*
{
    "id": 1,
    "gene_modulo": 0,
    "possible_values": [0, 5, 10, 15, 20, 25, 30],
    "highest_stat": {
        "name": "hp",
        "url": "http://pokeapi.co/api/v2/stat/1/"
    },
    "descriptions": [{
        "description": "Loves to eat",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
*/

public class Characteristic extends models.common.APIResource {
	// The identifier for this characteristic models.resource
	private int id;

	// The remainder of the highest stat/IV divided by 5
	private int gene_modulo;

	// The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5
	private java.util.ArrayList<Integer> possible_values;

	// The descriptions of this characteristic listed in different languages
	private java.util.ArrayList<models.common.Description> descriptions;

	private static Characteristic get(String url) {
		String json = api.Information.fromInternet(url);
		Characteristic obj = new com.google.gson.Gson().fromJson(json, Characteristic.class);
		return obj;
	}

	public static models.resource.NamedAPIResourceList getList(int limit, int offset){
		String json = api.Information.fromInternet("https://pokeapi.co/api/v2/berry/?limit="+Math.abs(limit)+"&offset="+ Math.abs(offset));
		return (new com.google.gson.Gson()).fromJson(json, models.resource.NamedAPIResourceList.class);
	}

	public static Characteristic getById(int id) {
		return get("https://pokeapi.co/api/v2/characteristic/" + id);
	}

	public int getId() {
		return id;
	}

	public Characteristic setId(int id) {
		this.id = id;
		return this;
	}

	public int getGeneModulo() {
		return gene_modulo;
	}

	public Characteristic setGeneModulo(int gene_modulo) {
		this.gene_modulo = gene_modulo;
		return this;
	}

	public java.util.ArrayList<Integer> getPossibleValues() {
		return possible_values;
	}

	public Characteristic setPossibleValues(java.util.ArrayList<Integer> possible_values) {
		this.possible_values = possible_values;
		return this;
	}

	public java.util.ArrayList<models.common.Description> getDescriptions() {
		return descriptions;
	}

	public Characteristic setDescriptions(java.util.ArrayList<models.common.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}