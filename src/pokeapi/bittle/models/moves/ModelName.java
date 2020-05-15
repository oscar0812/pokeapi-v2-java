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

import java.util.ArrayList;
import pokeapi.bittle.models.utility.Description;

public class ModelName {
	// The identifier for this resource.
	private int id;

	// The name for this resource.
	private String name;

	// A list of moves that fall into this category.
	private ArrayList<Move> moves;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

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

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public ModelName setMoves(ArrayList<Move> moves) {
		this.moves = moves;
		return this;
	}

	public ArrayList<Description> getDescriptions() {
		return descriptions;
	}

	public ModelName setDescriptions(ArrayList<Description> descriptions) {
		this.descriptions = descriptions;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}