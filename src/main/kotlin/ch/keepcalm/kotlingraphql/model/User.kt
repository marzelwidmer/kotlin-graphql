package ch.keepcalm.kotlingraphql.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@TypeAlias("user") // MongoDb _class name without package
@Document(collection = "users")
data class User(
        var id: ObjectId = ObjectId(),
        var firstName: String,
        var lastName: String,
        var age: Int,
        var createdAt: LocalDateTime = LocalDateTime.now(),
        var nationality: String,
        var friendsIds: List<String> = listOf(),
        var articlesIds: List<String> = listOf()
)

