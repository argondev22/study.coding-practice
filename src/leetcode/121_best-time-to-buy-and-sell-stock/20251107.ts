function maxProfit(prices: number[]): number {
    const n = prices.length
    let maxProfit = 0;

    for (let i = 0; i < n - 1; i++) {
        for (let j = i + 1; j < n; j++) {      
            const todayProfit = prices[j] - prices[i];
        
            if (maxProfit < todayProfit) {
                maxProfit = todayProfit;
            }
        }
    }

    return maxProfit;
};
