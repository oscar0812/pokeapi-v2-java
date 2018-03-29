package models.resource;

import models.resource.named.Item;
import models.resource.named.Move;
import models.resource.named.VersionGroup;

/*
{
    "id": 1,
    "item": {
        "name": "tm01",
        "url": "http://localhost:8000/api/v2/item/305/"
    },
    "move": {
        "name": "mega-punch",
        "url": "http://localhost:8000/api/v2/move/5/"
    },
    "version_group": {
        "name": "red-blue",
        "url": "http://localhost:8000/api/v2/version/1/"
    }
}

 */

public class Machine extends APIResource {
    // The identifier for this machine resource
    private int id;

    // The TM or HM item that corresponds to this machine
    private Item item;

    // The move that is taught by this machine
    private Move move;

    // The version group that this machine applies to
    private VersionGroup version_group;

    public Machine(String url, int id, Item item, Move move, VersionGroup version_group){
        this.url = url;
        this.id = id;
        this.item = item;
        this.move = move;
        this.version_group = version_group;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public Move getMove() {
        return move;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }
}
