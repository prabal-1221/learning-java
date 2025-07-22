package Interfaces.Devices;

public interface MusicPlayer {
    void playMusic();
    void stopMusic();

    default void run() {
        System.out.println("MusicPlayer is running.");
    }
}
