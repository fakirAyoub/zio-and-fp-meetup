package dev.fakir.ziofp

import zio.{Scope, ZIO, ZIOAppArgs, ZIOAppDefault}

object ZIOSpark extends ZIOAppDefault {
  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = {
    for {
      sparkSession <- ???
    } yield ()
  }
}
