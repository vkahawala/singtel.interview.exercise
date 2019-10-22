package singtel.interview.exercise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import singtel.interview.exercise.service.AnimalService;
import singtel.interview.exercise.util.AnimalActivityFectory;
import singtel.interview.exercise.util.ErrorMessage;

@RestController
public class AnimalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalController.class);

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/animals", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listAnimals() {
        try {
            return new ResponseEntity<>(animalService.listAnimals(), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/animals/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAnimals(@PathVariable String type) {
        try {
            return new ResponseEntity<>(animalService.listAnimals(AnimalActivityFectory.getActivity(type)), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/animals/{type}/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity count(@PathVariable String type) {
        try {
            return new ResponseEntity<>(animalService.count(AnimalActivityFectory.getActivity(type)), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }
}
