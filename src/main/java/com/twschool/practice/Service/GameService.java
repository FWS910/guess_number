package com.twschool.practice.Service;

import com.twschool.practice.api.GameRepository;
import com.twschool.practice.domain.GuessNumberGame;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private GameRepository gameRepository;
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }
    public String guess(String userAnswerString){
        GuessNumberGame guessNumberGame = gameRepository.find();
        return guessNumberGame.guess(userAnswerString);
    }
}
