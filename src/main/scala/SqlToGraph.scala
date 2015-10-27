package ajk

import com.stephentu.sql._

object Sql2Graph{

// """
//     val parser = new SQLParser()
//
//     val q = parser.parse(q1)
//     q.foreach(i => println("Projections ->" + i.projections))
//     q.foreach(i => println("Projections ->" + i.relations))
//     // println(parser.parse(q1).get)
//     return "AB";
// }

  def main(args: Array[String]){
    // val graph = new QueryParser("select from x;")
  }
}

class QueryParser(val query: String) {
    val parser = new SQLParser()
    val queryParsed = parser.parse(query)

    def usesTables():List[String] = {
      println(queryParsed.get.relations.get)
      // queryParsed.get.relations.get.foreach(x => x.name)
    }
}
