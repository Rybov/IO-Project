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
    private List<Room> rooms = new ArrayList<Room>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setHeatingLevel(float heatingLevel) {
        this.heatingLevel = heatingLevel;
    }

    public void setLightPower(float lightPower) {
        this.lightPower = lightPower;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
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
    public void addRoom(Room location) {
        this.area += location.getArea();
        this.volume += location.getVolume();
        this.heatingLevel += location.getHeatingLevel();
        this.lightPower += location.getLightPower();
        rooms.add(location);
    }
    public void removeRoom(Room location) {
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
