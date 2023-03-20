public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity]; // Create an array for the array variable score
      scoresSize = 0; // Initalize scoreSize = 0
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      /*
       * This if-else statement test the if the current score size after variable is added is 
       * smaller than the length constraint of the array
       * If it is smaller it will return true, else it will return false
       */
	  if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0; //Initialize the accumulator to 0
      
      //This for loop will repeat based on the score after value has been added and add all values
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total; // Return the final sum
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      /*
       * This small if statement will return 0 if there are no values added to the scores array or
       * if the current score size is 0
       */
	  if (scoresSize == 0) return 0;
      
	  /*
	   * Based on the if statement it will 
	   */
	  double smallest = scores[0];
      
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
   
   /**
    * Returns the score size
    * @return the score size
    */
   public int getScoreSize()
   {
	   return scoresSize;
   }
   
   /**
    * List all the scores assigned to the array in a a string with each score seperated by a space
    * @return the score list as a string
    */
   public String toString()
   {
	   String scoreList = "";
	   for(int i = 0; i < scoresSize; i++) {
		   scoreList += scores[i] + " ";
	   }
	   return scoreList;
   }
}
