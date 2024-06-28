package HashTable;

import LinkedList.LinkedList;

public class HashTable2 {
    private LinkedList[] table;
    private int size = 1000003;
    private int functionOption;//value to replace later (number primo de 7 digitos no mayor a una potencia 2)


    public HashTable2(int functionOption){
        this.functionOption = functionOption;
        this.table = new LinkedList[this.size];
        for (int i=0; i<this.size; i++){
            this.table[i]= new LinkedList();
        }
    }

    //function for convert strings to Ascii
    public int convertToAscii(String key){ //key is equals to text
        int sum = 0;

        for (int i = 0; i<key.length(); i++){
            char character = key.charAt(i);
            int valueAscci = (int) character;
            sum += valueAscci;
        }
        return sum;
    }

    //TODO hashTables methods for division and multiplication :D


    private int methodMultiplication (int value){
        final double A = (Math.sqrt(5)-1)/2;
        double hasheo = (this.size*(value*A % 1));
        return (int) hasheo;
    }

    public void add(String key, Object data){
        int keyToInt = this.convertToAscii(key);

        if (keyToInt >= 0) {
            int hasheo = methodMultiplication(keyToInt);
            this.table[hasheo].push(data);
        }
        else {
            System.out.println("Hubo un error al agregar");
        }

    }

    public void search(String key){
        int keyToInt = this.convertToAscii(key);

        if (keyToInt >= 0) {
            int hasheo = methodMultiplication(keyToInt);
            for (int i = 0; i < this.table[hasheo].size(); i++) {
                System.out.println(this.table[hasheo].getElementAt(i));
            }
        }
        else {
            System.out.println("Hubo un error al agregar");
        }

    }

}
