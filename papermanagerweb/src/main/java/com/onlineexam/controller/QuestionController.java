package com.onlineexam.controller;

import com.google.gson.JsonObject;
import com.onlineexam.pojo.ChoiceQuestion;
import com.onlineexam.pojo.Options;
import com.onlineexam.pojo.Questions;
import com.onlineexam.service.QuestionService;
import com.onlineexam.util.JsonUtil;
import jdk.nashorn.internal.ir.Optimistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/index/list")
    @ResponseBody
    public List<ChoiceQuestion> getlist(){
        return questionService.getAllChoiceQuestion();
    }

    @RequestMapping("/index")
    public String show(){
        System.out.println(111);
        return "index";
    }


   @GetMapping("/index/{questionId}")
   @ResponseBody
   public Questions getUserList(@PathVariable Long questionId){
       Questions questions = questionService.getQuestionById(questionId);
       return questions;

   }

    @PostMapping("/index/add")
    @ResponseBody
    public String addUser(@RequestBody Questions questions){

        questionService.addQuestion(questions);
        System.out.println(111);
        String question = JsonUtil.toJson(questions);
       return question;
    }

    @PostMapping("/index/add2")
    @ResponseBody
    public String addUser2(@RequestBody ChoiceQuestion choiceQuestion){
        questionService.addChoices(choiceQuestion);
        System.out.println(choiceQuestion);
        return JsonUtil.toJson(choiceQuestion);
    }


}
