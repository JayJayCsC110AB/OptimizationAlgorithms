public class TestProblem implements Problem{
    
    //This MUST stay as is
    public double scoreSolution(double[] solution) {
        double score = 0;
        for(double d : solution) {
            score -= Math.abs(d);
        }
        return score;
    }
}
