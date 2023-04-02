package homeWork4;

import java.util.Objects;

public class Pet extends Family {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[]{};



    public void eat(){
        System.out.println("Я кушаю!");
    }
    public void respond(){

        System.out.println("Привет, хозяин. Я - " + nickname + ". Я соскучился!");
    }
    public void foul(){
        System.out.println("Нужно хорошо замести следы...");
    }
    private Pet(String nickname, String species){
        this.nickname = nickname;
        this.species = species;
    }
    protected Pet(String nickname, String species, int age, int trickLevel, String[] habits) {
        this(nickname,species);
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    private Pet(){

    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getSpecies() {

        return species;
    }

    public void setSpecies(String species) {

        this.species = species;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getTrickLevel(){

        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {

        this.trickLevel = trickLevel;
    }

    public String[] getHabits(){

        return habits;
    }

    public void setHabits(String[] habits) {

        this.habits = habits;
    }

    @Override
    public String toString() {
        return "species = " + species +
                ", nickname = " + nickname +
                ", age = " + age +
                ", trickLevel = " + trickLevel +
                ", habits = " + habits;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pet pet = (Pet) obj;
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }
    @Override
    protected void finalize () {
        System.out.println("Удаление обьекта - " + this);
    }
}
