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

To speed up calls to online resources a local sqlite database is created to cache the responses. If a local copy of the API responses is not wanted, the feature can be disabled

```java
Client.CACHE = false;
// ... etc ...
```
**Cache can be set (or unset) even when using direct objects, and not the Client class**

All method calls return the referenced object, allowing the chaining of method calls

```java
Pokemon milotic = Pokemon.getByName("milotic");
System.out.println(milotic.getSpecies().getColor().setId(2).getId());
```
## Client methods
Below are all possible Client methods

```java
getAPIResourceListByEndpoint(String endpoint);
getNamedAPIResourceListByEndpoint(String endpoint);
getBerryById(int id);
getBerryByName(String name);
getBerryFirmnessById(int id);
getBerryFirmnessByName(String name);
getBerryFlavorById(int id);
getBerryFlavorByName(String name);
getContestTypeById(int id);
getContestTypeByName(String name);
getContestEffectById(int id);
getSuperContestEffectById(int id);
getEncounterMethodById(int id);
getEncounterMethodByName(String name);
getEncounterConditionById(int id);
getEncounterConditionByName(String name);
getEncounterConditionValueById(int id);
getEncounterConditionValueByName(String name);
getEvolutionChainById(int id);
getEvolutionTriggerById(int id);
getEvolutionTriggerByName(String name);
getGenerationById(int id);
getGenerationByName(String name);
getPokedexById(int id);
getPokedexByName(String name);
getVersionById(int id);
getVersionByName(String name);
getVersionGroupById(int id);
getVersionGroupByName(String name);
getItemById(int id);
getItemByName(String name);
getItemAttributeById(int id);
getItemAttributeByName(String name);
getItemCategoryById(int id);
getItemCategoryByName(String name);
getItemFlingEffectById(int id);
getItemFlingEffectByName(String name);
getItemPocketById(int id);
getItemPocketByName(String name);
getLocationById(int id);
getLocationByName(String name);
getLocationAreaById(int id);
getLocationAreaByName(String name);
getPalParkAreaById(int id);
getPalParkAreaByName(String name);
getRegionById(int id);
getRegionByName(String name);
getMachineById(int id);
getMoveById(int id);
getMoveByName(String name);
getMoveAilmentById(int id);
getMoveAilmentByName(String name);
getMoveBattleStyleById(int id);
getMoveBattleStyleByName(String name);
getMoveDamageClassById(int id);
getMoveDamageClassByName(String name);
getMoveLearnMethodById(int id);
getMoveLearnMethodByName(String name);
getMoveTargetById(int id);
getMoveTargetByName(String name);
getAbilityById(int id);
getAbilityByName(String name);
getCharacteristicById(int id);
getEggGroupById(int id);
getEggGroupByName(String name);
getGenderById(int id);
getGenderByName(String name);
getGrowthRateById(int id);
getGrowthRateByName(String name);
getNatureById(int id);
getNatureByName(String name);
getPokeathlonStatById(int id);
getPokeathlonStatByName(String name);
getPokemonById(int id);
getPokemonByName(String name);
getPokemonColorById(int id);
getPokemonColorByName(String name);
getPokemonFormById(int id);
getPokemonFormByName(String name);
getPokemonHabitatById(int id);
getPokemonHabitatByName(String name);
getPokemonShapeById(int id);
getPokemonShapeByName(String name);
getPokemonSpeciesById(int id);
getPokemonSpeciesByName(String name);
getStatById(int id);
getStatByName(String name);
getTypeById(int id);
getTypeByName(String name);
getLanguageById(int id);
getLanguageByName(String name);
getMoveCategoryById(int id);
getMoveCategoryByName(String name);
```
[Documentation here](https://pokeapi.co/docsv2/).
