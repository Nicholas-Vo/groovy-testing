class MyGroovyClass {

    static void main(String... args) {
        println("Groovy supports both classes and scripts")
        System.out.println("Groovy runs on top of Java.")

        def defMsg = "Groovy is optionally typed."
        String hello = "Hello World"

        printMessage(defMsg)
        printMessage(hello)

        StringBuilder builder = new StringBuilder()
        for (aString in args) {
            builder.append(args)
        }

        println(builder)
    }

    static def printMessage(def string) {
        println(string)
    }
}





