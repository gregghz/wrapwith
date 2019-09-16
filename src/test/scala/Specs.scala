package com.gregghz.wrapwith

import org.scalatest._

@WrapWith(classOf[ConfigMapWrapperSuite])
class MainSpec(configMap: ConfigMap) extends path.FunSpec {

  describe("foo") {
    it("bar") {
      assert(1 === 1)
    }
  }

}
