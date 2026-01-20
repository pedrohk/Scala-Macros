## **Why Scala Has Macros**

* Boilerplate grows fast
* Runtime reflection is slow and unsafe
* Many errors appear too late
* **Idea:** move logic from runtime to compile time


## **What Is a Macro?**

* A program that **runs at compile time**
* Takes Scala code as input
* Produces **typed Scala code** as output
* Expanded code is compiled normally


## **Where Macros Run**

* Compilation pipeline:

    * Source code
    * **Macro expansion**
    * Type checking
    * Bytecode
* No runtime overhead
* No reflection involved

---

## **Scala 2 vs Scala 3 Macros**

* Scala 2:

    * Compiler internals
    * Fragile, unsafe
* Scala 3:

    * Official, stable API
    * Typed ASTs
    * First-class language feature
* Macros are now *designed*, not hacked

---

## **Core Building Blocks (Scala 3)**

* `inline`

    * Triggers compile-time expansion
* Quotes `'(...)`

    * Code as data (`Expr[T]`)
* Splices `$`

    * Data back to code
* **Code ⇄ Data ⇄ Code**

---

## **What a Macro Can “See”**

* Syntax structure, not values
* Expressions, types, trees
* Pattern matching on code
* Compile-time type information

---

## **SDeep Example: Compile-Time Debug**

* Input:

    * `debug(a + b)`
* Macro sees:

    * Expression structure: `a + b`
* Generated code:

    * Prints expression
    * Prints value
* Impossible with normal functions

---

## **Why This Matters**

* Compile-time validation

    * SQL, regex, config keys
* Zero-cost abstractions

    * Logging, metrics
* Automatic derivation

    * JSON codecs, schemas

---

## **SReal-World Usage**

* Scala standard library
* ZIO
* Circe
* Shapeless 3
* Doobie, Quill

---

## **Limits & Trade-offs**

* Cannot access runtime data
* No I/O
* Increases compile time
* Adds conceptual complexity
* Use only when necessary

---

## **Key Takeaways**

* Macros run at compile time
* Generate safe, typed code
* Remove runtime cost
* Shift errors left
* Powerful tool — use with care

---

