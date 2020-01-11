package pl.put.poznan.transformer.logic.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.Floor;
import pl.put.poznan.transformer.logic.Room;

class FloorTest {

    Floor floor;

    @BeforeEach
    void setUp() {
        floor = new Floor(1, "floor_name");
    }

    @Test
    void getId() {
        Assertions.assertEquals(1, floor.getId());
    }

    @Test
    void setId() {
        floor.setId(2);
        Assertions.assertEquals(2, floor.getId());
    }

    @Test
    void getName() {
        Assertions.assertEquals("floor_name", floor.getName());
    }

    @Test
    void setName() {
        floor.setName("new_name");
        Assertions.assertEquals("new_name", floor.getName());
    }

    @Test
    void addRoom() {
        Room room = new Room(1, "room_name", 10.0f, 50.0f, 15.0f, 5.0f);
        floor.addRoom(room);
        Assertions.assertEquals(1, floor.getRooms().size());
        Assertions.assertEquals(10.0f, floor.getArea());
        Assertions.assertEquals(50.0f, floor.getVolume());
        Assertions.assertEquals(15.0f, floor.getHeatingLevel());
        Assertions.assertEquals(5.0f, floor.getLightPower());
        Assertions.assertEquals(5.0f / 1, floor.getAvgLightPower());
        Assertions.assertEquals(50.0f / 1, floor.getAvgVolume());
    }

    @Test
    void removeRoom() {
        Room room = new Room(1, "room_name", 10.0f, 50.0f, 15.0f, 5.0f);
        floor.addRoom(room);
        floor.removeRoom(room);
        Assertions.assertEquals(0, floor.getRooms().size());
        Assertions.assertEquals(0, floor.getArea());
        Assertions.assertEquals(0, floor.getVolume());
        Assertions.assertEquals(0, floor.getHeatingLevel());
        Assertions.assertEquals(0, floor.getLightPower());
        Assertions.assertEquals(Float.NaN, floor.getAvgLightPower());
        Assertions.assertEquals(Float.NaN, floor.getAvgVolume());


    }

    @Test
    void setArea() {
        floor.setArea(100.0f);
        Assertions.assertEquals(100.0f, floor.getArea());
    }

    @Test
    void setVolume() {
        floor.setVolume(50.0f);
        Assertions.assertEquals(50.0f, floor.getVolume());
    }

    @Test
    void setHeatingLevel() {
        floor.setHeatingLevel(10.0f);
        Assertions.assertEquals(10.0f, floor.getHeatingLevel());
    }

    @Test
    void setLightPower() {
        floor.setLightPower(1.0f);
        Assertions.assertEquals(1.0f, floor.getLightPower());
    }
}