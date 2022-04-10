package doraemon;
//1 menulis script import
//2 buat object
//3 nama object.add/remove/size/get(id)
//4 sout untuk menampilkan

import java.util.ArrayList;//class
public class Doraemon {

    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();
        
        kantongAjaib.add("Pintu ke masa depan");
        kantongAjaib.add(532);
        kantongAjaib.add("alumni");
        kantongAjaib.add(20567.325  );
        kantongAjaib.add(true);
        kantongAjaib.remove("alumni");
        kantongAjaib.set(0, "Pintu ke masa lalu");
       
        
        System.out.println(kantongAjaib);
        System.out.println(kantongAjaib.size());
        System.out.println(kantongAjaib.get(0));

    }
    
}
