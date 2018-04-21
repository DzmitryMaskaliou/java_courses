package Clinica;

/**
 * Интерфейс для реализации домашнего питомца
 */
public interface Pet {
    public String getPetType();
    public String getPetName();
    public void setPetName(String name);
    public void makeVoice();

}