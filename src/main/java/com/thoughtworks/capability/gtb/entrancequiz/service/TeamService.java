package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.TeamDto;
import com.thoughtworks.capability.gtb.entrancequiz.dto.MemberDto;
import com.thoughtworks.capability.gtb.entrancequiz.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class TeamService {

    public List<TeamDto> getTeam() {
        List<MemberDto> allStudents = MemberRepository.getAllMembers();
        List<MemberDto> tempList = new ArrayList<>();
        tempList.addAll(allStudents);
        Collections.shuffle(tempList);

        List<TeamDto> AllTeams = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<MemberDto> TeamMembers = new ArrayList<>();
            AllTeams.add(new TeamDto(String.format("%d 组", i+1), TeamMembers));
        }

        for (int i = 0; i < tempList.size(); i++) {
            if (i < 6) {
                List<MemberDto> TeamMembers = AllTeams.get(i).getMemberDtoList();
                TeamMembers.add(tempList.get(i));
                AllTeams.get(i).setMemberDtoList(TeamMembers);
            } else {
                List<MemberDto> TeamMembers = AllTeams.get(i % 6).getMemberDtoList();
                TeamMembers.add(tempList.get(i));
                AllTeams.get(i % 6).setMemberDtoList(TeamMembers);
            }
        }

        return AllTeams;
    }

}
