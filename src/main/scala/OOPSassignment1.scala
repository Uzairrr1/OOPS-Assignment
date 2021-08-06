trait  Ordered{
  def check(p: Person): Unit
}
class Person(val name: String, val age: Int) extends Ordered {
  def check(p: Person): Unit = {

    if(this.name.equals(p.name)) {
      if (this.age.equals(p.age))
        println("true")
      else
        println("false")
    }
    else
      println("false")
  }
}
object Oops {
  def main(args: Array[String]): Unit = {
    var p1 = new Person("Mohd", 21)
    var p2 = new Person("Uzair", 23)
    p1.check(p2)
  }
}
