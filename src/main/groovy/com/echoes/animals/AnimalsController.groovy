package com.echoes.animals

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

/**
 * Created by jguidoux on 25/10/15.
 */

@RestController
class AnimalsController {


    @Resource(name = "catConfig")
    def config


    @RequestMapping("/cats")
     Cat getCats(@RequestParam(value="name", defaultValue="halyna") String _name,
                        @RequestParam(value="age", defaultValue="2") String _age) {
       new Cat(name: config.prefix + _name + config.suffix, age: _age)
    }
}
