package com.thoughtworks.capability.gtb.entrancequiz.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//TODO GTB-工程实践: - 这个 BasePeople 是多余的
public class BasePeople {
    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }
}
