package com.crick.api.controller;

import com.crick.api.entity.Match;
import com.crick.api.service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getAllMatchs(){

        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }
    @GetMapping("/all")
     public ResponseEntity<List<Match>> getAllMatches(){

        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
     }
}
