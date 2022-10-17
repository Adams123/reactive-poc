package com.adams.webfluxpoc.data

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "Users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "UUID default gen_random_uuid()")
    var id: UUID? = null,

    @Column
    var email: String,
    @Column
    var name: String,
    @Column
    var password: String,
    @Column
    var age: Int,
    @Column
    var salary: Double
) : Serializable