package cz.petrbalat.els

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokusElsApplication

fun main(args: Array<String>) {
	runApplication<PokusElsApplication>(*args)
}
