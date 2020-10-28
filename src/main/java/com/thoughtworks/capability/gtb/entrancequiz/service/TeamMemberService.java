package com.thoughtworks.capability.gtb.entrancequiz.service;
import com.thoughtworks.capability.gtb.entrancequiz.repository.TeamMemberRepository;
import org.springframework.stereotype.Service;
import com.thoughtworks.capability.gtb.entrancequiz.dto.TeamMemberDto;
import java.util.List;

@Service
public class TeamMemberService {
    public List<TeamMemberDto> getAllTeamMembers(){
        return TeamMemberRepository.getAllStudents();
    }

    public void addStudent(String name) {
        TeamMemberDto studentDto = new TeamMemberDto(TeamMemberRepository.getAllStudents().size() + 1, name);
        TeamMemberRepository.addStudent(studentDto);
    }
}
