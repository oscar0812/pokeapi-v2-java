/* Very general categories that loosely group move effects. */

package pokeapi.bittle.models.moves;
/*
{
  "id": 1,
  "name": "ailment",
  "descriptions": [
    {
      "description": "No damage; inflicts status ailment",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "moves": [
    {
      "name": "sing",
      "url": "https://pokeapi.co/api/v2/move/47/"
    }
  ]
}
*/

public class ModelName {
	// The identifier for this resource.
	private int id;

	// The name for this resource.
	private String name;

	// A list of moves that fall into this category.
	private java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves;

	// The description of this resource listed in different languages.
	private java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions;

	public int getId() {
		return id;
	}

	public ModelName setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ModelName setName(String name) {
		this.name = name;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.moves.Move> getMoves() {
		return moves;
	}

	public ModelName setMoves(java.util.ArrayList<pokeapi.bittle.models.moves.Move> moves) {
		this.moves = moves;
		return this;
	}

	public java.util.ArrayList<pokeapi.bittle.models.utility.Description> getDescriptions() {
		return descriptions;
	}

	public ModelName setDescriptions(java.util.ArrayList<pokeapi.bittle.models.utility.Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}