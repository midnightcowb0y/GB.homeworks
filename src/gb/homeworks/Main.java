package gb.homeworks;



public class Main {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Employee("Rudolf","Driver","rudy@rudy.com",2128506, 75000, 20);
        persArray[2] = new Employee("Jamie","Cleaner","clean@tut.by",112, 55000, 42);
        persArray[3] = new Employee("Natasha","Barlady","natali@pechali.ru",48484030,949949, 18);
        persArray[4] = new Employee("Snezhanna","Barwoman","snezhka@mail.ru",2061204,35000,44);


        for(int i =0; i< persArray.length; i++)
        {
            if (persArray[i].age > 40)
            {
               String info = persArray[i].getInfo();
                System.out.println(info);
            }
        }
        }




}

