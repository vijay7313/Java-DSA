package ArrayExercise;

public class ArrayEx7 {

	private static int maxProfit(int[] array) {
		int buyPrice = array[0];
		int maxProfit = 0;
		for (int price : array)

			if (buyPrice > price)
				buyPrice = price;

			else if (maxProfit < price - buyPrice)
				maxProfit = price - buyPrice;

		return maxProfit;
	}

	public static void main(String[] args) {

		int[] array = { 7, 5, 3, 6, 4, 1 };

		System.out.println(maxProfit(array));

//		
//		You are given an array prices where prices[i] is the price of a given stock
//		on the i^th day. You want to maximize your profit by choosing a single day
//		to buy one stock and choosing a different day in the future to sell that stock.
//		Return the maximum profit you can achieve from this transaction.
//		If you cannot achieve any profit, return 0.
//
//				Example:
//
//				Input: prices = [7, 5, 3, 6, 4, 1 ] 
//				Output: 3 
//				Explanation: Buy on day 3 (price = 3) and sell on day 5 (price = 6),
//				profit = 6-3 = 3.

	}

}