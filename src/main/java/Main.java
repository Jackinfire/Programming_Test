
import Park_Stakeholders.Drone;
import Park_Stakeholders.Keeper;
import Park_Stakeholders.Lion;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Keeper Geoff = new Keeper("Geoff");
        Geoff.setPhoneNum("4392");
        Geoff.setGPSid(80);

        Lion Simba  = new Lion("Simba");
        Simba.setAge(7);
        Simba.setGPSid(30);

        Drone Monitor1 = new Drone("Monitor1");
        Monitor1.setRF(128);
        Monitor1.setGPSid(124);

        // Create a frame and add the drawing canvas to it
        Frame f=new Frame();
        f.setLayout(null);
        f.setSize(600, 600);
        f.setVisible(true);

        Park d=new Park(LocationSystem.getCoords(Simba.getGPSid()), LocationSystem.getCoords(Geoff.getGPSid()), LocationSystem.getCoords(Monitor1.getGPSid()));
        f.add(d);

        try{
            Thread.sleep(1000);
            f.repaint();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        double distance =Math.hypot(LocationSystem.getCoords(Simba.getGPSid()).getX()- LocationSystem.getCoords(Geoff.getGPSid()).getX(), LocationSystem.getCoords(Simba.getGPSid()).getY()- LocationSystem.getCoords(Geoff.getGPSid()).getY());
        if (distance <60){
            AlertSystem.alertAKeeper(Geoff.getPhoneNum());
            AlertSystem.alertADrone(Monitor1.getRF());
        }

        // Add a window listener to end the program for when the window is closed
        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });



    }
}
