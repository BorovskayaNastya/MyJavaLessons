package homeWork4;

public class Human extends Family {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = {};
    Family family;
    public void greetPet(){

        System.out.println("Привет, " + pet.getNickname());
    }
    public void describePet(){
        System.out.println("У меня есть " + pet.getSpecies() +" , ему " + pet.getAge() + " лет, он " + pet.getTrickLevel());
    }
    public void addChild(Human[] child){
    };
    public void deleteChild(Human[] child){}
    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, int year, Human mother, Human father){
        this (name, surname, year);
        this.mother = mother;
        this.father = father;
    }
    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet, String[][] schedule){
        this (name, surname, year, mother,father);
        this.pet = pet;
        this.iq = iq;
        this.schedule = schedule;
    }
    private Human(){

    }
    public String getName(){

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear(){

        return year;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq(){

        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule(){

        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Pet getPet() {

        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother(){

        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather(){

        return father;
    }

    public void setFather(Human father) {

        this.father = father;
    }
    public String toString(){
        return "name = " + name +
                ", surname = " + surname +
                ", year= " + year +
                ", iq = " + iq +
                ", schedule =" + schedule;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human human = (Human) obj;
        return this.name.equals(human.getName()) &&
                this.surname.equals(human.getSurname()) &&
                this.iq == human.getIq();
    }

    @Override
    protected void finalize () {
        System.out.println("Удаление обьекта - " + this);
    }
}
