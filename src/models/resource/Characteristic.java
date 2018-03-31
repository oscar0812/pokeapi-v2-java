package models.resource;

import models.Description;

import java.util.ArrayList;

/*
{
    "id": 1,
    "gene_modulo": 0,
    "possible_values": [0, 5, 10, 15, 20, 25, 30],
    "highest_stat": {
        "name": "hp",
        "url": "http://pokeapi.co/api/v2/stat/1/"
    },
    "descriptions": [{
        "description": "Loves to eat",
        "language": {
            "name": "en",
            "url": "http://pokeapi.co/api/v2/language/9/"
        }
    }]
}
 */

public class Characteristic extends APIResource {
    // The identifier for this characteristic resource
    private int id;

    // The remainder of the highest stat/IV divided by 5
    private int gene_modulo;

    // The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5
    private ArrayList<Integer> possible_values;

    // The descriptions of this characteristic listed in different languages
    private ArrayList<Description> descriptions;

    public Characteristic(int id, int gene_modulo, ArrayList<Integer> possible_values, ArrayList<Description> descriptions) {
        this.id = id;
        this.gene_modulo = gene_modulo;
        this.possible_values = possible_values;
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }

    public int getGeneModulo() {
        return gene_modulo;
    }

    public ArrayList<Integer> getPossibleValues() {
        return possible_values;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }
}
