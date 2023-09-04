package jiujitsu.gi.shoyoroll

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class ShoyorollApplication

fun main(args: Array<String>) {
    runApplication<ShoyorollApplication>(*args)
}
