package pl.put.poznan.transformer.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.Logic;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.app"})
public class IOProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IOProjectApplication.class, args);
    }

    @RestController
    @RequestMapping("/app")
    public static class RESTapiController {

        private static final Logger logger = LoggerFactory.getLogger(RESTapiController.class);




    }
}
