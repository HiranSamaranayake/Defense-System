/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainControlPanel;

import java.util.ArrayList;
import obs.observer;

/**
 *
 * @author hiran
 */
public class subject {
    private ArrayList<observer> list = new ArrayList<>();
           
    public void addObserver(observer ob){
        list.add(ob);
    }
    
     public void removeObserver(observer ob){
        list.remove(ob);
    }
    public void sendall(boolean select){
         for (int i = 0; i < list.size(); i++) {
             list.get(i).updateArea(select);
         }
    }
    public void sendmsg(String msg){
         for (int i = 0; i < list.size(); i++) {
             list.get(i).SendMsg(msg);
         }      
    }
    public void buttonOn(int value){
         for (int i = 0; i < list.size(); i++) {
             list.get(i).buttonOn(value);
         }      
    }
}


