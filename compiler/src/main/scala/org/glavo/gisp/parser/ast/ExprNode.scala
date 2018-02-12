package org.glavo.gisp.parser.ast

abstract class ExprNode extends Node

case class ApplyExpr(fun: ExprNode, args: Seq[ExprNode]) extends ExprNode

case class WhenExpr(pairs: Seq[(ExprNode, StmtNode)]) extends ExprNode

case class TryCatchExpr(block: StmtNode) extends ExprNode