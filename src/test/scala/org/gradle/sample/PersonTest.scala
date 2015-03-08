package org.gradle.sample

import org.scalatest._
import org.gradle.sample.impl.PersonImpl
import org.gradle.sample.impl.JavaPerson

class PersonTest extends FunSuite {

  test("Can create Scala PersonImpl") {
    def person: Person = new PersonImpl("bob smith")
    assert(Nil != person)
  }

  test("Can create Java PersonImpl") {
    def person: Person = new JavaPerson("bob smith")
    assert(Nil != person)
  }

}
