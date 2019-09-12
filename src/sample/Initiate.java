package sample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Initiate {

    public static void main(String []args){
        try{
            FileOutputStream fs = new FileOutputStream("subjects.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            ArrayList<Subject> sub = new ArrayList<Subject>();
            sub.add(new Subject("ID"));
            sub.add(new Subject("EIM"));
            sub.add(new Subject("EIMLAB"));
            sub.add(new Subject("LCS"));
            sub.add(new Subject("LCSLAB"));
            sub.add(new Subject("II"));
            sub.add(new Subject("IILAB"));
            sub.add(new Subject("CT"));
            sub.add(new Subject("COOS"));
            os.writeObject(sub);
            os.close();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

}
