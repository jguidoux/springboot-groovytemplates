layout 'layouts/main.tpl',
        pageTitle: 'server mappings',
        mainBody: contents {
            div(class: 'container') {
                h3('Spring MVC 3.1 Demo Endpoints')
                div {
                   table {
                       tr {
                           th("path")
                           th("methods")
                           th("consumes")
                           th("produces")
                           th("params")
                           th("headers")
                       }

                       handlerMethods.each { entry ->
                           tr {
                               td(entry.key.patternsCondition.patterns)
                               td(entry.key.methodsCondition.methods)
                               td(entry.key.consumesCondition.expressions)
                               td(entry.key.producesCondition.expressions)
                               td(entry.key.paramsCondition.expressions)
                               td(entry.key.headersCondition.expressions)
                               td(entry.key.patternsCondition.patterns)
                           }
                       }
                   }
                }
            }
        }

