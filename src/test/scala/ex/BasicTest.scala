package ex

import org.scalatest.FunSuite
import ipo.Address
import scala.xml.NodeSeq


class BasicTest extends FunSuite {

  test("basic") {
    val subject = <shipTo xmlns="http://www.example.com/IPO">
      <name>Foo</name>
      <street>1537 Paper Street</street>
      <city>Wilmington</city>
    </shipTo>

    val shipTo: Address = scalaxb.fromXML[ipo.Address](subject)
    val document: NodeSeq = scalaxb.toXML[ipo.Address](shipTo.copy(name = "Bar"), None, Some("foo"), ipo.defaultScope)

    println(document)
  }
}



