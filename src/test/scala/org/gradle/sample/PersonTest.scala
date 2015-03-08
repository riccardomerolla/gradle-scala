package org.gradle.sample

import org.scalatest._
import org.gradle.sample.impl.PersonImpl
import org.gradle.sample.impl.JavaPerson

class PersonTest extends FlatSpec with Matchers with
  OptionValues with Inside with Inspectors {

  // FIXME: use a Scala test framework to run a test
  def testCanCreateScalaPersonImpl(): Unit = {
    def person: Person = new PersonImpl("bob smith")
    person
  }

  def testCanCreateJavaPersonImpl(): Unit = {
    def person: Person = new JavaPerson("bob smith")
    person
  }

}
