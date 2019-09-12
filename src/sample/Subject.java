package sample;

import java.io.Serializable;

public class Subject implements Serializable {

    private String sub = "";
    private int classes;
    private int attended;
    private String st;

    public Subject(String str){
        this.sub = str;
        classes = 0;
        attended = 0;
        st = "";
    }

    public void setClasses(int cls) {
        this.classes = cls;
        updateSt();
    }

    public void updateSt() {
        float a = attended;
        float b = classes;
        if((a/b)<0.75){
            int s = 3*classes-4*attended;
            st = ""+s;
        }
        else if((a/b)==0.75){
            float s = ((3*b)/4)-a+(30/4);
            st = Math.ceil(s)+"/10";
        }
        else{
            float s = ((4*a)/3)-b;
            st = "-"+Math.ceil(s);
        }
    }

    public void setAttended(int attend) {
        if(attended < classes) {
            this.attended = attend;
            updateSt();
        }
    }

    public int getAttended() {
        return attended;
    }

    public int getClasses() {
        return classes;
    }

    public String getSub() {
        return sub;
    }

    public String getSt() {
        return st;
    }
}
