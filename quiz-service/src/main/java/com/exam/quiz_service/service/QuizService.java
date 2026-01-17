package com.exam.quiz_service.service;

import com.exam.quiz_service.model.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizService {

    Quiz addQuiz(Quiz quiz);

    Optional<Quiz> getQuiz(Long quizId);

    List<Quiz> getAllQuizzes();

    Quiz updateQuiz(Quiz quiz);

    String deleteQuiz(Long quizId);
}
