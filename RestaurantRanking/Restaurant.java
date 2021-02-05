package com.planon.RestaurantRanking;

import java.util.ArrayList;

public class Restaurant
    {
        String name = "";
        int frequency = 0;
        ArrayList<String> feedback;
       
//        public Restaurant()
//        {
//            this.name = "";
//            this.feedback = new ArrayList<String>();
//            this.frequency = 0;
//        }

        public Restaurant(String name)
        {
            this.name = name;
            this.feedback = new ArrayList<String>();
            this.frequency = 0;
        }
   
        public String getFeedback()
        {
            String str = "";
            for(int i = 0 ; i < feedback.size() ; i++)
            {
                str = str + " " + feedback.get(i);
            }
            return str;
        }
         
        public void setFeedback(String fb)
        {
            feedback.add(fb);
        }
   
        public int getFrequency()
        {
            return frequency;
        }
   
        public void setFrequency(int frequency)
        {
            this.frequency = frequency;
        }
   
        public String getName()
        {
            return name;
        }
       
        public void setName(String name)
        {
            this.name = name;
        }        
       
    }
