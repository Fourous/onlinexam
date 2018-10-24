package com.onlineexam.dao;

import com.onlineexam.pojo.ChoiceQuestion;

import java.util.List;

public interface ChoiceQuestionMapper {
    List<ChoiceQuestion> getChoiceList();
    ChoiceQuestion getChoiceById(long questionId);



}
