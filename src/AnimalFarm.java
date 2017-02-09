import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {

		String cat ;
		cat=JOptionPane.showInputDialog("Which animal do you want");
		 if(cat.equalsIgnoreCase("cow")){
		playMoo();}
		
		 else if (cat.equalsIgnoreCase("duck")){
	    	playQuack();}
	   
	else if (cat.equalsIgnoreCase("dog")){
		playWoof();}

	else if (cat.equalsIgnoreCase("cat")){
	playMeow();}

	}	
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */

		/* 2. Make it so that the user can keep entering new animals. */
	



	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
  void playMeow() {
	   playNoise(meowFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}



