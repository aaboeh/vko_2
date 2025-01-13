package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        
        Car car = new Car(brand, model, speed);

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");
            System.out.println("Valitse toiminto: ");

            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        car.carStatus();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        String newBrand = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        String newModel = sc.nextLine();
                        car.setBrand(newBrand);
                        car.setModel(newModel);
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        String accString = sc.nextLine();
                        int acceleration = Integer.parseInt(accString);
                        if (acceleration > 0) {
                            car.accelerate(acceleration);
                        } else {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        }
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        String decString = sc.nextLine();
                        int deceleration = Integer.parseInt(decString);
                        if (deceleration > 0) {
                            car.decelerate(deceleration);
                        } else {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä. Yritä uudelleen.");
                }
            }
        } 
        sc.close();
        
    }
}
