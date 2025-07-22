package Interfaces.Devices;

public class Phone implements Camera, MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Camera taking photo.");
    }

    @Override
    public void deletePhoto() {
        System.out.println("Camera deleting photo.");

    }

    @Override
    public void run() {
        Camera.super.run();
        MusicPlayer.super.run();
    }

    @Override
    public void playMusic() {
        System.out.println("Music started.");

    }

    @Override
    public void stopMusic() {
        System.out.println("Music ended.");

    }
}
