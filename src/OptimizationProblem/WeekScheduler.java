package OptimizationProblem;

public class WeekScheduler {
	 public static final double MIN_SCORE = 0.0;
	 public static final double MAX_SCORE = 100.0;
	//Games, Homework, Gym, Projects, Tutoring, Friends, Media
	   
	double hoursAvailable = 50.0;
	
	public WeekScheduler() {}
	
	public WeekScheduler(double hoursAvailable) {
		this.hoursAvailable = hoursAvailable;
	}
    public double scoreSolution(double[] solution) {
        double hoursLeft = hoursAvailable;

        for (int i = 0; i < solution.length; i++) {
            if (solution[i] == i) {
                hoursLeft -= solution[i];
            } else {
                System.out.println("Follow the schedule or score will keep going down! Current Score: " + scoreSolution(solution));
            }
        }

        double score = 0.0;
        // Calculate the score
        for (double hour : solution) {
            score += hour;
        }

        // Adjust the score based on hours left
        score = ( hoursLeft / score) * MAX_SCORE;

        return score;
    }
}