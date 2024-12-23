package com.ipaye.settlingscores.Controller;

import com.ipaye.settlingscores.Model.Scores;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ScoreController {

    static Scores scores = new Scores(30, 20, 10);
    @GetMapping("/health-check")
    public String getHealthCheck(){
        return "Situation Normal all fired Up!";
    }

    @GetMapping("/scores")
    public Scores getScores() {
        return scores;
    }

    @PostMapping("/scores/wins")
    public Scores increaseWins(){
        scores.wins++;
        return scores;

    }
    @PostMapping("/scores/ties")
    public Scores increaseTies(){
        scores.ties++;
        return scores;

    }
    @PostMapping("/scores/losses")
    public Scores increaseLosses(){
        scores.losses++;
        return scores;

    }

    @GetMapping("/scores/{winslossesorties}")
    public int getWinLossesOrTies(@PathVariable String winslossesorties){
        if(winslossesorties.equalsIgnoreCase("wins")){
            return scores.wins;
        }
        if(winslossesorties.equalsIgnoreCase("ties")){
            return scores.ties;
        }
        return scores.losses;
    }
}
