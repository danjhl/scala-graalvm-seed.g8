package example

import org.scalatest._

class TestSpec extends FunSpec with Matchers {
  describe("Test") {
    it("should be equal") {
      10 shouldEqual 10
    }
  }
}
