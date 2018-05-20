package ch.keepcalm.kotlingraphql.service

import ch.keepcalm.kotlingraphql.model.Article
import ch.keepcalm.kotlingraphql.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(var articleRepository: ArticleRepository) {

    fun getAll() = articleRepository.findAll()

    fun save(article: Article) = articleRepository.save(article)


}