class ClockTester {

	public static void main(String args[]) {

		Clock myClock;
		BetterClock myBetterClock, myBetterClock2;

		System.out.println("Creating Clock object");

		// Set the Clock (via constructor) to 1/2/2003 at 12:00:00 AM
		myClock = new Clock(12, 0, 0, 0, 1, 2, 2003);

		// Print the current time
		myClock.printTime();

		// Set clock to a new time
		myClock.setTime(12, 34, 56, -1, 2, 2, 2015);

		// Print the new time
		myClock.printTime();

		System.out.println("Adding 10000 seconds");
		myClock.addTime(10000);

		// Print the new time
		myClock.printTime();




		System.out.println("\nCreating BetterClock object");

		// Set the BetterClock (via constructor) to 10/12/1987 at 4:45:00 PM, GMT-05:00
		myBetterClock = new BetterClock(4, 45, 0, 1, 10, 12, 1987, -5);

		// Print the current time
		myBetterClock.printTime();

		System.out.println("Removing 1000 seconds");
		myBetterClock.addTime(-1000);

		// Print the new time
		myBetterClock.printTime();

		// Add the 1000 seconds back
		myBetterClock.addTime(1000);




		System.out.println("\nCreating second BetterClock object");

		// Set the second BetterClock to 10/14/1987 at 2:15:00 PM, GMT-05:00
		myBetterClock2 = new BetterClock(2, 15, 0, 1, 10, 2, 1987, -5);

		// Print the current time
		myBetterClock2.printTime();

		// Calculate the time difference
		myBetterClock.timeDifference(myBetterClock2);





	} //main

} //ClockTester
