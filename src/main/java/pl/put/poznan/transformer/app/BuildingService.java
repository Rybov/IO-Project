package pl.put.poznan.transformer.app;

import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.Floor;

import java.beans.BeanProperty;
import java.util.Arrays;
import java.util.List;

@Component
public class BuildingService {



    private List<Building> buildings = Arrays.asList(
            new Building(0, "nowyBudynel").addFloor(new Floor(0, "podłowaMarcela")).addFloor(new Floor(1, "podłoga Iwa")),
            new Building(1, "nowyBudenyek2").addFloor(new Floor(2, "podłoga Kuby i Jasia na której się ruchają w dupsko"))
    );

    @Bean
    public List<Building> getBuildings(){
        return buildings;
    }


    @Bean
    public Building getBuilding(Integer id){
        return buildings.get(id);
    }

}