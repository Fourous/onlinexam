package com.onlineexam.service.impl;


import com.onlineexam.dao.ChoiceQuestionMapper;
import com.onlineexam.dao.OptionsMapper;
import com.onlineexam.dao.QuestionsMapper;
import com.onlineexam.enums.QuestionTypeEnum;
import com.onlineexam.pojo.ChoiceQuestion;
import com.onlineexam.pojo.Options;
import com.onlineexam.pojo.Questions;
import com.onlineexam.pojo.QuestionsExample;
import com.onlineexam.service.QuestionService;
import com.onlineexam.util.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionsMapper questionsMapper;

    @Autowired
    private OptionsMapper optionsMapper;

    @Autowired
    private ChoiceQuestionMapper choiceQuestionMapper;


    /**
     * 教师添加填空题目到题库中
     * @param question
     * @return
     */
    @Override
    public Questions addQuestion(Questions question) {
        // 生成问题唯一id
        final long questionId = IDUtil.genQuestionId();
        question.setId(questionId);
        question.setGmtCreated(new Date());
        question.setGmtUpdated(new Date());
        questionsMapper.insert(question);

        return question;
    }

    /**
     * 教师添加选择题到题库中
     * @param question
     * @param option
     * @return
     */
    @Override
    public Questions addChoices(ChoiceQuestion choiceQuestion) {

        Questions question = new Questions();
        // 生成唯一id
        final long questionId = IDUtil.genQuestionId();
        // 补全 question 属性
        question.setId(questionId);
        question.setQuestionDesc(choiceQuestion.getQuestionDesc());
        question.setQuestionType(choiceQuestion.getQuestionType());
        question.setSubjectId(choiceQuestion.getSubjectId());
        question.setAnswers(choiceQuestion.getAnswers());
        question.setGmtCreated(new Date());
        question.setGmtUpdated(new Date());
        // 向questions表插入数据
        questionsMapper.insert(question);
        Options option = new Options();
        option.setQuestionId(questionId);
        option.setOptionA(choiceQuestion.getOptionA());
        option.setOptionA(choiceQuestion.getOptionB());
        option.setOptionC(choiceQuestion.getOptionC());
        option.setOptionD(choiceQuestion.getOptionD());
        option.setGmtCreated(new Date());
        option.setGmtUpdated(new Date());
        optionsMapper.insert(option);
        return question;
    }


    @Override
    public Questions getQuestionById(Long questionId) {
        // 设置查询条件
        QuestionsExample example = new QuestionsExample();
        QuestionsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(questionId);
        return questionsMapper.selectByExample(example).get(0);
    }

    @Override
    public ChoiceQuestion getChoiceQuestionById(Long questionId) {
        return choiceQuestionMapper.getChoiceById(questionId);
    }


    @Override
    public List<Questions> getAllQuestion() {
        return null;
    }

    @Override
    public List<ChoiceQuestion> getAllChoiceQuestion() {
        return choiceQuestionMapper.getChoiceList();
    }

    @Override
    public void updateQuestion(Questions question) {

    }

    @Override
    public void delQuestion(Long questionId) {

    }
}
