/**
   A coin with a monetary value.
*/
public class Coin implements Measurable
{
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double value, String name) 
   {
      this.value = value;
      this.name = name;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue()
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName()
   {
     return name;
   }

   public double getMeasure()
   {
      return value;
   }

   private double value;
   private String name;
}
