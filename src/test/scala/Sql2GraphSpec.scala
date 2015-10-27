import org.scalatest.FunSuite
import ajk.QueryParser

class Sql2GraphSpec extends FunSuite {

  test("Query Parser should should return database names") {
    val q:String = "select title from `database1`.post;"
    val query = new QueryParser(q)

    val actual = query.usesDatabase()
    val expected = ""

    assert(actual == expected)
  }

}
