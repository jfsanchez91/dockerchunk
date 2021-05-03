package com.zonnesoft

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.zonnesoft")
		.start()
}

