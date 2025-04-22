import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Hola mundo

        System.out.println("Hola Mundo!");

        String myString = "Es una cadena de texto";
        myString = "Cambio el valor de la cadena de texto";
        System.out.println(myString);

        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 4);

        Double myDouble = 7.5;
        System.out.println(myDouble);

        Float myFloat = 6.5f;
        System.out.println(myFloat);
        System.out.println(myDouble + myFloat);
        System.out.println(myDouble + myFloat.doubleValue()); // vuelve el float a double
        System.out.println(myDouble + " " + myFloat + " " + myInt + " " + myString);
        System.out.println(myDouble + myInt + myFloat + myString);


        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        myFloat = null;
        System.out.println(myFloat);

        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10);
        } else {
            System.out.println("My float es null");
        }

        if (myInt == 11) {
            System.out.println("myInt == 11");
        } else if (myInt == 12) {
            System.out.println("myInt == 12");
        } else {
            System.out.println("myInt no es ni 11 ni 12");
        }

        List<String> myList = new ArrayList();// trabajamos solo Strings
        myList.add(myString);
        myList.add(myInt.toString());// se coloca el entero como String
        System.out.println(myList);

        Map<String, String> myMap = new HashMap();// acuerdate es de string de tipo string
        myMap.put("String", myString);
        myMap.put("int", myInt.toString());// lo volvemos string
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

        Main myMain = new Main();
        //myMain.myFunction(2,5);
        System.out.println(myMain.myFunction(3,1234));
    }

    //public void myFunction(int myFistNumber, int mySecondNumber) {// void lo cambio por int
        //System.out.println(myFistNumber + mySecondNumber);

    public int myFunction(int myFistNumber, int mySecondNumber) {
        return myFistNumber + mySecondNumber;
    }
}