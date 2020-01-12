package pl.put.poznan.transformer.logic.tests;

import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.app.BuildingService;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.DAO;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class BuildingServiceTest {


    @Test
    void getBuildings() {
        DAO dao = mock(DAO.class);

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(new Building(1));

        when(dao.getBuildings()).thenReturn(buildings);

        BuildingService bService = new BuildingService();

        bService.setDao(dao);

        assertEquals(bService.getBuildings(), buildings);
    }
}