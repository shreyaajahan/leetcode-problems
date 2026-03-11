class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int current = capacity;

        for (int i = 0; i < plants.length; i++) {

            if (current < plants[i]) {
                steps += 2 * i;   // go back and return
                current = capacity;
            }

            current -= plants[i];
            steps++;  // move to next plant
        }

        return steps;
    }
}