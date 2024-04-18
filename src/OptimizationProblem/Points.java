public class Points implements Activities { 
    private final static int MIN_SCORE = 0;
    private final static int MAX_SCORE = 100;
    private Double score = 0;

    private points (double score) {
        setScore(name);
    }
    public Points(double score) {
        setScore(score);
    }

    public double getScore() {
        return score;
    }

    private void setScore(double score) {
        this.score = score;
    } 
    private double scoreGym(double score) {
        if(Activities.hours >= 10) {
            return 15;
        }
        else {
            return 0;
        }
    }
    private double scoreHomework(double score) {
        if(Activities.hours >= 25) {
            return 20;
        }
        else {
            return 0;
        }
    }
    private double scoreProjects(double score){
        if(Activities.hours >= 8) {
            return 30;
        }
        else {
            return 0;
        }
    }
    private double scoreTutoring (double score){
        if(Activities.hours >= 8) {
            return 35;
        }
        else {
            return 0;
        }

    }
    private double scoreLeetcode (double score){
       if(Activities.hours >= 10) {
            return 25;
        }
        else {
            return 0;
        }
    }
    //Positive or Negative Score
    /*
     * Either 140 + 5 && 140 + 15 = 155 if both are achieved which you've completed your schedule to the maximum capability
     * or 140 - 30 || 140 - 20
     */
    private double scoreFriends (double score){

        if(Activities.hours >= 10) {
            return -20;
        }
        else {
            return 5;
        }
    }
    private double scoreSleep (double score){
       if(Activities.hours >= 68) {
            return -30;
        }
        else {
            return 15;
        }
    }

    //Negative Scores 
    /*
     * if both +/- were negative scores than score would be 90
     * 90 - 25 && 90 -25 && 90- 50 = -10 You've depleted all of your points including next weeks calender points by 10
     * 
     * NOTES: If you achieved an amounted 155 points you can still lose all your points, 155 points doesn't mean you've won until all criterias have been met.
     * 
     */
    private double scoreGames(double score) {
        if(Activities.hours >= 7.5) {
            return -25;
        }
        else {
            return 0;
        }
    } 
    private double scoreMedia (double score) {
        if(Activities.hours >= 10) {
            return -25;
        }
        else {
            return -15;
        }
    }
    private double scoreFastFood (double score){

        if(Activities.hours >= 10) {
            return -50;
        }
        else {
            return 0;
        }
    }
    
     
    // Getter for score
   /*  private double getScore() {
        double totalScore = 0.0;
    
        // Iterate through each activity
        for (int i = 0; i < solution.length; i++) {
            switch (i) {
                case 0:
                    totalScore += scoreGym(solution[i]);
                    break;
                case 1:
                    totalScore += scoreHomework(solution[i]);
                    break;
                case 2:
                    totalScore += scoreProjects(solution[i]);
                    break;
                case 3:
                    totalScore += scoreTutoring(solution[i]);
                    break;
                case 4:
                    totalScore += scoreLeetcode(solution[i]);
                    break;
                case 5:
                    totalScore += scoreFriends(solution[i]);
                    break;
                case 6:
                    totalScore += scoreMedia(solution[i]);
                    break;
                case 7:
                    totalScore += scoreFastFood(solution[i]);
                    break;
                case 8:
                    totalScore += scoreSleep(solution[i]);
                    break;
                case 9:
                    totalScore += scoreGames(solution[i]);
                    break;
                default:
                    break;
            }
        }
        
        return totalScore;
    }
    */
}
