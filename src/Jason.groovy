


        import groovy.json.JsonSlurper

        def jsonSlurper = new JsonSlurper()
        def account = jsonSlurper.parseText('{"id":"123","createdAt":"2018-01-01T02:00:00+0000"}') as Account

        println(account)

        class Account {
            def id;
            def createdAt;
        }



