

    class MyGroovyClass {

        static void main(String... args) {
            println 'Groovy supports classes.'
            System.out.println("Groovy runs on top of Java.\n")

            def message = "Groovy is a great language to learn"
            println message
            println message.removeVowels()

            StringBuilder sb = new StringBuilder()

            for (aString in args) {
                sb.append(aString)
            }

            println(sb)
        }

    }



