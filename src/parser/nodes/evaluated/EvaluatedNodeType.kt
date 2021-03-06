package parser.nodes.evaluated

import parser.structure.AbstractTokenHolderPattern
import tokens.patterns.values.immutable_values.StringTokenPattern
import tokens.patterns.values.immutable_values.primitive_values.BooleanTokenPattern
import tokens.patterns.values.immutable_values.primitive_values.CharacterTokenPattern
import tokens.patterns.values.immutable_values.primitive_values.DoubleTokenPattern
import tokens.patterns.values.immutable_values.primitive_values.IntTokenPattern

enum class EvaluatedNodeType {
    IntegerType,
    LongType,
    FloatType,
    DoubleType,
    StringType,
    CharacterType,
    BooleanType;

    fun typeMatches(comparedValue: AbstractTokenHolderPattern<*>): Boolean {
        if (comparedValue is EvaluatedNodePattern) return this == comparedValue.getNodeType()
        if (comparedValue is EvaluatedNodeTypeWrapper) return this == comparedValue.type

        return comparedValue == when (this) {
            StringType -> StringTokenPattern
            IntegerType -> IntTokenPattern
            BooleanType -> BooleanTokenPattern
            DoubleType -> DoubleTokenPattern
            CharacterType -> CharacterTokenPattern

            else -> throw RuntimeException("Cannot match $comparedValue to $this")
        }
    }
}