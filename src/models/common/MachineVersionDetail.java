package models.common;
public class MachineVersionDetail {
	// The machine that teaches a move from an item
	private models.machines.Machine machine;

	// The version group of this specific machine
	private models.games.VersionGroup version_group;

	public models.machines.Machine getMachine() {
		return machine;
	}

	public MachineVersionDetail setMachine(models.machines.Machine machine) {
		this.machine = machine;
		return this;
	}

	public models.games.VersionGroup getVersionGroup() {
		return version_group;
	}

	public MachineVersionDetail setVersionGroup(models.games.VersionGroup version_group) {
		this.version_group = version_group;
		return this;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}