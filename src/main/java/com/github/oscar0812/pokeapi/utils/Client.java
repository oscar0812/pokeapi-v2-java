// heart of wrapper, contains all possible api calls
package com.github.oscar0812.pokeapi.utils;

import com.github.oscar0812.pokeapi.models.berries.Berry;
import com.github.oscar0812.pokeapi.models.berries.BerryFirmness;
import com.github.oscar0812.pokeapi.models.berries.BerryFlavor;
import com.github.oscar0812.pokeapi.models.contests.ContestEffect;
import com.github.oscar0812.pokeapi.models.contests.ContestType;
import com.github.oscar0812.pokeapi.models.contests.SuperContestEffect;
import com.github.oscar0812.pokeapi.models.encounters.EncounterCondition;
import com.github.oscar0812.pokeapi.models.encounters.EncounterConditionValue;
import com.github.oscar0812.pokeapi.models.encounters.EncounterMethod;
import com.github.oscar0812.pokeapi.models.evolution.EvolutionChain;
import com.github.oscar0812.pokeapi.models.evolution.EvolutionTrigger;
import com.github.oscar0812.pokeapi.models.games.Generation;
import com.github.oscar0812.pokeapi.models.games.Pokedex;
import com.github.oscar0812.pokeapi.models.games.Version;
import com.github.oscar0812.pokeapi.models.games.VersionGroup;
import com.github.oscar0812.pokeapi.models.items.*;
import com.github.oscar0812.pokeapi.models.locations.Location;
import com.github.oscar0812.pokeapi.models.locations.LocationArea;
import com.github.oscar0812.pokeapi.models.locations.PalParkArea;
import com.github.oscar0812.pokeapi.models.locations.Region;
import com.github.oscar0812.pokeapi.models.machines.Machine;
import com.github.oscar0812.pokeapi.models.moves.*;
import com.github.oscar0812.pokeapi.models.pokemon.*;
import com.github.oscar0812.pokeapi.models.resources.NamedAPIResourceList;
import com.github.oscar0812.pokeapi.models.utility.Language;

public class Client {
	// if true, save api response to local database for speed and api call limit help
	public static boolean CACHE = true;

	public static NamedAPIResourceList getNamedAPIResourceListByEndpoint(String endpoint) {
		return NamedAPIResourceList.getByEndpoint(endpoint);
	}

	public static Berry getBerryById(int id) {
		return Berry.getById(id);
	}

	public static Berry getBerryByName(String name) {
		return Berry.getByName(name);
	}

	public static NamedAPIResourceList getBerryList(int limit, int offset) {
		 return NamedAPIResourceList.getList("berry", limit, offset);
	}

	public static BerryFirmness getBerryFirmnessById(int id) {
		return BerryFirmness.getById(id);
	}

	public static BerryFirmness getBerryFirmnessByName(String name) {
		return BerryFirmness.getByName(name);
	}

	public static NamedAPIResourceList getBerryFirmnessList(int limit, int offset) {
		 return NamedAPIResourceList.getList("berry-firmness", limit, offset);
	}

	public static BerryFlavor getBerryFlavorById(int id) {
		return BerryFlavor.getById(id);
	}

	public static BerryFlavor getBerryFlavorByName(String name) {
		return BerryFlavor.getByName(name);
	}

	public static NamedAPIResourceList getBerryFlavorList(int limit, int offset) {
		 return NamedAPIResourceList.getList("berry-flavor", limit, offset);
	}

	public static ContestType getContestTypeById(int id) {
		return ContestType.getById(id);
	}

	public static ContestType getContestTypeByName(String name) {
		return ContestType.getByName(name);
	}

	public static NamedAPIResourceList getContestTypeList(int limit, int offset) {
		 return NamedAPIResourceList.getList("contest-type", limit, offset);
	}

	public static ContestEffect getContestEffectById(int id) {
		return ContestEffect.getById(id);
	}

	public static NamedAPIResourceList getContestEffectList(int limit, int offset) {
		 return NamedAPIResourceList.getList("contest-effect", limit, offset);
	}

	public static SuperContestEffect getSuperContestEffectById(int id) {
		return SuperContestEffect.getById(id);
	}

	public static NamedAPIResourceList getSuperContestEffectList(int limit, int offset) {
		 return NamedAPIResourceList.getList("super-contest-effect", limit, offset);
	}

	public static EncounterMethod getEncounterMethodById(int id) {
		return EncounterMethod.getById(id);
	}

	public static EncounterMethod getEncounterMethodByName(String name) {
		return EncounterMethod.getByName(name);
	}

	public static NamedAPIResourceList getEncounterMethodList(int limit, int offset) {
		 return NamedAPIResourceList.getList("encounter-method", limit, offset);
	}

	public static EncounterCondition getEncounterConditionById(int id) {
		return EncounterCondition.getById(id);
	}

	public static EncounterCondition getEncounterConditionByName(String name) {
		return EncounterCondition.getByName(name);
	}

	public static NamedAPIResourceList getEncounterConditionList(int limit, int offset) {
		 return NamedAPIResourceList.getList("encounter-condition", limit, offset);
	}

	public static EncounterConditionValue getEncounterConditionValueById(int id) {
		return EncounterConditionValue.getById(id);
	}

	public static EncounterConditionValue getEncounterConditionValueByName(String name) {
		return EncounterConditionValue.getByName(name);
	}

	public static NamedAPIResourceList getEncounterConditionValueList(int limit, int offset) {
		 return NamedAPIResourceList.getList("encounter-condition-value", limit, offset);
	}

	public static EvolutionChain getEvolutionChainById(int id) {
		return EvolutionChain.getById(id);
	}

	public static NamedAPIResourceList getEvolutionChainList(int limit, int offset) {
		 return NamedAPIResourceList.getList("evolution-chain", limit, offset);
	}

	public static EvolutionTrigger getEvolutionTriggerById(int id) {
		return EvolutionTrigger.getById(id);
	}

	public static EvolutionTrigger getEvolutionTriggerByName(String name) {
		return EvolutionTrigger.getByName(name);
	}

	public static NamedAPIResourceList getEvolutionTriggerList(int limit, int offset) {
		 return NamedAPIResourceList.getList("evolution-trigger", limit, offset);
	}

	public static Generation getGenerationById(int id) {
		return Generation.getById(id);
	}

	public static Generation getGenerationByName(String name) {
		return Generation.getByName(name);
	}

	public static NamedAPIResourceList getGenerationList(int limit, int offset) {
		 return NamedAPIResourceList.getList("generation", limit, offset);
	}

	public static Pokedex getPokedexById(int id) {
		return Pokedex.getById(id);
	}

	public static Pokedex getPokedexByName(String name) {
		return Pokedex.getByName(name);
	}

	public static NamedAPIResourceList getPokedexList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokedex", limit, offset);
	}

	public static Version getVersionById(int id) {
		return Version.getById(id);
	}

	public static Version getVersionByName(String name) {
		return Version.getByName(name);
	}

	public static NamedAPIResourceList getVersionList(int limit, int offset) {
		 return NamedAPIResourceList.getList("version", limit, offset);
	}

	public static VersionGroup getVersionGroupById(int id) {
		return VersionGroup.getById(id);
	}

	public static VersionGroup getVersionGroupByName(String name) {
		return VersionGroup.getByName(name);
	}

	public static NamedAPIResourceList getVersionGroupList(int limit, int offset) {
		 return NamedAPIResourceList.getList("version-group", limit, offset);
	}

	public static Item getItemById(int id) {
		return Item.getById(id);
	}

	public static Item getItemByName(String name) {
		return Item.getByName(name);
	}

	public static NamedAPIResourceList getItemList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item", limit, offset);
	}

	public static ItemAttribute getItemAttributeById(int id) {
		return ItemAttribute.getById(id);
	}

	public static ItemAttribute getItemAttributeByName(String name) {
		return ItemAttribute.getByName(name);
	}

	public static NamedAPIResourceList getItemAttributeList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-attribute", limit, offset);
	}

	public static ItemCategory getItemCategoryById(int id) {
		return ItemCategory.getById(id);
	}

	public static ItemCategory getItemCategoryByName(String name) {
		return ItemCategory.getByName(name);
	}

	public static NamedAPIResourceList getItemCategoryList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-category", limit, offset);
	}

	public static ItemFlingEffect getItemFlingEffectById(int id) {
		return ItemFlingEffect.getById(id);
	}

	public static ItemFlingEffect getItemFlingEffectByName(String name) {
		return ItemFlingEffect.getByName(name);
	}

	public static NamedAPIResourceList getItemFlingEffectList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-fling-effect", limit, offset);
	}

	public static ItemPocket getItemPocketById(int id) {
		return ItemPocket.getById(id);
	}

	public static ItemPocket getItemPocketByName(String name) {
		return ItemPocket.getByName(name);
	}

	public static NamedAPIResourceList getItemPocketList(int limit, int offset) {
		 return NamedAPIResourceList.getList("item-pocket", limit, offset);
	}

	public static Location getLocationById(int id) {
		return Location.getById(id);
	}

	public static Location getLocationByName(String name) {
		return Location.getByName(name);
	}

	public static NamedAPIResourceList getLocationList(int limit, int offset) {
		 return NamedAPIResourceList.getList("location", limit, offset);
	}

	public static LocationArea getLocationAreaById(int id) {
		return LocationArea.getById(id);
	}

	public static LocationArea getLocationAreaByName(String name) {
		return LocationArea.getByName(name);
	}

	public static NamedAPIResourceList getLocationAreaList(int limit, int offset) {
		 return NamedAPIResourceList.getList("location-area", limit, offset);
	}

	public static PalParkArea getPalParkAreaById(int id) {
		return PalParkArea.getById(id);
	}

	public static PalParkArea getPalParkAreaByName(String name) {
		return PalParkArea.getByName(name);
	}

	public static NamedAPIResourceList getPalParkAreaList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pal-park-area", limit, offset);
	}

	public static Region getRegionById(int id) {
		return Region.getById(id);
	}

	public static Region getRegionByName(String name) {
		return Region.getByName(name);
	}

	public static NamedAPIResourceList getRegionList(int limit, int offset) {
		 return NamedAPIResourceList.getList("region", limit, offset);
	}

	public static Machine getMachineById(int id) {
		return Machine.getById(id);
	}

	public static NamedAPIResourceList getMachineList(int limit, int offset) {
		 return NamedAPIResourceList.getList("machine", limit, offset);
	}

	public static Move getMoveById(int id) {
		return Move.getById(id);
	}

	public static Move getMoveByName(String name) {
		return Move.getByName(name);
	}

	public static NamedAPIResourceList getMoveList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move", limit, offset);
	}

	public static MoveAilment getMoveAilmentById(int id) {
		return MoveAilment.getById(id);
	}

	public static MoveAilment getMoveAilmentByName(String name) {
		return MoveAilment.getByName(name);
	}

	public static NamedAPIResourceList getMoveAilmentList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-ailment", limit, offset);
	}

	public static MoveBattleStyle getMoveBattleStyleById(int id) {
		return MoveBattleStyle.getById(id);
	}

	public static MoveBattleStyle getMoveBattleStyleByName(String name) {
		return MoveBattleStyle.getByName(name);
	}

	public static NamedAPIResourceList getMoveBattleStyleList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-battle-style", limit, offset);
	}

	public static MoveDamageClass getMoveDamageClassById(int id) {
		return MoveDamageClass.getById(id);
	}

	public static MoveDamageClass getMoveDamageClassByName(String name) {
		return MoveDamageClass.getByName(name);
	}

	public static NamedAPIResourceList getMoveDamageClassList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-damage-class", limit, offset);
	}

	public static MoveLearnMethod getMoveLearnMethodById(int id) {
		return MoveLearnMethod.getById(id);
	}

	public static MoveLearnMethod getMoveLearnMethodByName(String name) {
		return MoveLearnMethod.getByName(name);
	}

	public static NamedAPIResourceList getMoveLearnMethodList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-learn-method", limit, offset);
	}

	public static MoveTarget getMoveTargetById(int id) {
		return MoveTarget.getById(id);
	}

	public static MoveTarget getMoveTargetByName(String name) {
		return MoveTarget.getByName(name);
	}

	public static NamedAPIResourceList getMoveTargetList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-target", limit, offset);
	}

	public static Ability getAbilityById(int id) {
		return Ability.getById(id);
	}

	public static Ability getAbilityByName(String name) {
		return Ability.getByName(name);
	}

	public static NamedAPIResourceList getAbilityList(int limit, int offset) {
		 return NamedAPIResourceList.getList("ability", limit, offset);
	}

	public static Characteristic getCharacteristicById(int id) {
		return Characteristic.getById(id);
	}

	public static NamedAPIResourceList getCharacteristicList(int limit, int offset) {
		 return NamedAPIResourceList.getList("characteristic", limit, offset);
	}

	public static EggGroup getEggGroupById(int id) {
		return EggGroup.getById(id);
	}

	public static EggGroup getEggGroupByName(String name) {
		return EggGroup.getByName(name);
	}

	public static NamedAPIResourceList getEggGroupList(int limit, int offset) {
		 return NamedAPIResourceList.getList("egg-group", limit, offset);
	}

	public static Gender getGenderById(int id) {
		return Gender.getById(id);
	}

	public static Gender getGenderByName(String name) {
		return Gender.getByName(name);
	}

	public static NamedAPIResourceList getGenderList(int limit, int offset) {
		 return NamedAPIResourceList.getList("gender", limit, offset);
	}

	public static GrowthRate getGrowthRateById(int id) {
		return GrowthRate.getById(id);
	}

	public static GrowthRate getGrowthRateByName(String name) {
		return GrowthRate.getByName(name);
	}

	public static NamedAPIResourceList getGrowthRateList(int limit, int offset) {
		 return NamedAPIResourceList.getList("growth-rate", limit, offset);
	}

	public static Nature getNatureById(int id) {
		return Nature.getById(id);
	}

	public static Nature getNatureByName(String name) {
		return Nature.getByName(name);
	}

	public static NamedAPIResourceList getNatureList(int limit, int offset) {
		 return NamedAPIResourceList.getList("nature", limit, offset);
	}

	public static PokeathlonStat getPokeathlonStatById(int id) {
		return PokeathlonStat.getById(id);
	}

	public static PokeathlonStat getPokeathlonStatByName(String name) {
		return PokeathlonStat.getByName(name);
	}

	public static NamedAPIResourceList getPokeathlonStatList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokeathlon-stat", limit, offset);
	}

	public static Pokemon getPokemonById(int id) {
		return Pokemon.getById(id);
	}

	public static Pokemon getPokemonByName(String name) {
		return Pokemon.getByName(name);
	}

	public static NamedAPIResourceList getPokemonList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon", limit, offset);
	}

	public static PokemonColor getPokemonColorById(int id) {
		return PokemonColor.getById(id);
	}

	public static PokemonColor getPokemonColorByName(String name) {
		return PokemonColor.getByName(name);
	}

	public static NamedAPIResourceList getPokemonColorList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-color", limit, offset);
	}

	public static PokemonForm getPokemonFormById(int id) {
		return PokemonForm.getById(id);
	}

	public static PokemonForm getPokemonFormByName(String name) {
		return PokemonForm.getByName(name);
	}

	public static NamedAPIResourceList getPokemonFormList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-form", limit, offset);
	}

	public static PokemonHabitat getPokemonHabitatById(int id) {
		return PokemonHabitat.getById(id);
	}

	public static PokemonHabitat getPokemonHabitatByName(String name) {
		return PokemonHabitat.getByName(name);
	}

	public static NamedAPIResourceList getPokemonHabitatList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-habitat", limit, offset);
	}

	public static PokemonShape getPokemonShapeById(int id) {
		return PokemonShape.getById(id);
	}

	public static PokemonShape getPokemonShapeByName(String name) {
		return PokemonShape.getByName(name);
	}

	public static NamedAPIResourceList getPokemonShapeList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-shape", limit, offset);
	}

	public static PokemonSpecies getPokemonSpeciesById(int id) {
		return PokemonSpecies.getById(id);
	}

	public static PokemonSpecies getPokemonSpeciesByName(String name) {
		return PokemonSpecies.getByName(name);
	}

	public static NamedAPIResourceList getPokemonSpeciesList(int limit, int offset) {
		 return NamedAPIResourceList.getList("pokemon-species", limit, offset);
	}

	public static Stat getStatById(int id) {
		return Stat.getById(id);
	}

	public static Stat getStatByName(String name) {
		return Stat.getByName(name);
	}

	public static NamedAPIResourceList getStatList(int limit, int offset) {
		 return NamedAPIResourceList.getList("stat", limit, offset);
	}

	public static Type getTypeById(int id) {
		return Type.getById(id);
	}

	public static Type getTypeByName(String name) {
		return Type.getByName(name);
	}

	public static NamedAPIResourceList getTypeList(int limit, int offset) {
		 return NamedAPIResourceList.getList("type", limit, offset);
	}

	public static Language getLanguageById(int id) {
		return Language.getById(id);
	}

	public static Language getLanguageByName(String name) {
		return Language.getByName(name);
	}

	public static NamedAPIResourceList getLanguageList(int limit, int offset) {
		 return NamedAPIResourceList.getList("language", limit, offset);
	}

	public static MoveCategory getMoveCategoryById(int id) {
		return MoveCategory.getById(id);
	}

	public static MoveCategory getMoveCategoryByName(String name) {
		return MoveCategory.getByName(name);
	}

	public static NamedAPIResourceList getMoveCategoryList(int limit, int offset) {
		 return NamedAPIResourceList.getList("move-category", limit, offset);
	}
}