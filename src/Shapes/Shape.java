package Shapes;

public abstract class Shape {
    private double volume;
    public Shape(){
    }

    public abstract double getVolume();

    public void setVolume(){
        this.volume=volume;
    }
}