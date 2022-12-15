package dev.fakir.ziofp

import zio.{Scope, ZIO, ZIOAppArgs, ZIOAppDefault}

// ZIO [R, E, A] ==>
// UIO[A] => ZIO[Any, Nothing, A]
// Task[A] => ZIO[Any, Throwable, A]
// RIO[???] => ZIO[R, Throwable, A]
// ZIO[R, E, Nothing]
// IO[E, A] => ZIO[Any, E, A]
object ZIOIntro extends ZIOAppDefault {
  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = ???
}
