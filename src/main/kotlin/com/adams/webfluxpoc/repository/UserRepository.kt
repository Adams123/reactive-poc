package com.adams.webfluxpoc.repository

import com.adams.webfluxpoc.data.User
import org.springframework.data.r2dbc.repository.R2dbcRepository
import java.util.*

interface UserRepository : R2dbcRepository<User, UUID>