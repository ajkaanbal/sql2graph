import org.scalatest.FunSuite
import ajk.QueryParser

class Sql2GraphSpec extends FunSuite {

  test("Query Parser should should return table names") {
    val q:String = "select title from post;"
    val query = new QueryParser(q)

    val actual = query.usesTable()
    val expected = "post"

    assert(actual == expected)
  }

}
