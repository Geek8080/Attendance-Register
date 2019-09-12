package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class HomeController {

    @FXML
    public Label ID;

    @FXML
    public Label IDstatus;

    @FXML
    public Label II;

    @FXML
    public Label IIstatus;

    @FXML
    public Label EIM;

    @FXML
    public Label EIMstatus;

    @FXML
    public Label COOS;

    @FXML
    public Label COOSstatus;

    @FXML
    public Label CT;

    @FXML
    public Label CTstatus;

    @FXML
    public Label LCS;

    @FXML
    public Label LCSstatus;

    @FXML
    public Label EIMLAB;

    @FXML
    public Label EIMLABstatus;

    @FXML
    public Label IILAB;

    @FXML
    public Label IILABstatus;

    @FXML
    public Label LCSLAB;

    @FXML
    public Label LCSLABstatus;

    @FXML
    public JFXTextField IDst;

    @FXML
    public JFXTextField IIst;

    @FXML
    public JFXTextField IILABst;

    @FXML
    public JFXTextField EIMst;

    @FXML
    public JFXTextField EIMLABst;

    @FXML
    public JFXTextField LCSst;

    @FXML
    public JFXTextField LCSLABst;

    @FXML
    public JFXTextField CTst;

    @FXML
    public JFXTextField COOSst;

    @FXML
    public Text date;




    public void IIadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("II")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                IIstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                IIst.setText(sub.getSt());
                break;
            }
        }
    }

    public void IIatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("II")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                IIstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                IIst.setText(sub.getSt());
                break;
            }
        }
    }

    public void IDadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().trim().equals("ID")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                IDstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                IDst.setText(sub.getSt());
                break;
            }
        }
    }

    public void IDatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().trim().equals("ID")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                IDstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                IDst.setText(sub.getSt());
                break;
            }
        }
    }



    public void IILABadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("IILAB")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                IILABstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                IILABst.setText(sub.getSt());
                break;
            }
        }
    }

    public void IILABatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("IILAB")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                IILABstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                IILABst.setText(sub.getSt());
                break;
            }
        }
    }

    public void LCSadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("LCS")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                LCSstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                LCSst.setText(sub.getSt());
                break;
            }
        }
    }

    public void LCSatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("LCS")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                LCSstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                LCSst.setText(sub.getSt());
                break;
            }
        }
    }

    public void LCSLABadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("LCSLAB")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                LCSLABstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                LCSLABst.setText(sub.getSt());
                break;
            }
        }
    }

    public void LCSLABatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("LCSLAB")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                LCSLABstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                LCSLABst.setText(sub.getSt());
                break;
            }
        }
    }

    public void EIMadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("EIM")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                EIMstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                EIMst.setText(sub.getSt());
                break;
            }
        }
    }

    public void EIMatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++) {
            sub = Main.subs.get(i);
            if (sub.getSub().trim().equals("EIM")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                EIMstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                EIMst.setText(sub.getSt());
                break;
            }
        }
    }

    public void EIMLABadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("EIMLAB")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                EIMLABstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                EIMLABst.setText(sub.getSt());
                break;
            }
        }
    }

    public void EIMLABatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("EIMLAB")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                EIMLABstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                EIMLABst.setText(sub.getSt());
                break;
            }
        }
    }

    public void CTadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("CT")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                CTstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                CTst.setText(sub.getSt());
                break;
            }
        }
    }

    public void CTatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("CT")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                CTstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                CTst.setText(sub.getSt());
                break;
            }
        }
    }

    public void COOSadd(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("COOS")) {
                p = sub.getClasses();
                sub.setClasses(++p);
                Main.subs.add(i, sub);
                COOSstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                COOSst.setText(sub.getSt());
                break;
            }
        }
    }

    public void COOSatt(MouseEvent evt){
        Subject sub;
        int p = 0;
        for(int i = 0;i<Main.subs.size();i++){
            sub = Main.subs.get(i);
            if(sub.getSub().equals("COOS")) {
                p = sub.getAttended();
                sub.setAttended(++p);
                Main.subs.add(i, sub);
                COOSstatus.setText(sub.getAttended() + "/" + sub.getClasses());
                COOSst.setText(sub.getSt());
                break;
            }
        }
    }

    public void save(MouseEvent evt){
        Helper.deflateSub();
        AlertMaker.showTrayMessage("Attendance","Saved data...");
    }

    public void reset(){
        Helper.inflateSub();
        initialize();
    }

    public void initialize(){
        String name = "";
        DateFormat df = new SimpleDateFormat("E, MMM dd");
        java.util.Date today = java.util.Calendar.getInstance().getTime();
        String dt = df.format(today);
        date.setText(dt);
        for(Subject sub: Main.subs){
            name = sub.getSub();
            switch(name){
                case "ID":IDstatus.setText(sub.getAttended()+"/" + sub.getClasses());
                    IDst.setText(sub.getSt());
                    break;
                case "EIM":EIMstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    EIMst.setText(sub.getSt());
                    break;
                case "EIMLAB":EIMLABstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    EIMLABst.setText(sub.getSt());
                    break;
                case "LCS":LCSstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    LCSst.setText(sub.getSt());
                    break;
                case "LCSLAB":LCSLABstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    LCSLABst.setText(sub.getSt());
                    break;
                case "II":IIstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    IIst.setText(sub.getSt());
                    break;
                case "IILAB":IILABstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    IILABst.setText(sub.getSt());
                    break;
                case "CT":CTstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    CTst.setText(sub.getSt());
                    break;
                case "COOS":COOSstatus.setText(sub.getAttended()+"/"+sub.getClasses());
                    COOSst.setText(sub.getSt());
                    break;
            }
        }
    }


}
