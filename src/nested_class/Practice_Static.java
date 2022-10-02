package nested_class;

class movie{
	
	
	 class cast{
		 
		
		void writter() {
			System.out.println(" writter writes story for the movie");
			
		}
		static void musicDirector() {
			System.out.println("music director Gives the music to the movie");
		}
		
		static class Director{
		
			void assistantdirector() {
				System.out.println("works according to the directors instructions");
			}
			void co_director() {
				System.out.println("works according to the assistant directors instructions");
			}
			
		}
	}
	
}

public class Practice_Static {

	public static void main(String[] args) {
		
		movie.cast.Director obj = new movie.cast.Director();
		
		obj.assistantdirector();
		obj.co_director();
		
		movie.cast.musicDirector();
		movie i = new movie();
		movie.cast j = i.new cast();
		j.writter();

	}

}
