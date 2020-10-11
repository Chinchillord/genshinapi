package com.rack.genshinapi

import com.rack.genshinapi.entities.GenshinCharacterEntity
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

@Service
class GenshinService {
    private var character: GenshinCharacterEntity? = null

    @Bean
    fun moshi(): Moshi {
        return Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    }

    fun addCharacter(character: GenshinCharacterEntity) {
        this.character = character
    }

    fun getCharacter(): String? {
        val adapter = moshi().adapter<GenshinCharacterEntity>(GenshinCharacterEntity::class.java)
        val characterString = adapter.toJson(this.character)
        return characterString
    }
}