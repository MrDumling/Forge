package tokens.patterns.operators.binary_operators.math_operators

object DivideOperator : MathOperator() {
    override val matchedPattern = Regex("/")
}