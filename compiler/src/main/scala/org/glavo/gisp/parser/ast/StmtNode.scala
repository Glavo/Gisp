package org.glavo.gisp.parser.ast

abstract class StmtNode extends Node

final case class DefineStmt(name: String, initExpr: Option[ExprNode] = None) extends StmtNode