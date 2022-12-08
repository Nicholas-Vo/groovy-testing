

        package syntax

        [1, 2, 3, 4, 5].each {it -> println(it)}

        println(["Hello", "World", "!"])

        def nums = [10, 20, 30, 100, 25000]

        println "Maximum number is ${nums.max()}"

        def groupMembers = ["Dylan", "Nick", "Jakub"] as String[]
        def after = groupMembers - "Dylan" // Example of operator overloading

        println "Group member array after subtraction: $after"

        def found = groupMembers.find { it =~ "Nick" }
        println found

