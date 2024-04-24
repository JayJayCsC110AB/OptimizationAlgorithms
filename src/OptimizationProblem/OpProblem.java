package OptimizationProblem;

import java.util.List;

public interface OpProblem<T> {
    
    public double scoreSolution(List<T> solution);
}
