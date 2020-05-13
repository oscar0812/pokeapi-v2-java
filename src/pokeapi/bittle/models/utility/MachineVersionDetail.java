package pokeapi.bittle.models.utility;

public class MachineVersionDetail {
	public pokeapi.bittle.models.machines.Machine getMachine() {
		if(!machine.getIsFetched()) {
			machine = machine.get();
		}

		return machine;
	}

	public MachineVersionDetail setMachine(pokeapi.bittle.models.machines.Machine machine) {
		this.machine = machine;
		return this;
	}

	public pokeapi.bittle.models.games.VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}

		return version_group;
	}

	public MachineVersionDetail setVersionGroup(pokeapi.bittle.models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	// The machine that teaches a move from an item.
	private pokeapi.bittle.models.machines.Machine machine;

	// The version group of this specific machine.
	private pokeapi.bittle.models.games.VersionGroup version_group;

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}