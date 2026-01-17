package com.exam.quiz_service.service;

import com.exam.quiz_service.model.Quiz;
import com.exam.quiz_service.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Optional<Quiz> getQuiz(Long quizId) {
        return quizRepository.findById(quizId);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public String deleteQuiz(Long quizId) {
        quizRepository.deleteById(quizId);

        return "Quiz Deleted Successfully";


    }
}
