package DSA_Arrays;

// GAS STATION

/*
Logic:
gas = [1, 2, 3, 4, 5]
cost = [3, 4, 5, 1, 2]
difference = [1-3, 2-4, 3-5, 4-1, 5-2] = [-2, -2, -2, 3, 3]
At first the total will be initialized with 0 and we keep on adding the next number from difference to the
total.If the total has come around a number that is less than 0 then we are gonna set it to 0 again.
At last we will have the total fuel that can get us back to the starting position
 */

class Arrays_GasStation {

    public static int station(int[] gas, int[] cost) {
        // If the total amount of gas is less than the total cost, it’s impossible to complete the journey, 
        // no matter from where we start. In this case, the function returns -1. If the total gas is greater
        // than or equal to the total cost, then there exists a solution
        int gasSum = 0;
        int costSum = 0;
        int count = 0; // keeps track of the starting position of our journey.
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
       
        if (gasSum < costSum) {
            return -1;
        }
        
        else{
            int total = 0; // keeps track of the remaining gas
            for (int i = 0; i < cost.length; i++) {
                // For each station, [difference-(gas[i]-cost[i])] calculates the remaining gas by 
                // subtracting the cost from the gas obtained at that station and adds it to total. If at
                // any point total becomes less than 0, that means we’ve run out of gas. In this case, we
                // try the next station as our starting position i.e., increment count and reset total to 0.
                total += (gas[i] - cost[i]);

                if (total < 0) {
                    total = 0;
                    count = i + 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int totalGas = station(gas, cost);
        System.out.println(totalGas);
    }
}


