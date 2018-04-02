import berries.Berry;
import com.google.gson.Gson;

public class Test {


    public static void main(String[] args){
        String json = "{\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"cheri\",\n" +
                "    \"growth_time\": 3,\n" +
                "    \"max_harvest\": 5,\n" +
                "    \"natural_gift_power\": 60,\n" +
                "    \"size\": 20,\n" +
                "    \"smoothness\": 25,\n" +
                "    \"soil_dryness\": 15,\n" +
                "    \"firmness\": {\n" +
                "        \"name\": \"soft\",\n" +
                "        \"url\": \"http://pokeapi.co/api/v2/berry-firmness/2/\"\n" +
                "    },\n" +
                "    \"flavors\": [{\n" +
                "        \"potency\": 10,\n" +
                "        \"flavor\": {\n" +
                "            \"name\": \"spicy\",\n" +
                "            \"url\": \"http://pokeapi.co/api/v2/berry-flavor/1/\"\n" +
                "        }\n" +
                "    }],\n" +
                "    \"item\": {\n" +
                "        \"name\": \"cheri-berry\",\n" +
                "        \"url\": \"http://pokeapi.co/api/v2/item/126/\"\n" +
                "    },\n" +
                "    \"natural_gift_type\": {\n" +
                "        \"name\": \"fire\",\n" +
                "        \"url\": \"http://pokeapi.co/api/v2/type/10/\"\n" +
                "    }\n" +
                "}";

        Gson gson = new Gson();

        Berry berry = gson.fromJson(json, Berry.class);

        System.out.println(berry.getFlavors().get(0).getPotency());
    }
}
