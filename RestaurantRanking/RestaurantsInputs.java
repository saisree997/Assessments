package com.planon.RestaurantRanking;

import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantsInputs {

	 public static Restaurant[] getRestaurants()
	    {
	       
	        Restaurant Paradise = new Restaurant("Paradise");
	        Restaurant Bawarchi = new Restaurant("Bawarchi");
	        Restaurant Ohri = new Restaurant("Ohri");        
	        Restaurant Angara = new Restaurant("Angara");
	       
	        Paradise.setFeedback("This is the good place for biryani");
	        Ohri.setFeedback("Nice for vegetable lovers");
	        Bawarchi.setFeedback("Best place for awesome biryani and good kababs");        
	        Angara.setFeedback("Not what I expected");
	        Ohri.setFeedback("Just okay");
	        Paradise.setFeedback("Nice to have mutton biryani");
	       
	        Restaurant[] Restaurants = {Bawarchi, Paradise, Ohri, Angara};
	   
	        return Restaurants;
	    }

}
