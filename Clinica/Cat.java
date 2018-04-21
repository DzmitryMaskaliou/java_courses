package Clinica;
public class Cat implements Pet {
    private String name;
    private static final String petType = "Cat";

    public Cat(String name){
        this.name = name;
    }
    public  String getPetType(){
        return petType;
    }

    public void setPetName(String name){
        this.name = name;
    }
    public  String getPetName(){
        return this.name;
    }

    public void makeVoice() {
        System.out.println("mau-mau");
    }
}