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

}
