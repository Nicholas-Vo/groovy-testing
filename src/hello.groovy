def members = []

for (int i = 0; i < args.size(); i++) {
    members.add(args[i])
}

for (member in members) {
    println("Member: ${capitalize member}")
}

def capitalize(String member) {
    println("Capitilzaing ${member}")
    member.toUpperCase()
}