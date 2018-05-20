package ch.keepcalm.kotlingraphql.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document

@TypeAlias("article") // MongoDb _class name without package
@Document(collection = "articles")
data class Article(
        var id: ObjectId = ObjectId(),
        val title: String? = null,
        val minutesRead: Int? = null,
        val authorId: String? = null
)