package br.com.fergulha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WrapperExample {

    public static void main(String[] args) {
        /**
         * Um exemplo comum de utilização de classes Wrapper é quanto precisamos encapsular
         * o valor de um tipo primitivo. Após o Java 1.5 é menos comum encontrarmos
         * códigos como o exemplo abaixo, pois o Java realiza o Autoboxing (conversão)
         * automaticamente
         */

        // Exemplo Boolean/boolean
        boolean b = true;
        List<Boolean> booleanList = new LinkedList<>();
        booleanList.add(new Boolean(b));
        booleanList.forEach(v -> System.out.println("Resultado boolean: " + v));

        // Exemplo Byte/byte
        byte b1 = 1;
        Set<Byte> byteSet = new HashSet<>();
        byteSet.add(b1);
        byteSet.forEach(v -> System.out.println("Resultado byte: " + v));

        // Exemplo Character/char
        char c = 'c';
        Set<Character> characterSet = new HashSet<>();
        characterSet.add(new Character(c));
        characterSet.forEach(v -> System.out.println("Resultado character: " + v));

        // Exemplo Integer/int
        int i = 5;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(new Integer(i));
        integerList.forEach(v -> System.out.println("Resultado integer: " + v));

        // Exemplo Float/float
        float f = 2.3f;
        Collection<Float> floatCollection = new ArrayList<>();
        floatCollection.add(new Float(f));
        floatCollection.forEach(v -> System.out.println("Resultado float: " + v));

        // Exemplo Double/double
        double d = 23.34;
        Collection<Double> doubleCollection = new ArrayList<>();
        doubleCollection.add(new Double(d));
        doubleCollection.forEach(v -> System.out.println("Resultado double: " + v));

        // Exemplo Long/long
        long l = 23L;
        List<Long> longList = new ArrayList<>();
        longList.add(new Long(l));
        longList.forEach(v -> System.out.println("Resultado long: " + v));

        // Exemplo Short/short
        short s = 12;
        Set<Short> shortSet = new HashSet<>();
        shortSet.add(new Short(s));
        shortSet.forEach(v -> System.out.println("Resultado short: " + v));
    }
}
