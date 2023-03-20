package Modul2;

import java.util.ArrayList;

public class Latihan {

    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        System.out.print("Hewan : ");
        System.out.println(Hewan);
        System.out.println("");
        
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        
        ArrayList<String> DeletedData = new ArrayList<>();
        
        for(String Warna : DeleteHewan){
            Hewan.removeIf(h -> h.equals(Warna));
            DeletedData.add(Warna);
        }
        
        System.out.println("Hewan yang dihapus : ");
        System.out.println(DeletedData);
        System.out.println("");
        
        System.out.println("Output Hewan : ");
        System.out.println(Hewan);
        
    }
    
}
