package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.TeamDto;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TeamController {

    final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public ResponseEntity<List<TeamDto>> getTeams() {
        return ResponseEntity.ok(teamService.getTeam());
    }
    }

