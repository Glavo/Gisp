package org.glavo.gisp.parser.ast

import java.io.OutputStream


trait Node {
  def genByteCode(outputStream: OutputStream): Unit = {}
}


