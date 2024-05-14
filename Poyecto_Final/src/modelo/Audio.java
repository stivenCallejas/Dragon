/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author 57312
 */
public class Audio {
    
    public Audio(){
        
    }
    //recibe el nombre del archivo para reproducirlo`
    public void reproducir(String nombreSonido){
                try{
            File archivoSonido = new File("C:\\Users\\57312\\OneDrive\\Documentos\\NetBeansProject\\Poyecto_Final\\src\\audios\\"+nombreSonido); // Reemplaza con la ruta del archivo de sonido
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    
}
