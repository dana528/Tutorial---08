object my_app  extends App{

  val p1 = Point(1,2)
  val p2 = Point(2,3)
  val p3 = p1.move(1,1)
  val p4 = p1.distance(p2)

  println("p1 = " + p1)
  println("p2 = " + p2)
  println( "p1+p2 = " + (p1+p2) )
  println( "p3 = p1.move(1,1) =  " + p3)
  println(p4)

  p1.invert()
  println(p1)
}

case class Point(a:Int, b:Int)
{
  def x: Int = a
  def y: Int = b

  /* move a point by given distance dx and dy */
  def move( dx:Int, dy:Int) = Point( this.x+dx, this.y+dy)

  /* add two given points */
  def +(that:Point) = Point( this.x+that.x, this.y+that.y)

  /* find distance between two given  points */
  
  
   def distance(p1:Point) = {
   var x1 = this.x - p1.x
   var y1 =  this.y - p1.y
   var dist = x1*x1 + y1*y1
    scala.math.sqrt(dist)
   }


  /* invert part */
 def invert():Unit = {
    var tmp  = this.x
    this.x = this.y
    this.y = tmp
  }
  
}

