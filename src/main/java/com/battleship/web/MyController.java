package com.battleship.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/board")
public class MyController {

    @RequestMapping(value = "/hello",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.POST)
    public ResponseEntity hello(@RequestParam String coordinate) {
        int[][] cells = new int[10][10];
        // return new ResponseEntity(Arrays.asList(cells),HttpStatus.OK);
        return new ResponseEntity(HttpStatus.OK);
    }


}
