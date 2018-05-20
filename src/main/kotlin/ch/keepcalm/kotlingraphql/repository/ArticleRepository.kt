package ch.keepcalm.kotlingraphql.repository

  import ch.keepcalm.kotlingraphql.model.Article
  import org.bson.types.ObjectId
  import org.springframework.data.repository.PagingAndSortingRepository


interface ArticleRepository : PagingAndSortingRepository<Article, ObjectId>