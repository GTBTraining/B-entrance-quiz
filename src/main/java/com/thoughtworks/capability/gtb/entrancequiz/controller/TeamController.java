package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.TeamMember;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/team", produces = "application/json; charset=utf-8")
public class TeamController {

    private final TeamService teamService;

    //TODO GTB-知识点: - @Autowired 是多余的了
    @Autowired
    public  TeamController(TeamService teamService){
        this.teamService=teamService;
    }

    @PostMapping
    @ResponseBody
    List<TeamMember> formteam (@RequestBody List<TeamMember> teamMembers) {
        return teamService.formTeam(teamMembers);
    }
}
