package com.myscalaproject.helloworldwithscalaloggin
import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLoggin extends App with LazyLogging {
  logger.info("Hello World from Scala Logging")
}
