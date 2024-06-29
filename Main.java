import Business.Business;
import HashTable.HashTable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        chooseOption();

        /*HashTable prueba = new HashTable();
        prueba.add("alexis", 1);
        prueba.add("alexis", 10);
        prueba.add("limberg", 2);
        prueba.search("alexis");
        prueba.search("limberg");
        */

    }

        public static void chooseOption(){
            Scanner scanner = new Scanner(System.in);

            HashTable division = new HashTable(1);
            //HashTable2 multiplication = new HashTable2(2);

            int option;
            boolean flag = true;

            while (flag){
                System.out.println("Estimado usuario elija una de las siguientes opciones: ");
                System.out.println("#1 Cargar todos los datos por método de división.");
                System.out.println("#2 Cargar todos los datos por método de multiplicación.");
                System.out.println("#3 Obtener los datos por método de división.");
                System.out.println("#4 Obtener los datos por método de multiplicación.");
                System.out.println("#5 Salir de programa \n");
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        readDataSet(division);
                        System.out.println("¡Éxito! El tiempo de espera de método de división en procesar los datos fue de: ");
                        break;
                    case 2:
                        //time = readDataSet(multiplication);
                        System.out.println("¡Éxito! El tiempo de espera método de multiplicación en procesar los datos fue de: ");
                        break;
                    case 3:
                        getElementAt(division);
                        System.out.println("¡Éxito! El tiempo de espera de búsqueda en división fue de: ");
                        break;
                    case 4:
                        //time = getElementAt(multiplication);
                        System.out.println("¡Éxito! El tiempo de espera de búsqueda en multiplicación fue de: ");
                        break;

                    case 5:
                        System.out.println("Hasta Luego, usuario :)");
                        flag = false;
                        break;
                    default:
                        System.out.println("Número inválido. Intente de nuevo");
                        break;

                }

            }

        }

        public static double readDataSet(HashTable ht){
            String line = "";
            String splitBy = ",";
            int id=1;
            try
            {
                BufferedReader br = new BufferedReader(new FileReader("/Users/limberg/Documents/Tercer_Cuatrimestre/Estructura_de_datos_avanzada/233348_TablasHashC2/src/dataSet/bussines.csv"));
                long setTime = System.nanoTime();
                while ((line = br.readLine()) != null)   //returns a Boolean value
                {
                    String[] bussines = line.split(splitBy);    // use comma as separator
                    //System.out.println("["+id+"] Bussines [ID=" + bussines[0] + ", Name=" + bussines[1] + ", Address=" + bussines[2] + ", City=" + bussines[3] + ", State= " + bussines[4] +"]");
                    Business business = new Business(bussines[0], bussines[1],  bussines[2], bussines[3],  bussines[4]);
                    ht.add(bussines[0],business); //clave valor
                    id++;
                }
                long finalTime = System.nanoTime();
                long durationTime = setTime - finalTime;
                double seconds = durationTime / 1_000_000;
                return seconds;//convert to seconds

            }
            catch (IOException e)
            {
                e.printStackTrace();
                return 0;
            }
        }

        public static double getElementAt(HashTable ht){
            Scanner scanner = new Scanner(System.in);
            String key;
            System.out.println("Proporcione el id, por favor: ");
            key = scanner.nextLine();

            long setTime = System.nanoTime();
            Business business = ht.search(key);
            if (business == null){
                System.out.println("No encontrado :(");
            }
            else {
                System.out.println("Data object found: " + "\n" + "Id: "+ business.getId() +  "\n" + "Name: " + business.getName() +  "\n" +"Address: " + business.getAdress() +  "\n" +"City: " + business.getCity() +  "\n" +"State: " + business.getState());
            }
            long finalTime = System.nanoTime();
            long durationTime = setTime - finalTime;
            double seconds = durationTime / 1_000_000_000;
            return seconds;

        }



    /*public static double readDataSet2(HashTable ht){
        String line = "";
        String splitBy = ",";
        int id=1;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("/Users/limberg/Documents/Tercer_Cuatrimestre/Estructura_de_datos_avanzada/233348_TablasHashC2/src/dataSet/bussines.csv"));
            long setTime = System.nanoTime();
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] bussines = line.split(splitBy);    // use comma as separator
                //System.out.println("["+id+"] Bussines [ID=" + bussines[0] + ", Name=" + bussines[1] + ", Address=" + bussines[2] + ", City=" + bussines[3] + ", State= " + bussines[4] +"]");
                ht.add(bussines[0],bussines[1]);
                id++;
            }
            long finalTime = System.nanoTime();
            long durationTime = setTime - finalTime;
            double seconds = durationTime / 1_000_000_000;
            return seconds;//convert to seconds

        }
        catch (IOException e)
        {
            e.printStackTrace();
            return 0;
        }
    }*/

    /*public static double getElementAt2(HashTable2 ht){
        Scanner scanner = new Scanner(System.in);
        String key;
        System.out.println("Proporcione el id, por favor: ");
        key = scanner.nextLine();

        long setTime = System.nanoTime();
        ht.search(key);
        long finalTime = System.nanoTime();
        long durationTime = setTime - finalTime;
        double seconds = durationTime / 1_000_000_000;
        return seconds;

    }*/







    }
