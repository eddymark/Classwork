package classwork;

public class Tax {

	public static double basicRate = 0.04;
	public static double luxuryRate = 0.1;

	public static double computeCostBasic(double price)

	{

		return roundToNearestPenny(price + basicRate);

	}

	public static double computeCostLuxury(double price)

	{

		return roundToNearestPenny(price + luxuryRate);

	}

	public static void changeBasicRateTo(double newRate)

	{

		basicRate = newRate;

	}

	public static void changeLuxuryRateTo(double newRate)

	{

		luxuryRate = newRate;

	}

	private static double roundToNearestPenny(double price)

	{
		return price;
		
	}

}