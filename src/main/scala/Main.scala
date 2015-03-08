import org.gradle.sample.impl.PersonImpl
import org.gradle.sample.impl.JavaPerson

object Main extends App {
  val scalaPerson = new PersonImpl("Foo Bar")
  println("Hello, " + scalaPerson.getName)
  val javaPerson = new JavaPerson("Hey Duke")
  println("Hello, " + javaPerson.getName())
}
