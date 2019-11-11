package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.List;

public class Floor implements ILocation{
    private int id;
    private String name;
    private float area;
    private float volume;
    private float heatingLevel;
    private float lightPower;
    private List<ILocation> rooms = new ArrayList<ILocation>();

    public Floor(int id) {
        this.id = id;
        name = "";
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }
    public Floor(int id, String name) {
        this.id = id;
        this.name = name;
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }
    public void addRoom(ILocation location) {
        this.area += location.getArea();
        this.volume += location.getVolume();
        this.heatingLevel += location.getHeatingLevel();
        this.lightPower += location.getLightPower();
        rooms.add(location);
    }
    public void removeRoom(ILocation location) {
        this.area -= location.getArea();
        this.volume -= location.getVolume();
        this.heatingLevel -= location.getHeatingLevel();
        this.lightPower -= location.getLightPower();
        rooms.remove(location);
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
