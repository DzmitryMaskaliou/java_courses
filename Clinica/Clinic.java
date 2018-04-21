package Clinica;

import java.util.ArrayList;

/**
 * класс клиники
 * @author DzmitryMaskaliou
 * @since 21.04.2018
 */
public class Clinic{
    ArrayList<Client> clients;

    public Clinic(){
        clients = new ArrayList<Client>();

        // Уже умеющиеся клиенты
        clients.add(new Client("Jonn",new Cat("Murka")));
        clients.add(new Client("Peter",new Dog("Sharik")));
        clients.add(new Client("Mary",new Cat("Lucy")));
        clients.add(new Client("Ivan",new Dog("Rex")));

        System.out.println("Welcame to our Clinic!");
    }

    public void Show(){
        if (clients.size() == 0)
            System.out.println("List is empty");
        else {
            for(Client cl: clients) {
                System.out.println(cl.getName()+", "+cl.getPet().getPetType()+
                ": "+cl.getPet().getPetName());
            }
            }
    }
    /**
     *
     * @param name Проверяемое имя
     * @return true если проверяемого имени в списке нет
     */
    private  boolean nameIsCorrect(String name){
        boolean isCorrect = true;
        for(Client cl: clients) {
            if (cl.getName().equals(name)) {
                isCorrect = false;
            }
        }
        return isCorrect;
    }

    /**
     *
     * @param petType тип животного
     * @return true если тип живтного корректный
     */
    private  boolean petTypeIsCorrect(String petType){
        boolean isCorrect = true;
        if(petType.equals("Cat")||petType.equals("Dog"))
            isCorrect = true;
        else{
            isCorrect = false;
            System.out.println("We don't work with such type of animal");
        }
        return  isCorrect;
    }
    /**
     * Метод добавляет нового клиента в список.
     * @param name Имя клиента
     * @param petType Тип питомца
     * @param petName Имя питомца
     */
    public void addNewClient (String name, String petType, String petName){
        if (!nameIsCorrect(name))
            System.out.println("A client with such name already is present.");
        boolean isCorrect = nameIsCorrect(name)&&petTypeIsCorrect(petType);
        if(isCorrect){
            if (petType.equals("Cat"))
                clients.add(new Client(name,new Cat(petName)));
            else
                clients.add(new Client(name,new Dog(petName)));
            System.out.println("A new client was added.");


        }
    }

    public void deleteClient(String name){
        Client client = null;
        if (nameIsCorrect(name))
            System.out.println("Such client is absent in the List");
        else {
            for (Client cl : clients) {
                if (name.equals(cl.getName()))
                    client = cl;
            }
            clients.remove(client);
            System.out.println("The client: " + name + " was deleted.");
        }
    }

    /**
     *
     * @param name Старое имя клиента
     * @param newname Новое имя клиента
     */
    public void renameClient(String name,String newname){
        if (nameIsCorrect(name))
            System.out.println("Such client is absent in the List.");
        else {
            for (Client cl: clients)
                if (name.equals(cl.getName()))
                    cl.changeName(newname);
            System.out.println("The client was renamed.");
        }
    }

    /**
     * Выводит информацию о клиенте
     * @param name Имя клиента
     */
    public  void findClient(String name){
        if (nameIsCorrect(name))
            System.out.println("Such client is absent in the List.");
        else {
            for (Client cl : clients)
                if (name.equals(cl.getName()))
                    System.out.println(cl.getName() + ", " + cl.getPet().getPetType() +
                            ": " + cl.getPet().getPetName());
        }
    }

}