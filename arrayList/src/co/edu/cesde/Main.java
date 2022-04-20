package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DbShop dbShop=new DbShop();
        Scanner scanner=new Scanner(System.in);
        boolean flagClose=false;
        while (flagClose==false){
            System.out.println("Ingrese la opcion deseada");
            int option= Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    Monitor monitor = new Monitor();
                    System.out.println("Ingrese nombre del producto");
                    monitor.setName(scanner.nextLine());
                    System.out.println("Ingrese marca");
                    monitor.setBrand(scanner.nextLine());
                    System.out.println("Ingrese una referencia");
                    monitor.setId(scanner.nextLine());
                    dbShop.setMonitor(monitor);
                    break;
                case 2:
                    Cpu cpu = new Cpu();
                    System.out.println("Ingrese nombre del producto");
                    cpu.setName(scanner.nextLine());
                    System.out.println("Ingrese marca");
                    cpu.setBrand(scanner.nextLine());
                    System.out.println("Ingrese una referencia");
                    cpu.setId(scanner.nextLine());
                    dbShop.setCpu(cpu);
                    break;
                case 4:
                    for (Monitor monitor1:dbShop.getMonitors()){
                        System.out.println(monitor1.getName());
                    }
                    break;
                case 10:
                    flagClose=true;
                    break;
            }
        }
    }

}
