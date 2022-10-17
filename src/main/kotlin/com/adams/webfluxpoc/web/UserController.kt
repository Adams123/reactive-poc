package com.adams.webfluxpoc.web

import com.adams.webfluxpoc.data.User
import com.adams.webfluxpoc.repository.UserRepository
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/user")
class UserController(
    private val userRepository: UserRepository
) {

    private val log = KotlinLogging.logger {  }

    @GetMapping
    fun findAll() : Flux<User> {
        log.info { "Finding all" }
        return userRepository.findAll()
    }
}