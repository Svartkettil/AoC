package christmasDay1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Day1 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        List<Integer> loadsOfCalories = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\mauri\\Desktop\\Java\\AoC\\src\\christmasDay1\\InputDay1.txt"));
          for(String line : lines){
                if(line.length() == 0){
                    loadsOfCalories.add(sum);
                    sum = 0;
                }
                else {
                    sum = sum + Integer.parseInt(line);
                }
        }
        int top3sum = loadsOfCalories.stream()
                .sorted()
                .skip(loadsOfCalories.size() - 3)
                .reduce(0, Integer::sum);
        System.out.println(top3sum);
    }
}
