package models;

import models.resource.named.Generation;

public class GenerationGameIndex {
    // The internal id of an API resource within game data
    private int game_index;

    // The generation relevent to this game index
    private Generation generation;

    public GenerationGameIndex(int game_index, Generation generation) {
        this.game_index = game_index;
        this.generation = generation;
    }

    public int getGame_index() {
        return game_index;
    }

    public Generation getGeneration() {
        return generation;
    }
}
