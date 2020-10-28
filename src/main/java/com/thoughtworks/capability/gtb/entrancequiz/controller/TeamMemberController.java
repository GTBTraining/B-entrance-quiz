package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.TeamMemberDto;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamMemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TeamMemberController {

    private TeamMemberService teamMemberService;

    public TeamMemberController(TeamMemberService teamMemberService){
        this.teamMemberService=teamMemberService;
    }

    @GetMapping("/teammember")
    public ResponseEntity<List<TeamMemberDto>> getAllTeamMembers() {
        return ResponseEntity.ok(teamMemberService.getAllTeamMembers());
    }

    @PostMapping("/teammember")
    public ResponseEntity<List<TeamMemberDto>> addStudent(@RequestBody String productName) {
        teamMemberService.addStudent(productName);
        return ResponseEntity.created(null).build();
    }
}
