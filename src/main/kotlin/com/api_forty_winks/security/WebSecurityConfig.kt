package com.api_forty_winks.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import com.auth0.spring.security.api.JwtWebSecurityConfigurer
import org.springframework.beans.factory.annotation.Value


@Configuration
@EnableWebSecurity
open class WebSecurity : WebSecurityConfigurerAdapter() {

    @Value("\${auth0.audience}")
    private val audience: String? = null

    @Value("\${auth0.issuer}")
    private val issuer: String? = null

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.cors()

        JwtWebSecurityConfigurer
            .forRS256(audience, issuer)
            .configure(http)
            .authorizeRequests()
            .antMatchers("/private/**").authenticated()
}
}