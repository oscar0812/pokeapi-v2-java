package pokeapi.bittle.models.utility;

import pokeapi.bittle.models.games.VersionGroup;
import pokeapi.bittle.models.machines.Machine;

public class MachineVersionDetail {
	// The machine that teaches a move from an item.
	private Machine machine;

	// The version group of this specific machine.
	private VersionGroup version_group;

	public Machine getMachine() {
		if(!machine.getIsFetched()) {
			machine = machine.get();
		}
		return machine;
	}

	public MachineVersionDetail setMachine(Machine machine) {
		this.machine = machine;
		return this;
	}

	public VersionGroup getVersionGroup() {
		if(!version_group.getIsFetched()) {
			version_group = version_group.get();
		}
		return version_group;
	}

	public MachineVersionDetail setVersionGroup(VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}