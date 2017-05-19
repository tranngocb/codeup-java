package java2;

/**
 * Created by bichtran on 5/18/17.
 */
public class Movie {
    private String name;
    private String category;

//Contructor for Movie

public Movie(String name, String category) {
    this.name = name;
    this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}