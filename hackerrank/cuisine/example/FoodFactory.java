package com.hackerrank.cuisine.example;



public class FoodFactory {
	 private static final FoodFactory instance = new FoodFactory();

	    static FoodFactory getFactory() {
	        return instance;
	    }
	    


 java.util.Map<String, Cuisine> cuisines =  new java.util.HashMap<String, Cuisine>();


 void registerCuisine(String cuisineKey, Cuisine cuisine){
     cuisines.put(cuisineKey, cuisine.serveFood(cuisineKey));
 }

 public Cuisine serveCuisine(String cuisineKey, String dish) throws UnservableCuisineRequestException {
     if(!cuisines.containsKey(cuisineKey)){
         throw new UnservableCuisineRequestException("Unservable cuisine " + cuisineKey + "for dish "+ dish);
     }
     else
         return cuisines.get(cuisineKey).serveFood(dish);
 }

}
