package com.example.crazylab;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {

    void playSound(String soundLocation, float volume){

        try
        {
            File soundPath= new File(soundLocation);
            if(soundPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                setVolume(volume,clip);
                clip.start();
            }
            else{
                System.out.println("Can't find sound file");
            }
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void setVolume(float volume, Clip clip) {
        if (volume < 0f || volume > 1f)
            throw new IllegalArgumentException("Volume not valid: " + volume);
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(20f * (float) Math.log10(volume));
    }
}