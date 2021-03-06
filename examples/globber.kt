#!/usr/bin/env blaze

import org.slf4j.Logger
import com.fizzed.blaze.Contexts
import com.fizzed.blaze.Contexts.baseDir
import com.fizzed.blaze.util.Globber.globber

class globber {
    val log = Contexts.logger()

    fun main() {
        globber(baseDir(), "*.{java,js,groovy,kt,kts}")
            .filesOnly()
            .visibleOnly()
            .scan()
            .sorted()
            .forEach({ p -> 
                log.info("{}", p)
            })
    }
    
}