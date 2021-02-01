package  com.planon.assignment2;
import java.util.*;
public class RestaurantRankImp
{
    public static Restaurant[] findFrequency(Restaurant[] Restaurants)
    {
        String keys[] = {"good","nice","best","awesome","great"};
        for(int i = 0 ; i < Restaurants.length ; i++)
        {
            int freq = 0;
            //for each restaurant we need to find out the frequency
            String feedback = Restaurants[i].getFeedback();
            System.out.println("Feedback for " + Restaurants[i].getName() + " = " + feedback);
            String[] Feedback = feedback.split(" ");
           
            //Identifying frequency using nested for loop.
            for(int j=0 ; j < Feedback.length ; j++)
            {
                for(int k = 0 ; k < keys.length ; k++)
                {
                    if(Feedback[j].toLowerCase().equals(keys[k]))
                    {
                        System.out.println("Feedback value = " + keys[k]);
                        freq++;
                        System.out.println("Freq = " + freq);
                        break;
                    }
                }
            }
           
            //Setting the frequency to the Restaurant.
            System.out.println("frequency setting to " + Restaurants[i].getName() + " = " + freq);
            Restaurants[i].setFrequency(freq);
        }
        return Restaurants;
    }
   
    public static Restaurant[] sortRestaurants(Restaurant[] Restaurants)
    {
        int totalRestaurants = Restaurants.length;
        for(int i = 0 ; i < totalRestaurants ; i++)
        {
            for(int j = 0 ; j < totalRestaurants ; j++)
            {
                if(Restaurants[i].getFrequency() > Restaurants[j].getFrequency())
                {
                    Restaurant temp1 = Restaurants[i];
                    Restaurant temp2 = Restaurants[j];
                    Restaurants[i] = temp2;
                    Restaurants[j] = temp1;
                }
            }
        }
        return Restaurants;
    }
   
    public static void printRanks(Restaurant[] Restaurants)
    {
        for(int i = 0 ; i < Restaurants.length ; i++)
        {
            System.out.println(Restaurants[i].getName() + (i+1));
        }
    }
   
    public static void main(String[] args)
    {
        //creating the list of Restaurants
       Restaurant[] Restaurants =  RestaurantsInputs.getRestaurants();
   
        //finding the frequency based on the feedback
        Restaurants = findFrequency(Restaurants);
   
        //Sorting the objects based on the frequency
        Restaurants = sortRestaurants(Restaurants);
   
        //printing the ranks after sort is finished
        printRanks(Restaurants);
    }
}