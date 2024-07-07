import java.util.List;

public class Result {
    private List<String> results;

    public Result(List<String> results) {
        this.results = results;
    }

    public String getResult(int index) {
        return results.get(index);
    }

    public List<String> getResults() {
        return results;
    }
}
