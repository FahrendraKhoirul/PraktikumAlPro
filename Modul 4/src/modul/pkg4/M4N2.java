package modul.pkg4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class M4N2 {
    public static void main(String[]Args){
    
    
    HashMap<String, Integer> Nilai = new HashMap<>();
    Nilai.put("Andi", 70);
    Nilai.put("Budi", 65);
    Nilai.put("Caca", 90);
    Nilai.put("Deni", 75);
     
    Entry<String, Integer> min = Collections.min(Nilai.entrySet(), Comparator.comparing(Entry::getValue));
    Entry<String, Integer> max = Collections.max(Nilai.entrySet(), Comparator.comparing(Entry::getValue));
    
    Nilai.entrySet().forEach((map) -> {
        int i = map.getValue();
        if (i >= 36 && i <= 45) {
            System.out.println(map.getKey()+ " " + map.getValue() + " " + "Grade = D");
        } else if (i >= 46 && i <= 55) {
            System.out.println(map.getKey()+ " " + map.getValue()+ " " + "Grade = C");
        } else if (i >= 56 && i <= 65) {
            System.out.println(map.getKey()+ " " + map.getValue()+ " " + "Grade = C+");
        } else if (i >= 66 && i <= 75) {
            System.out.println(map.getKey()+ " " + map.getValue()+ " " + "Grade = B");
        } else if (i >= 76 && i <= 85) {
            System.out.println(map.getKey()+ " " + map.getValue()+ " " + "Grade = B+");
        } else if (i >= 86 && i <= 100) {
            System.out.println(map.getKey()+ " " + map.getValue()+ " " + "Grade = A");
        } else {System.out.println("invalid");
        }
        });
    
    System.out.println("Nilai terbesar adalah " + max.getValue());
    System.out.println("Nilai terkecil adalah " + min.getValue());
}}
