package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person ) {

        if (person.getcity().equals("Manchester")){
            return true;
        }
        return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.getage() >= ageLimit){
            return true;
        }
        return false;
    }
    
    
}

