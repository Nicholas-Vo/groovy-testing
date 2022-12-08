package features

def input = """
    Grammar 1
    S  ::=  A S B
    S  ::=  lambda  
    A  ::=  a A 
    A  ::=  k  
    B  ::=  b B 
    B  ::=  t
    """

def pattern = /.  ::=/
def result = input =~ pattern
println()

// Print the results of the match
println "Matched: ${result.size()}"
result.each { match -> println match }



