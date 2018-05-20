package ch.keepcalm.kotlingraphql.repository

  import ch.keepcalm.kotlingraphql.model.User
  import org.bson.types.ObjectId
  import org.springframework.data.repository.PagingAndSortingRepository


interface UserRepository : PagingAndSortingRepository<User, ObjectId>