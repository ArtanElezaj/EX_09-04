package nyc.c4q.nesada;

/**
 * Created by Nesada on 9/4/2016.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int idNumber;
    private String favoriteFood;

    public Student(){

    }


    //=======set and get for ======firstName==========
    String getFirstN (String fName){
        fName = firstName;
        return fName;
    }

    String setFirstN (String fName){
        firstName = fName;
        return firstName;
    }
    //=======set and get for ======lastName==========
    String getLastN (String LName){
        LName = lastName;
        return LName;
    }

    String setLastN (String LName){
        lastName = LName;
        return lastName;
    }
    //=======set and get for ======idNumber==========
    int getidN (int idN){
        idN = idNumber;
        return idN;
    }

    int setidN (int idN){
        idNumber = idN;
        return idNumber;
    }
    //=======set and get for ======favoriteFood==========
    String getFavFood (String FavFood){
        FavFood = favoriteFood;
        return FavFood;
    }

    String setFavFood (String FavFood){
        favoriteFood = FavFood;
        return favoriteFood;
    }
    //============checkSameFavoriteFood method that accepts as input two students' food=============
    static boolean checkSameFavoriteFood (String s1, String s2){

        return s1.equals(s2);
    }


}
