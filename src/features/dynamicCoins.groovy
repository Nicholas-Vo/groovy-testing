package features

// Define the available coin denominations and their values
def coins = [1, 5, 10, 25]

// Define a function to find the minimum number of coins needed to make a given amount of money
static def minCoins(amount, coins) {
    // Create an array to store the minimum number of coins needed for each value from 1 to the amount
    def min = new int[amount + 1]

    // Initialize the minimum number of coins needed for each value to the maximum possible value
    def range = 0..amount
    for (i in range) {
        min[i] = amount + 1
    }

    // Set the minimum number of coins needed for 0 to 0
    min[0] = 0

    // Compute the minimum number of coins needed for each value from 1 to the amount
    for (i in 1..amount) {
        // For each coin denomination, compute the minimum number of coins needed for the current value
        // by adding the coin to the minimum number of coins needed for the previous value
        for (coin in coins) {
            if (coin <= i) {
                min[i] = Math.min(min[i], 1 + min[i - coin])
            }
        }
    }

    // Return the minimum number of coins needed for the given amount
    return min[amount]
}

println minCoins(150, coins)
