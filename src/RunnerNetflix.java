
public class RunnerNetflix {
	//1. Instantiate some Movie objects (at least 5).
		
	//2. Use the Movie class to get the ticket price of one of your movies.


		//3. Instantiate a NetflixQueue.
		//4. Add your movies to the Netflix queue.
		//5. Print all the movies in your queue.
		
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 



	
	public static void main(String[] args) {
		Movie Movie1 = new Movie("Grown Ups 2", 2);
		Movie Movie2 = new Movie("Jack Jill", 1);
		Movie Movie3 = new Movie("Battleship", 1);
		Movie Movie4 = new Movie("Pixels", 1);
		Movie Movie5 = new Movie("Smosh: The Movie", 3);
		System.out.println(Movie1.getTicketPrice());
		System.out.println(Movie2.getTicketPrice());
		System.out.println(Movie3.getTicketPrice());
		System.out.println(Movie4.getTicketPrice());
		System.out.println(Movie5.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(Movie1);
		queue.addMovie(Movie2);
		queue.addMovie(Movie3);
		queue.addMovie(Movie4);
		queue.addMovie(Movie5);
		queue.printMovies();
		queue.sortMoviesByRating();
		queue.printMovies();
	}
}
