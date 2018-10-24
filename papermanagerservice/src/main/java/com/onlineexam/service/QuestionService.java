package com.onlineexam.service;


import com.onlineexam.pojo.ChoiceQuestion;
import com.onlineexam.pojo.Options;
import com.onlineexam.pojo.Questions;

import java.util.List;

/**
 * 题库试题服务类
 *
 */
public interface QuestionService {
     Questions addQuestion(Questions question);
     Questions addChoices(ChoiceQuestion choiceQuestion);
     Questions getQuestionById(Long questionId);
     ChoiceQuestion getChoiceQuestionById(Long questionId);
     List<Questions> getAllQuestion();
     List<ChoiceQuestion> getAllChoiceQuestion();
     void updateQuestion(Questions question);
     void delQuestion(Long questionId);
}
