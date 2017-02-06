package person;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Girl {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String hairColor;
    private static int numberOfGirls;

    public Girl(String name, int age, int height, int weight, String hairColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;

        numberOfGirls++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public static int getNumberOfGirls() {
        return numberOfGirls;
    }
}
