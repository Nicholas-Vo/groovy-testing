package features

class Main {
    static void main(String... args) {
        def tracker = new GPATracker()

        def andrew = tracker.getAndrew()
        println "Andrew's GPA is ${andrew}"
    }
}

class GPATracker {

    static def gpaMap = [
            "Andrew": 4.0,
            "Dylan" : 3.4,
            "Robert": 2.9
    ]

    def methodMissing(String name, Object args) {
        def student = name - "get"
        return gpaMap[student]
    }

}

