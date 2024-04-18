package OptimizationProblem;

public class WeekScheduler {
    public static final double MIN_HOURS = 0.0;
    public static final double MAX_HOURS = 150.0;
    private String Activity;
    private double hours;

    public WeekScheduler(String Activity, double hours) {
        setActivity(Activity);
        setHours(hours);
    }
    //Function to score 'gym' hours


   
     /*   private double totalScore(double[] solution){
            totalScore += scoreGym(solution[0]);
            totalScore += scoreHomework(solution[1]);
            totalScore += scoreProjects(solution[2]);
            totalScore += scoreTutoring(solution[3]);
            totalScore += scoreLeetcode(solution[4]);
            totalScore += scoreFriends(solution[5]);
            totalScore += scoreMedia(solution[6]);
            totalScore += scoreFastFood(solution[7]);
            totalScore += scoreSleep(solution[8]);
            totalScore += scoreGames(solution[9]);
           
            System.out.println("Total Score: " + totalScore);
        }
        */ 
    //+ SCORE = 140
    private String getActivity() {
        return Activity;
    }

    private void setActivity(String Activity) {
        this.Activity = Activity;
    }
    private double getHours() {
        return hours;
    }


    private void setHours(double hours) {
        this.hours = hours;
    }
    
    public static String validateActivity(String Activity) {
        if (Activity == null) {
            return "Name of Activity may not be null";
        }
        if (Activity.isBlank()) {
            return "Name of Activity may not be blank";
        }
        return null;
    }

    public static String validateActivity(int hours) {
        if (hours > MAX_HOURS || year < MIN_HOURS) {
            return "Hour: " + hours + " is Invalid. Specify between hour " + MIN_HOURS + " and " + MAX_HOURS;
        }
        return null;
    }

    public void setName(String name) {
        String errMsG = validateName(name);
        if (errMsG != null) {
            throw new IllegalArgumentException(errMsG);
        }
        this.name = name;
    }

    public void setYear(int year) {
        String errMsG = validateYear(year);
        if (errMsG != null) {
            throw new IllegalArgumentException(errMsG);
        }
        this.year = year;
    }

}