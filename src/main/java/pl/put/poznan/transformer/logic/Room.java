package pl.put.poznan.transformer.logic;
public class Room implements ILocation {
    private int id;
    private String name;
    private float area;
    private float volume;
    private float heatingLevel;
    private float lightPower;

    public Room(int id) {
        this.id = id;
        name = "";
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }
    public Room(int id, String name, float area, float volume, float heatingLevel, float lightPower) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.volume = volume;
        this.heatingLevel = heatingLevel;
        this.lightPower = lightPower;
    }


    public float getArea() {
        return area;
    }
    public float getVolume() {
        return volume;
    }
    public float getHeatingLevel() {
        return heatingLevel;
    }
    public float getLightPower() {
        return lightPower;
    }
}
