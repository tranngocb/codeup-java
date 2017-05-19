package java2;

import java.util.Arrays;

/**
 * Created by bichtran on 5/18/17.
 */
public class MoviesApplication {

    public static void main(String[] args) {
        // Create a Object - Class instance Movie
        Movie[] objectMovies = MoviesArray.findAll(); // Get all the movies to my shop array

//        for (Movie objectMovie: objectMovies){
//            System.out.println(objectMovie.getName());
//        }

//        System.out.println(longueur);
        // Create the menu
        int menuOption;
        Input keyboard = new Input();
        do {

            /* Menu option */
            /** What would you like to do?
             0 - exit
             1 - view all movies
             2 - view movies in the animated category
             3 - view movies in the drama category
             4 - view movies in the horror category
             5 - view movies in the scifi category
             Enter your choice: 1    **/

            System.out.println("What would you like to do?");
            System.out.printf("0- Exit\n1. view all movie \n2. view movies in Animated category \n3. view movies in Drama category \n" +
                    "4. view movies in Horror category \n5. view movies in scifi category\nEnter your choice:   \n6. ");
            menuOption = keyboard.getInt();
            /* Perform Option */
            performOption(menuOption, objectMovies);
            System.out.println("User pick Option: " + menuOption);
        } while (menuOption != 0);

//Test to access that movie


    }

    public static void performOption(int option, Movie[] objectMovies) {

        switch (option) {
            case 0: System.exit(0);
            case 1:
                for (Movie objectMovie : objectMovies) {
                    System.out.println(objectMovie.getName() + " in category: " + objectMovie.getCategory());
                }
                break;

            case 2: {
                System.out.println("In case 2, category ANIMATED.....");
                for (Movie objectMovie : objectMovies) {
                   // System.out.println(objectMovie.getCategory());
                    if (objectMovie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(objectMovie.getName() + " in category: " + objectMovie.getCategory());
                    }

                }
                break;
            }
            case 3: {
                System.out.println("In case 3, category DRAMA .....");
                for (Movie objectMovie : objectMovies) {
                    // System.out.println(objectMovie.getCategory());
                    if (objectMovie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(objectMovie.getName() + " in category: " + objectMovie.getCategory());
                    }
                    //printByCategory(listOfMovies,"horror");
                }
                break;
            }
            case 6: {
                System.out.println("In case 3, category DRAMA .....");
                for (Movie objectMovie : objectMovies) {
                    // System.out.println(objectMovie.getCategory());
                    if (objectMovie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(objectMovie.getName() + " in category: " + objectMovie.getCategory());
                    }
                    //printByCategory(listOfMovies,"horror");
                }
                break;
            }
        }

    }


}
/*
  * public static void printByCategory (Movie[] movie, String category){
  * for(Movie m: movies) {
  * if(m.getCategory().equalsIgnoreCase(category)) {
  * sout(m.getName+-----+"m.getCategory);
  * }
  *
  * case 6:
  * sout("give a name");
  * Input...
  * sout("give me a category
  * Input
  * Movie newMovie = new Movie(name,category);
  * listOfMovies =ArrayCopyOf(listOfMovies, listOfMovies. lenght+1)
   * */