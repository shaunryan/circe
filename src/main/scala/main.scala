import io.circe.Json

object main extends App{

  val jsonString: Json = Json.fromString("scala exercises")
  val jsonDouble: Option[Json] = Json.fromDouble(1)
  val jsonBoolean: Json = Json.fromBoolean(true)

  val fieldList = List(
    ("key1", Json.fromString("value1")),
    ("key2", Json.fromInt(1))
  )
  val jsonFromFields: Json = Json.fromFields(fieldList)

  println(jsonFromFields.noSpaces)
  println(jsonFromFields.spaces2)
  println(jsonFromFields.spaces4)
 /**********************************************************/

 val jsonArray: Json = Json.fromValues(List(
   Json.fromFields(List(("field1", Json.fromInt(1)))),
   Json.fromFields(List(
     ("field1", Json.fromInt(200)),
     ("field2", Json.fromString("Having circe in Scala Exercises is awesome"))))))

  println(jsonArray)

  def transformJson(jsonArray: Json): Json =
    jsonArray mapArray { oneJson: Vector[Json] =>
      oneJson.init
    }

  println(transformJson(jsonArray).noSpaces)
}
