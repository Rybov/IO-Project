package pl.put.poznan.transformer.logic.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.Room;

class RoomTest {

    Room room;

    @BeforeEach
    void setUp() {
        room = new Room(1, "room_name", 10.0f, 50.0f, 15.0f, 5.0f);
    }

    @Test
    void getId() {
        Assertions.assertEquals(1, room.getId());
    }

    @Test
    void getName() {
        Assertions.assertEquals("room_name", room.getName());
    }

    @Test
    void getArea() {
        Assertions.assertEquals(10.0f, room.getArea());
    }

    @Test
    void getVolume() {
        Assertions.assertEquals(50.0f, room.getVolume());
    }

    @Test
    void getHeatingLevel() {
        Assertions.assertEquals(15.0f, room.getHeatingLevel());
    }

    @Test
    void getLightPower() {
        Assertions.assertEquals(5.0f, room.getLightPower());
    }
}