/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster;

import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.*;


class ClipControl {

    public static void main(String[] args) throws Exception {
        File url = new File("src/main/resources/Revolt X - Dosta je Bilo!.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(url);
        final Clip clip = AudioSystem.getClip();
        clip.open( ais );
        Runnable r = new Runnable() {
            public void run() {
                final JToggleButton startStop = new JToggleButton("Stop");
                startStop.addActionListener( new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        if (startStop.isSelected()) {
                            clip.stop();
                            startStop.setText("Start");
                        } else {
                            clip.loop(-1);
                            clip.start();
                            startStop.setText("Stop");
                        }
                    }
                } );
                clip.loop(-1);
                JOptionPane.showMessageDialog(null, startStop);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}