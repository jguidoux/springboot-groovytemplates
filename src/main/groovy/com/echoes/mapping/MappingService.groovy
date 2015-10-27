package com.echoes.mapping

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping

/**
 * Created by jguidoux on 27/10/15.
 */
@Service
class MappingService {

    @Autowired
    RequestMappingHandlerMapping handlerMapping;

    Set findAllMappings() {
        def mappings = []
        this.handlerMapping.getHandlerMethods().each { key, value ->
            mappings << new Mapping(methodName: key.methodsCondition.methods, url: key.patternsCondition.patterns)

        }
        mappings
    }
}
