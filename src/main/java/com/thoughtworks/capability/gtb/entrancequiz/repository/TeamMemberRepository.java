package com.thoughtworks.capability.gtb.entrancequiz.repository;
import com.thoughtworks.capability.gtb.entrancequiz.dto.TeamMemberDto;
import java.util.ArrayList;
import java.util.List;

public class TeamMemberRepository {
    private static final String[] studentNameList = {"成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰", "雅典娜", "芈月",
            "白起", "刘禅", "庄周", "马超", "刘备", "哪吒", "大乔", "蔡文姬"};

    private static int id = 1;
    private static final List<TeamMemberDto> studentDtoList = new ArrayList<>();

    static {
        for (String name : studentNameList) {
            studentDtoList.add(new TeamMemberDto(id, name));
            id++;
        }
    }

    public static List<TeamMemberDto> getAllStudents() {
        return studentDtoList;
    }

    public static void addStudent(TeamMemberDto studentDto) {
        studentDtoList.add(studentDto);
    }
}
