package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Helper {

    public static boolean inflateSub(){
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("subjects.ser"));
            Main.subs = (ArrayList<Subject>)is.readObject();
            System.out.println("Initiated the subjects...");
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.print(ex.getMessage());
            return false;
        }
    }

    public static boolean deflateSub(){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("subjects.ser"));
            os.writeObject(Main.subs);
            os.close();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();;
            System.out.println(ex.getMessage());
            return false;
        }
    }


}
