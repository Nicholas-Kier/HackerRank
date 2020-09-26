import java.io.*;

class Result {

    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int num_valleys = 0;

        for (int i = 0; i < steps; i++){
            if (path.charAt(i) == 'U'){
                if (altitude == -1) {
                    num_valleys++;
                }
                altitude++;
            }
            if (path.charAt(i) == 'D'){
                altitude--;
            }
        }
        return num_valleys;
    }
}

public class countingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
