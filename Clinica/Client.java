package  Clinica;

/**
 * класс Клиент
 */
public class Client{
    //static int counter;
    //int id=counter++;
    private String name;
    private Pet pet;

    public Client(String name, Pet pet){
        this.name = name;
        this.pet = pet;
    }
    /**
     *
     * @return возвращает идентификационный номер
     */
    //public int id(){
     //   return id;
    //}

    /**
     *
     * @param name Новове имя клиента
     */
    public  void changeName(String name) {
        this.name = name;
    }

    /**
     *
     * @param petName Новое имя питомца
     */
    public  void renamePet(String petName) {
        this.pet.setPetName(petName);
    }

    /**
     *
     * @return Имя клиента
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return питомец
     */
    public Pet getPet(){
        return this.pet;
    }
}