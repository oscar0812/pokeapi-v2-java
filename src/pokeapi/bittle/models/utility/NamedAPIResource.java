package pokeapi.bittle.models.utility;

public class NamedAPIResource extends pokeapi.bittle.models.utility.APIResource {
	// The name of the referenced resource.
	private String name;

	public String getName() {
		return name;
	}

	public NamedAPIResource setName(String name) {
		this.name = name;
		return this;
	}
}