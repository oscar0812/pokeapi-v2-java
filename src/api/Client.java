package api;

public class Client {
    // get a Gender instance by the id
    public models.pokemon.Gender getGenderById(int id) {
        return models.pokemon.Gender.getById(id);
    }

    // get a Gender instance by the name
    public models.pokemon.Gender getGenderByName(String name) {
        return models.pokemon.Gender.getByName(name);
    }

    // get a Item instance by the id
    public models.items.Item getItemById(int id) {
        return models.items.Item.getById(id);
    }

    // get a Item instance by the name
    public models.items.Item getItemByName(String name) {
        return models.items.Item.getByName(name);
    }

    // get a ItemCategory instance by the id
    public models.items.ItemCategory getItemCategoryById(int id) {
        return models.items.ItemCategory.getById(id);
    }

    // get a ItemCategory instance by the name
    public models.items.ItemCategory getItemCategoryByName(String name) {
        return models.items.ItemCategory.getByName(name);
    }

    // get a MoveDamageClass instance by the id
    public models.moves.MoveDamageClass getMoveDamageClassById(int id) {
        return models.moves.MoveDamageClass.getById(id);
    }

    // get a MoveDamageClass instance by the name
    public models.moves.MoveDamageClass getMoveDamageClassByName(String name) {
        return models.moves.MoveDamageClass.getByName(name);
    }

    // get a EncounterMethod instance by the id
    public models.encounters.EncounterMethod getEncounterMethodById(int id) {
        return models.encounters.EncounterMethod.getById(id);
    }

    // get a EncounterMethod instance by the name
    public models.encounters.EncounterMethod getEncounterMethodByName(String name) {
        return models.encounters.EncounterMethod.getByName(name);
    }

    // get a BerryFlavor instance by the id
    public models.berries.BerryFlavor getBerryFlavorById(int id) {
        return models.berries.BerryFlavor.getById(id);
    }

    // get a BerryFlavor instance by the name
    public models.berries.BerryFlavor getBerryFlavorByName(String name) {
        return models.berries.BerryFlavor.getByName(name);
    }

    // get a EvolutionChain instance by the id
    public models.evolution.EvolutionChain getEvolutionChainById(int id) {
        return models.evolution.EvolutionChain.getById(id);
    }

    // get a PokemonShape instance by the id
    public models.pokemon.PokemonShape getPokemonShapeById(int id) {
        return models.pokemon.PokemonShape.getById(id);
    }

    // get a PokemonShape instance by the name
    public models.pokemon.PokemonShape getPokemonShapeByName(String name) {
        return models.pokemon.PokemonShape.getByName(name);
    }

    // get a Berry instance by the id
    public models.berries.Berry getBerryById(int id) {
        return models.berries.Berry.getById(id);
    }

    // get a Berry instance by the name
    public models.berries.Berry getBerryByName(String name) {
        return models.berries.Berry.getByName(name);
    }

    // get a PokeathlonStat instance by the id
    public models.pokemon.PokeathlonStat getPokeathlonStatById(int id) {
        return models.pokemon.PokeathlonStat.getById(id);
    }

    // get a PokeathlonStat instance by the name
    public models.pokemon.PokeathlonStat getPokeathlonStatByName(String name) {
        return models.pokemon.PokeathlonStat.getByName(name);
    }

    // get a ItemFlingEffect instance by the id
    public models.items.ItemFlingEffect getItemFlingEffectById(int id) {
        return models.items.ItemFlingEffect.getById(id);
    }

    // get a ItemFlingEffect instance by the name
    public models.items.ItemFlingEffect getItemFlingEffectByName(String name) {
        return models.items.ItemFlingEffect.getByName(name);
    }

    // get a Generation instance by the id
    public models.games.Generation getGenerationById(int id) {
        return models.games.Generation.getById(id);
    }

    // get a Generation instance by the name
    public models.games.Generation getGenerationByName(String name) {
        return models.games.Generation.getByName(name);
    }

    // get a GrowthRate instance by the id
    public models.pokemon.GrowthRate getGrowthRateById(int id) {
        return models.pokemon.GrowthRate.getById(id);
    }

    // get a GrowthRate instance by the name
    public models.pokemon.GrowthRate getGrowthRateByName(String name) {
        return models.pokemon.GrowthRate.getByName(name);
    }

    // get a ItemPocket instance by the id
    public models.items.ItemPocket getItemPocketById(int id) {
        return models.items.ItemPocket.getById(id);
    }

    // get a ItemPocket instance by the name
    public models.items.ItemPocket getItemPocketByName(String name) {
        return models.items.ItemPocket.getByName(name);
    }

    // get a ItemAttribute instance by the id
    public models.items.ItemAttribute getItemAttributeById(int id) {
        return models.items.ItemAttribute.getById(id);
    }

    // get a ItemAttribute instance by the name
    public models.items.ItemAttribute getItemAttributeByName(String name) {
        return models.items.ItemAttribute.getByName(name);
    }

    // get a MoveCategory instance by the id
    public models.moves.MoveCategory getMoveCategoryById(int id) {
        return models.moves.MoveCategory.getById(id);
    }

    // get a MoveCategory instance by the name
    public models.moves.MoveCategory getMoveCategoryByName(String name) {
        return models.moves.MoveCategory.getByName(name);
    }

    // get a EncounterCondition instance by the id
    public models.encounters.EncounterCondition getEncounterConditionById(int id) {
        return models.encounters.EncounterCondition.getById(id);
    }

    // get a EncounterCondition instance by the name
    public models.encounters.EncounterCondition getEncounterConditionByName(String name) {
        return models.encounters.EncounterCondition.getByName(name);
    }

    // get a ContestEffect instance by the id
    public models.contests.ContestEffect getContestEffectById(int id) {
        return models.contests.ContestEffect.getById(id);
    }

    // get a LocationArea instance by the id
    public models.locations.LocationArea getLocationAreaById(int id) {
        return models.locations.LocationArea.getById(id);
    }

    // get a Machine instance by the id
    public models.machines.Machine getMachineById(int id) {
        return models.machines.Machine.getById(id);
    }

    // get a Stat instance by the id
    public models.pokemon.Stat getStatById(int id) {
        return models.pokemon.Stat.getById(id);
    }

    // get a Stat instance by the name
    public models.pokemon.Stat getStatByName(String name) {
        return models.pokemon.Stat.getByName(name);
    }

    // get a MoveLearnMethod instance by the id
    public models.moves.MoveLearnMethod getMoveLearnMethodById(int id) {
        return models.moves.MoveLearnMethod.getById(id);
    }

    // get a MoveLearnMethod instance by the name
    public models.moves.MoveLearnMethod getMoveLearnMethodByName(String name) {
        return models.moves.MoveLearnMethod.getByName(name);
    }

    // get a PokemonHabitat instance by the id
    public models.pokemon.PokemonHabitat getPokemonHabitatById(int id) {
        return models.pokemon.PokemonHabitat.getById(id);
    }

    // get a PokemonHabitat instance by the name
    public models.pokemon.PokemonHabitat getPokemonHabitatByName(String name) {
        return models.pokemon.PokemonHabitat.getByName(name);
    }

    // get a Nature instance by the id
    public models.pokemon.Nature getNatureById(int id) {
        return models.pokemon.Nature.getById(id);
    }

    // get a Nature instance by the name
    public models.pokemon.Nature getNatureByName(String name) {
        return models.pokemon.Nature.getByName(name);
    }

    // get a PalParkArea instance by the id
    public models.locations.PalParkArea getPalParkAreaById(int id) {
        return models.locations.PalParkArea.getById(id);
    }

    // get a PalParkArea instance by the name
    public models.locations.PalParkArea getPalParkAreaByName(String name) {
        return models.locations.PalParkArea.getByName(name);
    }

    // get a EncounterConditionValue instance by the id
    public models.encounters.EncounterConditionValue getEncounterConditionValueById(int id) {
        return models.encounters.EncounterConditionValue.getById(id);
    }

    // get a EncounterConditionValue instance by the name
    public models.encounters.EncounterConditionValue getEncounterConditionValueByName(String name) {
        return models.encounters.EncounterConditionValue.getByName(name);
    }

    // get a Type instance by the id
    public models.pokemon.Type getTypeById(int id) {
        return models.pokemon.Type.getById(id);
    }

    // get a Type instance by the name
    public models.pokemon.Type getTypeByName(String name) {
        return models.pokemon.Type.getByName(name);
    }

    // get a PokemonForm instance by the id
    public models.pokemon.PokemonForm getPokemonFormById(int id) {
        return models.pokemon.PokemonForm.getById(id);
    }

    // get a PokemonForm instance by the name
    public models.pokemon.PokemonForm getPokemonFormByName(String name) {
        return models.pokemon.PokemonForm.getByName(name);
    }

    // get a ContestType instance by the id
    public models.contests.ContestType getContestTypeById(int id) {
        return models.contests.ContestType.getById(id);
    }

    // get a ContestType instance by the name
    public models.contests.ContestType getContestTypeByName(String name) {
        return models.contests.ContestType.getByName(name);
    }

    // get a EvolutionTrigger instance by the id
    public models.evolution.EvolutionTrigger getEvolutionTriggerById(int id) {
        return models.evolution.EvolutionTrigger.getById(id);
    }

    // get a EvolutionTrigger instance by the name
    public models.evolution.EvolutionTrigger getEvolutionTriggerByName(String name) {
        return models.evolution.EvolutionTrigger.getByName(name);
    }

    // get a MoveBattleStyle instance by the id
    public models.moves.MoveBattleStyle getMoveBattleStyleById(int id) {
        return models.moves.MoveBattleStyle.getById(id);
    }

    // get a MoveBattleStyle instance by the name
    public models.moves.MoveBattleStyle getMoveBattleStyleByName(String name) {
        return models.moves.MoveBattleStyle.getByName(name);
    }

    // get a Version instance by the id
    public models.games.Version getVersionById(int id) {
        return models.games.Version.getById(id);
    }

    // get a Version instance by the name
    public models.games.Version getVersionByName(String name) {
        return models.games.Version.getByName(name);
    }

    // get a NamedAPIResourceList instance by the endpoint
    public models.resource.NamedAPIResourceList getNamedAPIResourceListByEndpoint(String endpoint) {
        return models.resource.NamedAPIResourceList.getByEndpoint(endpoint);
    }

    // get a Ability instance by the id
    public models.pokemon.Ability getAbilityById(int id) {
        return models.pokemon.Ability.getById(id);
    }

    // get a Ability instance by the name
    public models.pokemon.Ability getAbilityByName(String name) {
        return models.pokemon.Ability.getByName(name);
    }

    // get a MoveTarget instance by the id
    public models.moves.MoveTarget getMoveTargetById(int id) {
        return models.moves.MoveTarget.getById(id);
    }

    // get a MoveTarget instance by the name
    public models.moves.MoveTarget getMoveTargetByName(String name) {
        return models.moves.MoveTarget.getByName(name);
    }

    // get a APIResourceList instance by the endpoint
    public models.resource.APIResourceList getAPIResourceListByEndpoint(String endpoint) {
        return models.resource.APIResourceList.getByEndpoint(endpoint);
    }

    // get a Characteristic instance by the id
    public models.pokemon.Characteristic getCharacteristicById(int id) {
        return models.pokemon.Characteristic.getById(id);
    }

    // get a EggGroup instance by the id
    public models.pokemon.EggGroup getEggGroupById(int id) {
        return models.pokemon.EggGroup.getById(id);
    }

    // get a EggGroup instance by the name
    public models.pokemon.EggGroup getEggGroupByName(String name) {
        return models.pokemon.EggGroup.getByName(name);
    }

    // get a Region instance by the id
    public models.locations.Region getRegionById(int id) {
        return models.locations.Region.getById(id);
    }

    // get a Region instance by the name
    public models.locations.Region getRegionByName(String name) {
        return models.locations.Region.getByName(name);
    }

    // get a MoveAilment instance by the id
    public models.moves.MoveAilment getMoveAilmentById(int id) {
        return models.moves.MoveAilment.getById(id);
    }

    // get a MoveAilment instance by the name
    public models.moves.MoveAilment getMoveAilmentByName(String name) {
        return models.moves.MoveAilment.getByName(name);
    }

    // get a PokemonSpecies instance by the id
    public models.pokemon.PokemonSpecies getPokemonSpeciesById(int id) {
        return models.pokemon.PokemonSpecies.getById(id);
    }

    // get a PokemonSpecies instance by the name
    public models.pokemon.PokemonSpecies getPokemonSpeciesByName(String name) {
        return models.pokemon.PokemonSpecies.getByName(name);
    }

    // get a Pokedex instance by the id
    public models.games.Pokedex getPokedexById(int id) {
        return models.games.Pokedex.getById(id);
    }

    // get a Pokedex instance by the name
    public models.games.Pokedex getPokedexByName(String name) {
        return models.games.Pokedex.getByName(name);
    }

    // get a Language instance by the id
    public models.utility.Language getLanguageById(int id) {
        return models.utility.Language.getById(id);
    }

    // get a Language instance by the name
    public models.utility.Language getLanguageByName(String name) {
        return models.utility.Language.getByName(name);
    }

    // get a BerryFirmness instance by the id
    public models.berries.BerryFirmness getBerryFirmnessById(int id) {
        return models.berries.BerryFirmness.getById(id);
    }

    // get a BerryFirmness instance by the name
    public models.berries.BerryFirmness getBerryFirmnessByName(String name) {
        return models.berries.BerryFirmness.getByName(name);
    }

    // get a Move instance by the id
    public models.moves.Move getMoveById(int id) {
        return models.moves.Move.getById(id);
    }

    // get a Move instance by the name
    public models.moves.Move getMoveByName(String name) {
        return models.moves.Move.getByName(name);
    }

    // get a Pokemon instance by the id
    public models.pokemon.Pokemon getPokemonById(int id) {
        return models.pokemon.Pokemon.getById(id);
    }

    // get a Pokemon instance by the name
    public models.pokemon.Pokemon getPokemonByName(String name) {
        return models.pokemon.Pokemon.getByName(name);
    }

    // get a PokemonColor instance by the id
    public models.pokemon.PokemonColor getPokemonColorById(int id) {
        return models.pokemon.PokemonColor.getById(id);
    }

    // get a PokemonColor instance by the name
    public models.pokemon.PokemonColor getPokemonColorByName(String name) {
        return models.pokemon.PokemonColor.getByName(name);
    }

    // get a SuperContestEffect instance by the id
    public models.contests.SuperContestEffect getSuperContestEffectById(int id) {
        return models.contests.SuperContestEffect.getById(id);
    }

    // get a VersionGroup instance by the id
    public models.games.VersionGroup getVersionGroupById(int id) {
        return models.games.VersionGroup.getById(id);
    }

    // get a VersionGroup instance by the name
    public models.games.VersionGroup getVersionGroupByName(String name) {
        return models.games.VersionGroup.getByName(name);
    }

    // get a Location instance by the id
    public models.locations.Location getLocationById(int id) {
        return models.locations.Location.getById(id);
    }

}
