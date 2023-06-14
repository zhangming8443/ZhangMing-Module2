package ss8.excercise;

public class TennisGame {
    public static String getScore(String player1, String player2, int score1, int score2) {
        String scoreResult = "";
        int tempScore = 0;
        int scorePlayer1 = score1;
        int scorePlayer2 = score2;
        if (scorePlayer1 == scorePlayer2) {
            final int ZERO_POINT = 0;
            final int ONE_POINT = 1;
            final int TWO_POINT = 2;
            final int THREE_POINT = 3;
            switch (scorePlayer1) {
                case ZERO_POINT:
                    scoreResult = "Love-All";
                    break;
                case ONE_POINT:
                    scoreResult = "Fifteen-All";
                    break;
                case TWO_POINT:
                    scoreResult = "Thirty-All";
                    break;
                case THREE_POINT:
                    scoreResult = "Forty-All";
                    break;
                default:
                    scoreResult = "Deuce";
                    break;

            }

        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) {
                scoreResult = "Advantage player1";
            } else if (minusResult == -1) {
                scoreResult = "Advantage player2";
            } else if (minusResult >= 2) {
                scoreResult = "Win for player1";
            } else {
                scoreResult = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    scoreResult += "-";
                    tempScore = scorePlayer2;
                }
                final int TEMP_ZERO_POINT = 0;
                final int TEMP_ONE_POINT = 1;
                final int TEMP_TWO_POINT = 2;
                final int TEMP_THREE_POINT = 3;
                switch (tempScore) {
                    case TEMP_ZERO_POINT:
                        scoreResult += "Love";
                        break;
                    case TEMP_ONE_POINT:
                        scoreResult += "Fifteen";
                        break;
                    case TEMP_TWO_POINT:
                        scoreResult += "Thirty";
                        break;
                    case TEMP_THREE_POINT:
                        scoreResult += "Forty";
                        break;
                }
            }
        }
        return scoreResult;
    }
}
