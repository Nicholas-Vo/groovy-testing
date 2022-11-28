class MyGroovyClass {
    static void main(String... args) {
        println 'Groovy supports classes.'

        System.out.println("Groovy runs on top of Java.");

        StringBuilder sb = new StringBuilder()

        List<String> javaList = List.of("This", "is", "a", "Java", "list")

        for (string in javaList) {
            sb.append(string)
        }

        println ""
    }
}
