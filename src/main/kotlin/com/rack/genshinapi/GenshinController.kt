package com.rack.genshinapi

import com.rack.genshinapi.entities.GenshinCharacterEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class GenshinController(@Autowired internal var service: GenshinService) {

    @PostMapping("/character/{name}")
    fun postCharacter(
            @PathVariable("name") name: String,
            @RequestBody character: GenshinCharacterEntity
            ) {
        service.addCharacter(character)
    }

    @GetMapping("/character/{name}")
    fun getCharacter(@PathVariable("name") name: String): String? {
        return service.getCharacter()
    }
}