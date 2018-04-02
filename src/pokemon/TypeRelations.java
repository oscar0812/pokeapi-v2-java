package pokemon;
public class TypeRelations {
	// A list of types this type has no effect on
	private java.util.ArrayList<pokemon.Type> no_damage_to;

	// A list of types this type is not very effect against
	private java.util.ArrayList<pokemon.Type> half_damage_to;

	// A list of types this type is very effect against
	private java.util.ArrayList<pokemon.Type> double_damage_to;

	// A list of types that have no effect on this type
	private java.util.ArrayList<pokemon.Type> no_damage_from;

	// A list of types that are not very effective against this type
	private java.util.ArrayList<pokemon.Type> half_damage_from;

	// A list of types that are very effective against this type
	private java.util.ArrayList<pokemon.Type> double_damage_from;

	public java.util.ArrayList<pokemon.Type> getNoDamageTo() {
		return no_damage_to;
	}

	public TypeRelations setNoDamageTo(java.util.ArrayList<pokemon.Type> no_damage_to) {
		this.no_damage_to = no_damage_to;
		return this;
	}

	public java.util.ArrayList<pokemon.Type> getHalfDamageTo() {
		return half_damage_to;
	}

	public TypeRelations setHalfDamageTo(java.util.ArrayList<pokemon.Type> half_damage_to) {
		this.half_damage_to = half_damage_to;
		return this;
	}

	public java.util.ArrayList<pokemon.Type> getDoubleDamageTo() {
		return double_damage_to;
	}

	public TypeRelations setDoubleDamageTo(java.util.ArrayList<pokemon.Type> double_damage_to) {
		this.double_damage_to = double_damage_to;
		return this;
	}

	public java.util.ArrayList<pokemon.Type> getNoDamageFrom() {
		return no_damage_from;
	}

	public TypeRelations setNoDamageFrom(java.util.ArrayList<pokemon.Type> no_damage_from) {
		this.no_damage_from = no_damage_from;
		return this;
	}

	public java.util.ArrayList<pokemon.Type> getHalfDamageFrom() {
		return half_damage_from;
	}

	public TypeRelations setHalfDamageFrom(java.util.ArrayList<pokemon.Type> half_damage_from) {
		this.half_damage_from = half_damage_from;
		return this;
	}

	public java.util.ArrayList<pokemon.Type> getDoubleDamageFrom() {
		return double_damage_from;
	}

	public TypeRelations setDoubleDamageFrom(java.util.ArrayList<pokemon.Type> double_damage_from) {
		this.double_damage_from = double_damage_from;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}