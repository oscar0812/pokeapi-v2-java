package models.resource;

import models.Effect;
import models.FlavorText;
import models.resource.APIResource;

import java.util.ArrayList;

/*
{
    "id": 1,
    "appeal": 4,
    "jam": 0,
    "effect_entries": [{
        "effect": "Gives a high number of appeal points wth no other effects.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }],
    "flavor_text_entries": [{
        "flavor_text": "A highly appealing move.",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}

 */
public class ContestEffect extends APIResource {
    // The identifier for this contest type resource
    private int id;

    // The base number of hearts the user of this move gets
    private int appeal;

    // The base number of hearts the user's opponent loses
    private int jam;

    // The result of this contest effect listed in different languages
    private ArrayList<Effect> effect_entries;

    // The flavor text of this contest effect listed in different languages
    private ArrayList<FlavorText> flavor_text_entries;

    public ContestEffect(String url, int id, int appeal, int jam, ArrayList<Effect> effect_entries,
                         ArrayList<FlavorText> flavor_text_entries) {
        this.url = url;
        this.id = id;
        this.appeal = appeal;
        this.jam = jam;
        this.effect_entries = effect_entries;
        this.flavor_text_entries = flavor_text_entries;

    }

    public int getId() {
        return id;
    }

    public int getAppeal() {
        return appeal;
    }

    public int getJam() {
        return jam;
    }

    public ArrayList<Effect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<FlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }
}
