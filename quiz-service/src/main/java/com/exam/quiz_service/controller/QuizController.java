package com.exam.quiz_service.controller;

import com.exam.quiz_service.model.Quiz;
import com.exam.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;


    @PostMapping("/addQuiz")
    public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz){
        Quiz addedQuiz = quizService.addQuiz(quiz);
        return ResponseEntity.ok(addedQuiz);
    }

    @GetMapping("/getQuizById/{quizId}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long quizId){
        Quiz quiz = quizService.getQuiz(quizId).orElse(null);
        return ResponseEntity.ok(quiz);
    }

    @GetMapping("/getAllQuizzes")
    public ResponseEntity<java.util.List<Quiz>> getAllQuizzes(){
        java.util.List<Quiz> quizzes = quizService.getAllQuizzes();
        return ResponseEntity.ok(quizzes);
    }

    @PutMapping("/updateQuiz")
    public ResponseEntity<Quiz> updateQuiz(Quiz quiz) {
        Quiz updatedQuiz = quizService.updateQuiz(quiz);
        return ResponseEntity.ok(updatedQuiz);
    }

    @DeleteMapping("/deleteQuiz/{quizId}")
    public ResponseEntity<String> deleteQuiz(@PathVariable Long quizId){
        String response = quizService.deleteQuiz(quizId);
        return ResponseEntity.ok(response);
    }
}
