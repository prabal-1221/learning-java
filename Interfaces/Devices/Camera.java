package Interfaces.Devices;

public interface Camera {
    void takePhoto();
    void deletePhoto();

    default void run() {
        System.out.println("Camera is running.");
    }
}
