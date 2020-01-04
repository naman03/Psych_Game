package com.psych.game;

import com.psych.game.model.EllenAnswer;
import com.psych.game.model.Round;

public class RandomTopFiveAnswers implements EllenStrategy {
    @Override
    public EllenAnswer getAnswer(Round round) {
        // make a db query
        // ellen answers and questions repository
        // find the tp 5 voted answers
        // return one of them, based on the game id, round id, question id
    }
}
