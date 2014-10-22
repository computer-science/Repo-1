/** The Rectangle class defines toString, rotate
    and getArea methods 
**/
   public class Rectangle
   {
      private int height, width;
  
		public Rectangle( )
		{
			height  = 1;
			width   = 1;
			
		}
          
		//Sets instance fields
		public void setHeight( int len)
		{
			height = len;
		}
		public void setWidth( int wid)
		{
			width = wid;
		}
		// Returns the value of the instance fields
		public int getWidth()
		{
			return width;
		}
		public int getHeight()
		{
			return height;
		}
		
		//Computes and returns area of rectangle
		public int getArea ()
		{
			return height * width;
		}
		public String toString()
		{
			return "["+height+"x"+width+"]";
		}
   }