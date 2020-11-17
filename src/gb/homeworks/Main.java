package gb.homeworks;


public class Main {

    public static void main(String[] args)
    {
        Plate plate = new Plate(20);
        Cat[] catsArray = new  Cat[5];
        catsArray[0] = new Cat ("Joseph", 20);
        catsArray[1] = new Cat ("Vladimir", 2);
        catsArray[2] = new Cat ("Franchesca", 14);
        catsArray[3] = new Cat ("Nicola", 17);
        catsArray[4] = new Cat ("Jul", 2);

        for(int i =0; i < catsArray.length; i++)
        {
             catsArray[i].eat(plate);
             catsArray[i].printInfo();
        }
    }
        }









