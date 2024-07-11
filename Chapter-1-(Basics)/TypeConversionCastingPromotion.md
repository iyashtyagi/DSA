
## Type conversion - Also know as widening/implicit conversion
Conversion happens when:

1. Type compatiable
2. destination type > source type

`for eg: float num = 134;`

`byte -> short -> int -> float -> long -> double`

  

## Type casting - aslo known as narrowing/explicit conversion

`for eg: int marks = (int)(99.99f);`


## Type Promotion in Expressions

1. Java automatically promote each `byte`, `short`, or `char` operand to `int` when evaluating an expression.

2. If one operand is `long`, `float` or `double` the whole expression is promoted to `long`, `float`, or `double` respectively.