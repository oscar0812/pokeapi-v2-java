package common;
public class MachineVersionDetail {
	// The machine that teaches a move from an item
	private machines.Machine machine;

	// The version group of this specific machine
	private games.VersionGroup version_group;

	public machines.Machine getMachine() {
		return machine;
	}

	public MachineVersionDetail setMachine(machines.Machine machine) {
		this.machine = machine;
		return this;
	}

	public games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public MachineVersionDetail setVersionGroup(games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}