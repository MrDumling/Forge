package parser.statements.statement_patterns

import parser.statements.statement_patterns.declaration.FloatingPointTypeDeclarationPattern
import parser.statements.statement_patterns.declaration.IntTypeDeclarationPattern
import parser.statements.statement_patterns.declaration.StringTypeDeclarationPattern

object StatementPatternImpl {
    val statementPatternList =
        arrayOf(IntTypeDeclarationPattern, StringTypeDeclarationPattern, FloatingPointTypeDeclarationPattern)
}