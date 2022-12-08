        package syntax

        int number = 100
        assert number.class == Integer

        println "All integers in Groovy are of type java.lang.Integer, because even primitives are objects"

        100.toString()
        125.toDouble()

        def rounded = 3.14159265359.round()
        assert rounded == 3

        def nums = [1, 20, 350, 2500]

        println nums.max()
        println nums.average()
        println nums.contains(20)

        def after = nums - 350
        println after

        def lists = [
                [[], null, nums.size() ?: "nums is null"],
                [10, "Hello World", true, [3, 1, 3], 3.14.round()],
                [328: "Theory of Computation", 327: "Concepts of Programming languages"]
        ]

        println lists
