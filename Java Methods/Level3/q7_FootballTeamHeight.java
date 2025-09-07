public class q7_FootballTeamHeight {

    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights for players between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = generateRandomHeight(150, 250);
        }

        // Display heights
        System.out.print("Player Heights(cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Calculate statistics
        int sum = sumOfHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        // Display results
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
        System.out.println("Shortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");
    }

    // Generate random height between min and max (inclusive)
    public static int generateRandomHeight(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    // Sum of all heights
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Mean height of players
    public static double meanHeight(int[] heights) {
        int sum = sumOfHeights(heights);
        return (double) sum / heights.length;
    }

    // Shortest height of players
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Tallest height of players
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}