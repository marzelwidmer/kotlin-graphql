package ch.keepcalm.kotlingraphql.service

import ch.keepcalm.kotlingraphql.model.User
import ch.keepcalm.kotlingraphql.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(var userRepository: UserRepository) {

    fun findAll() = userRepository.findAll()

    fun save(user: User) = userRepository.save(user)


}