# PokéApi V2 Java Wrapper <img heigth=50 width=50 src="https://cdn.bulbagarden.net/upload/thumb/3/36/350Milotic.png/250px-350Milotic.png">
The most robust [PokéApi](https://www.pokeapi.co/) client. Written in Java with caching 🤖 and love 😍.

## Examples
A simple example to get information on beautiful milotic

```java
Pokemon milotic = Client.getPokemonByName("milotic");
```

Any client call can be converted to a call to the direct object, for example

```java
// using client to call methods
Pokemon milotic = Client.getPokemonByName("milotic");

// using the Pokemon class directly
Pokemon milotic = Pokemon.getByName("milotic");
```

All method calls return the referenced object, allowing the chaining of method calls

```java
Pokemon milotic = Pokemon.getByName("milotic");
System.out.println(milotic.getSpecies().getColor().setId(2).getId());
```

## Cache

To speed up calls to online resources a local sqlite database is created to cache the responses. If a local copy of the API responses is not wanted, the feature can be disabled

```java
Client.CACHE = false;
// ... etc ...
```
**Cache can be set (or unset) even when using direct objects, and not the Client class**

## API List Limitations
All list methods (getXlist) return **NamedAPIResourceList** or a **APIResourceList** 
instances by design. They do not return the information of each element in 
the list, just the name and the url. To overcome this you can fetch the 
API for each object.
```java
NamedAPIResourceList list = Client.getMoveCategoryList(10, 0);
for (NamedAPIResource nar:list.getResults()) {
    // get the oject information from API
    MoveCategory mc = MoveCategory.getByName(nar.getName());
    
    // getMoves() returns an ArrayList the api does not return the complete 
    // information per object, but does set the url. The get will use this
    // url and fetch its information
    for(Move move: mc.getMoves()) {
        System.out.println(move.get());
    }
}
```

## Client methods
Below are all possible Client methods

```java
getAPIResourceListByEndpoint(String endpoint);
getNamedAPIResourceListByEndpoint(String endpoint);
getBerryById(int id);
getBerryByName(String name);
getBerryList(int limit, int offset);
getBerryFirmnessById(int id);
getBerryFirmnessByName(String name);
getBerryFirmnessList(int limit, int offset);
getBerryFlavorById(int id);
getBerryFlavorByName(String name);
getBerryFlavorList(int limit, int offset);
getContestTypeById(int id);
getContestTypeByName(String name);
getContestTypeList(int limit, int offset);
getContestEffectById(int id);
getContestEffectList(int limit, int offset);
getSuperContestEffectById(int id);
getSuperContestEffectList(int limit, int offset);
getEncounterMethodById(int id);
getEncounterMethodByName(String name);
getEncounterMethodList(int limit, int offset);
getEncounterConditionById(int id);
getEncounterConditionByName(String name);
getEncounterConditionList(int limit, int offset);
getEncounterConditionValueById(int id);
getEncounterConditionValueByName(String name);
getEncounterConditionValueList(int limit, int offset);
getEvolutionChainById(int id);
getEvolutionChainList(int limit, int offset);
getEvolutionTriggerById(int id);
getEvolutionTriggerByName(String name);
getEvolutionTriggerList(int limit, int offset);
getGenerationById(int id);
getGenerationByName(String name);
getGenerationList(int limit, int offset);
getPokedexById(int id);
getPokedexByName(String name);
getPokedexList(int limit, int offset);
getVersionById(int id);
getVersionByName(String name);
getVersionList(int limit, int offset);
getVersionGroupById(int id);
getVersionGroupByName(String name);
getVersionGroupList(int limit, int offset);
getItemById(int id);
getItemByName(String name);
getItemList(int limit, int offset);
getItemAttributeById(int id);
getItemAttributeByName(String name);
getItemAttributeList(int limit, int offset);
getItemCategoryById(int id);
getItemCategoryByName(String name);
getItemCategoryList(int limit, int offset);
getItemFlingEffectById(int id);
getItemFlingEffectByName(String name);
getItemFlingEffectList(int limit, int offset);
getItemPocketById(int id);
getItemPocketByName(String name);
getItemPocketList(int limit, int offset);
getLocationById(int id);
getLocationByName(String name);
getLocationList(int limit, int offset);
getLocationAreaById(int id);
getLocationAreaByName(String name);
getLocationAreaList(int limit, int offset);
getPalParkAreaById(int id);
getPalParkAreaByName(String name);
getPalParkAreaList(int limit, int offset);
getRegionById(int id);
getRegionByName(String name);
getRegionList(int limit, int offset);
getMachineById(int id);
getMachineList(int limit, int offset);
getMoveById(int id);
getMoveByName(String name);
getMoveList(int limit, int offset);
getMoveAilmentById(int id);
getMoveAilmentByName(String name);
getMoveAilmentList(int limit, int offset);
getMoveBattleStyleById(int id);
getMoveBattleStyleByName(String name);
getMoveBattleStyleList(int limit, int offset);
getMoveDamageClassById(int id);
getMoveDamageClassByName(String name);
getMoveDamageClassList(int limit, int offset);
getMoveLearnMethodById(int id);
getMoveLearnMethodByName(String name);
getMoveLearnMethodList(int limit, int offset);
getMoveTargetById(int id);
getMoveTargetByName(String name);
getMoveTargetList(int limit, int offset);
getAbilityById(int id);
getAbilityByName(String name);
getAbilityList(int limit, int offset);
getCharacteristicById(int id);
getCharacteristicList(int limit, int offset);
getEggGroupById(int id);
getEggGroupByName(String name);
getEggGroupList(int limit, int offset);
getGenderById(int id);
getGenderByName(String name);
getGenderList(int limit, int offset);
getGrowthRateById(int id);
getGrowthRateByName(String name);
getGrowthRateList(int limit, int offset);
getNatureById(int id);
getNatureByName(String name);
getNatureList(int limit, int offset);
getPokeathlonStatById(int id);
getPokeathlonStatByName(String name);
getPokeathlonStatList(int limit, int offset);
getPokemonById(int id);
getPokemonByName(String name);
getPokemonList(int limit, int offset);
getPokemonColorById(int id);
getPokemonColorByName(String name);
getPokemonColorList(int limit, int offset);
getPokemonFormById(int id);
getPokemonFormByName(String name);
getPokemonFormList(int limit, int offset);
getPokemonHabitatById(int id);
getPokemonHabitatByName(String name);
getPokemonHabitatList(int limit, int offset);
getPokemonShapeById(int id);
getPokemonShapeByName(String name);
getPokemonShapeList(int limit, int offset);
getPokemonSpeciesById(int id);
getPokemonSpeciesByName(String name);
getPokemonSpeciesList(int limit, int offset);
getStatById(int id);
getStatByName(String name);
getStatList(int limit, int offset);
getTypeById(int id);
getTypeByName(String name);
getTypeList(int limit, int offset);
getLanguageById(int id);
getLanguageByName(String name);
getLanguageList(int limit, int offset);
getMoveCategoryById(int id);
getMoveCategoryByName(String name);
getMoveCategoryList(int limit, int offset);
```

This project gets the information directly from the documentation. 
If there is a documentation update, or you encounter a bug/error please
contact me by email or open an issue.

[Documentation here](https://pokeapi.co/docsv2/).
