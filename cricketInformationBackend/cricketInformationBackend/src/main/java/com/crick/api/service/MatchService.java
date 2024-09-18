package com.crick.api.service;

import com.crick.api.entity.Match;

import java.util.List;

public interface MatchService {
    //to get All Matches
    List<Match> getAllMatches();

    //to get all Live Matches
    List<Match> getLiveMatches();

}
