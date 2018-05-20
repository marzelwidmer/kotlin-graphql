package ch.keepcalm.kotlingraphql

import ch.keepcalm.kotlingraphql.model.Article
import ch.keepcalm.kotlingraphql.model.User
import ch.keepcalm.kotlingraphql.repository.ArticleRepository
import ch.keepcalm.kotlingraphql.repository.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinGraphqlApplication(var userRepository: UserRepository, var articleRepository: ArticleRepository) {
    @Bean
    fun init() = CommandLineRunner {
        testData(userRepository, articleRepository)
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinGraphqlApplication::class.java, *args)
}


fun testData(userRepository: UserRepository, articleRepository: ArticleRepository) {
   // cleanUp db
    userRepository.deleteAll()
    articleRepository.deleteAll()

    val articles = listOf<Article>(
            Article(title = "Java 8 Lambdas", minutesRead = 2),
            Article(title = "Kotlin and Spring Boot", minutesRead = 10),
            Article(title = "GraphQL for dummies", minutesRead = 55)
    )
    articleRepository.saveAll(articles)

    val users = listOf<User>(
            User(lastName = "Doe", firstName = "John", age = 32, nationality = "de_CH",
                    articlesIds = listOf(articles.get(0).id.toHexString())
            ),
            User(lastName = "Doe", firstName = "Jane", age = 33, nationality = "en_EN",
                    articlesIds = listOf(articles.get(0).id.toHexString(),
                            articles.get(1).id.toHexString(),
                            articles.get(2).id.toHexString()
                    )

            )
    )
    userRepository.saveAll(users)

}