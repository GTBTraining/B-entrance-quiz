package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.TeamMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    public List<TeamMember> formTeam(List<TeamMember> teamMembers){
        return teamMembers;
    }
}
