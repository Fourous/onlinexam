package com.onlineexam.service;


import com.onlineexam.pojo.StudentAnswer;

/**
 * 试卷对应的答案服务类的接口
 */
public interface AnswerService {
    StudentAnswer getAnswerByPaperId(Long PaperId);

}
