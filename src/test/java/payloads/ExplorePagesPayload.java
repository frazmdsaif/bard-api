package payloads;

public class ExplorePagesPayload {
    
    public static String build() {
        return "{\n" +
                "  \"page\": {\n" +
                "    \n" +
                "    \"slug\": \"knji\",\n" +
                "    \"name\": \"stfring\",\n" +
                "    \"status\": \"ACTIVE\"\n" +
                "  },\n" +
                "  \"experiments\": [\n" +
                "    {\n" +
                "      \"experiment\": {\n" +
                "        \n" +
                "        \n" +
                "        \"name\": \"stringf\",\n" +
                "        \"selectionType\": \"RANDOM\",\n" +
                "        \"rules\": {\n" +
                "          \"rules\": [\n" +
                "            {\n" +
                "              \"field\": \"stringf\",\n" +
                "              \"operator\": \"stringf\",\n" +
                "              \"value\": \"strinfg\"\n" +
                "              \n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"queryKey\": \"strinfg\",\n" +
                "        \"startAt\": \"2026-02-24T07:15:37.781Z\",\n" +
                "        \"endAt\": \"2027-02-24T07:15:37.781Z\",\n" +
                "        \"status\": \"ACTIVE\"\n" +
                "      },\n" +
                "      \"variants\": [\n" +
                "        {\n" +
                "          \"variant\": {\n" +
                "            \n" +
                "            \n" +
                "            \n" +
                "            \"weightPercentage\": 0.1,\n" +
                "            \"isDefault\": true\n" +
                "          },\n" +
                "          \"devices\": [\n" +
                "            {\n" +
                "              \"device\": {\n" +
                "                \n" +
                "                \n" +
                "                \"deviceType\": \"MOBILE\",\n" +
                "                \"config\": {\n" +
                "                  \"additionalProp1\": \"string\",\n" +
                "                  \"additionalProp2\": \"string\",\n" +
                "                  \"additionalProp3\": \"string\"\n" +
                "                }\n" +
                "              },\n" +
                "              \"sections\": [\n" +
                "                {\n" +
                "                  \n" +
                "                  \n" +
                "                  \"type\": \"HERO\",\n" +
                "                  \"position\": 0,\n" +
                "                  \"config\": {\n" +
                "                    \"title\": \"string\",\n" +
                "                    \"subtitle\": \"string\",\n" +
                "                    \"data\": {\n" +
                "                      \"additionalProp1\": \"string\",\n" +
                "                      \"additionalProp2\": \"string\",\n" +
                "                      \"additionalProp3\": \"string\"\n" +
                "                    },\n" +
                "                    \"styles\": {\n" +
                "                      \"additionalProp1\": \"string\",\n" +
                "                      \"additionalProp2\": \"string\",\n" +
                "                      \"additionalProp3\": \"string\"\n" +
                "                    },\n" +
                "                    \"type\": \"BANNER\",\n" +
                "                    \"imageUrl\": \"string\",\n" +
                "                    \"bannerLink\": \"string\"\n" +
                "                  }\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
    

    public static String buildSimple() {
        return "{\n" +
               "  \"page\": {\n" +
               "    \"slug\": \"simple\",\n" +
               "    \"name\": \"Simple Page\",\n" +
               "    \"status\": \"ACTIVE\"\n" +
               "  }\n" +
               "}";
    }
    

    public static String buildNoExperiments() {
        return "{\n" +
               "  \"page\": {\n" +
               "    \"slug\": \"no-exp\",\n" +
               "    \"name\": \"No Experiments\",\n" +
               "    \"status\": \"ACTIVE\"\n" +
               "  },\n" +
               "  \"experiments\": []\n" +
               "}";
    }

    public static String custom1(){
        return "{\n" +
                "  \"page\": {\n" +
                "    \"slug\": \"hdsfhjs\",\n" +
                "    \"name\": \"stfring\",\n" +
                "    \"experiments\": [\n" +
                "      {\n" +
                "        \"name\": \"stringf\",\n" +
                "        \"status\": \"ACTIVE\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }
}
