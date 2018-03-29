package models;

import models.resource.Machine;
import models.resource.named.VersionGroup;

public class MachineVersionDetail {
    // The machine that teaches a move from an item
    private Machine machine;

    // The version group of this specific machine
    private VersionGroup version_group;

    public MachineVersionDetail(Machine machine, VersionGroup version_group){
        this.machine = machine;
        this.version_group = version_group;
    }

    public Machine getMachine() {
        return machine;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
