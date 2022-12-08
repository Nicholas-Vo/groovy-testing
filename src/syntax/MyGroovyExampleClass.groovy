package syntax

println "17+20*15".parseLR1()

def expressions = ["100*5", "13+18",
                   "(8 - 1 + 3) * 6 - ((3 + 7) * 2)",
                   "89+591"]

expressions.each { expr ->
    println "The answer to $expr is ${expr.parseLR1()}"
}

