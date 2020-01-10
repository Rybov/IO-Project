package pl.put.poznan.transformer.logic;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of Floor
 */
public class Floor implements ILocation{
    private int id;
    private String name;
    private float area;
    private float volume;
    private float heatingLevel;
    private float lightPower;
    private float avgVolume;
    private float avgLightPower;
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

    /**
     * Constructor, every floor has to have id
     * @param id Id of new floor
     */
    public Floor(int id) {
        this.id = id;
        name = "";
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }

    /**
     * Optionally constructor with name and id
     * @param id New id
     * @param name New name
     */
    public Floor(int id, String name) {
        this.id = id;
        this.name = name;
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }

    /**
     * Adding new room
     * @param location New room
     */
    public void addRoom(Room location) {
        this.area += location.getArea();
        this.volume += location.getVolume();
        this.heatingLevel += location.getHeatingLevel();
        this.lightPower += location.getLightPower();
        rooms.add(location);
        this.avgLightPower = this.lightPower/getRooms().size();
        this.avgVolume = this.volume/getRooms().size();
    }

    /**
     * removing a room
     * @param location location to remove
     */
    public void removeRoom(Room location) {
        this.area -= location.getArea();
        this.volume -= location.getVolume();
        this.heatingLevel -= location.getHeatingLevel();
        this.lightPower -= location.getLightPower();
        rooms.remove(location);
        this.avgLightPower = this.lightPower/getRooms().size();
        this.avgVolume = this.volume/getRooms().size();
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
    public float getAvgVolume() {
        return avgVolume;
    }
    public void setAvgVolume(float avgVolume) {
        this.avgVolume = avgVolume;
    }
    public float getAvgLightPower() {
        return avgLightPower;
    }
    public void setAvgLightPower(float avgLightPower) {
        this.avgLightPower = avgLightPower;
    }
}
