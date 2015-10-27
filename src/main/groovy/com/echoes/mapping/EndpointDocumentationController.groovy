package com.echoes.mapping

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by jguidoux on 26/10/15.
 */
@RestController
class EndpointDocumentationController {

    @Autowired
    MappingService mappingService;

    @RequestMapping("mappings")
    Set mappings() {
        mappingService.findAllMappings()
    }
}
