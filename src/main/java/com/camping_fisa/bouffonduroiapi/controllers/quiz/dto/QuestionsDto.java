package com.camping_fisa.bouffonduroiapi.controllers.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsDto {
    private long id;
    private String question;
    private List<String> options;
}
