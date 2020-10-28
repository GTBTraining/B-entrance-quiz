package com.thoughtworks.capability.gtb.entrancequiz.service;
import com.thoughtworks.capability.gtb.entrancequiz.repository.MemberRepository;
import org.springframework.stereotype.Service;
import com.thoughtworks.capability.gtb.entrancequiz.dto.MemberDto;
import java.util.List;

@Service
public class MemberService {
    public List<MemberDto> getAllMembers(){
        return MemberRepository.getAllMembers();
    }

    public void addStudent(String name) {
        MemberDto studentDto = new MemberDto(MemberRepository.getAllMembers().size() + 1, name);
        MemberRepository.addMember(studentDto);
    }
}
