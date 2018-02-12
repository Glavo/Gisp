package org.glavo.gisp.parser

import fastparse.WhitespaceApi
import fastparse.all._

trait Basic {
  val White: WhitespaceApi.Wrapper = fastparse.WhitespaceApi.Wrapper(
    P(" " | "\t" | "\r" | "\n" | "\f").rep
  )

  val `(`: P0 = P("(")
  val `)`: P0 = P(")")

  val `[`: P0 = P("[")
  val `]`: P0 = P("]")

  val id = P("")
}
