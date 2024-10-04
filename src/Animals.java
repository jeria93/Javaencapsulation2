public class Animals {

    private String name;
    private int age;
    private String continent;

    Animals(String name, int age, String continent) {
        this.name = name;
        this.age = age;
        this.continent = continent;

    }

//    Getters


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContinent() {
        return continent;
    }

//    Setters


    public void setAge(int age) {
        this.age = age;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + age + " " + continent;
    }

}
