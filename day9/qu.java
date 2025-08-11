                                               public class qu {

    // Simple class to store petrol and distance info for each pump
    static class PetrolPump {
        int petrol;
        int distanceToNext;

        PetrolPump(int petrol, int distanceToNext) {
            this.petrol = petrol;
            this.distanceToNext = distanceToNext;
        }
    }

    // Function returns the starting pump index or -1 if not possible
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int totalPetrol = 0, totalDistance = 0;
        int currPetrol = 0, start = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distanceToNext;
            currPetrol += pumps[i].petrol - pumps[i].distanceToNext;
            if (currPetrol < 0) {
                // Not enough petrol to reach the next pump; reset start point
                start = i + 1;
                currPetrol = 0;
            }
        }

        // If total petrol is less than total distance, it's not possible
        return (totalPetrol >= totalDistance) ? start : -1;
    }

    public static void main(String[] args) {
        // Example: 4 petrol pumps with their petrol and distance values
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        int start = findStartingPoint(pumps);
        if (start == -1)
            System.out.println("No possible starting point to complete the tour.");
        else
            System.out.println("Start at petrol pump: " + start);
    }
}
