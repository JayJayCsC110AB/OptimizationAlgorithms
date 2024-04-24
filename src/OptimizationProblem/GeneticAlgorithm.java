package OptimizationProblem;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class GeneticAlgorithm  {
    private static final int POPULATION_SIZE = 10;
    private static final int INDIVIDUAL_SIZE = 21;
    private static final Random random = new Random();
    private static final OpProblem<Integer> problem = new AllZeros();

    public static List<Integer> GenerateSolution(){
        List<Integer> individual = new ArrayList<>();
        for(int i = 0; i < INDIVIDUAL_SIZE; i++){
            individual.add(random.nextInt(-15, 15));
        }
        return individual;

    }
    public static List<List<Integer>> InitializePopulation(){
       List<List<Integer>> population = new ArrayList<>();
    for (int i = 0; i < POPULATION_SIZE; i++) {
       population.add(GenerateSolution());
    }
    
    return population;
    
    }


} // Generate individuals and add them to the population
   