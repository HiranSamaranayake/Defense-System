/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainControlPanel;

import Weapons.HelicopterInterface;
import Weapons.SubmarineInterface;
import Weapons.TankInterface;
import obs.controlPanel;
import obs.observer;

/**
 *
 * @author hiran
 */
public class Starter {
    public static void main(String[] args) {
        
        MainControlPanel mainwindow=new MainControlPanel();
        
        
        HelicopterInterface helicopter= new HelicopterInterface();
        SubmarineInterface submarine = new SubmarineInterface();
        TankInterface tank = new TankInterface();
         
        subject Subject = new subject();
        Subject.addObserver(helicopter);
        Subject.addObserver(submarine);
        Subject.addObserver(tank);
        
        subject2 sub=new subject2();
        sub.addObserver(mainwindow);
        
      mainwindow.setsubject(Subject);
      tank.setsubject1(sub);
      helicopter.setsubject2(sub);
      submarine.setsubject3(sub);
        
      
    }
}
