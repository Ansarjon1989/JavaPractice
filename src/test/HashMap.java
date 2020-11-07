package test;

public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("Brazil", "Brazil");
        capitalCities.put("USA", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println("key :" + i + " " + "Value :" + capitalCities.get(i));
        }


    }
}
