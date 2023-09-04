package jiujitsu.gi.shoyoroll.core.infra.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding

@ConfigurationProperties(prefix = "redis")
@ConfigurationPropertiesBinding
class RedisProperty(
    val local: Local,
) {
    data class Local(
        val host: String,
        val port: Int,
    )
}
