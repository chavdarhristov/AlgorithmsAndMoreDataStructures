package backtracking;

public interface CostSolutionSpace<T extends CostSolutionSpace<T>> extends SolutionSpace<T> {
	double cost();
}
