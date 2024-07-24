/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainControlPanel;

import java.util.ArrayList;
import obs.controlPanel;

/**
 *
 * @author hiran
 */
public class subject2 {
    
    private ArrayList<controlPanel> list1 = new ArrayList<>();
    
     public void addObserver(controlPanel ob1){
        list1.add(ob1);
    }
     public void removeObserver(controlPanel ob1){
        list1.remove(ob1);
    }
      
    public void sendMsgToController(String msg){
        list1.get(0).GetMsgT(msg);
        
    }
       public void sendMsgToController1(String msg){
        list1.get(0).GetMsgs(msg);
        
    }
        public void sendMsgToController2(String msg){
        list1.get(0).GetMsgH(msg);
        
    }
        public void sendOxigenLevelToController(int Value){
        list1.get(0).GetOxigen(Value);
        
    }
     public void sendEnergyLevelToController(int Value){
        list1.get(0).GetEnergy(Value);
        
    }
}
