package OptimizationProblem;

import java.util.List;

public class AllZeros implements OpProblem<Integer> {

    @Override
    public double scoreSolution(List<Integer> solution) {
        // TODO Auto-generated method stub
        int score = 0;
        for (int i : solution) {
            score -= Math.abs(i);
        }
        return score;
    }
    
}
