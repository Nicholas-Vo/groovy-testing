import groovy.io.FileType

File dir = new File(getClass().protectionDomain.codeSource.location.path).parent as File
println "Directory: ${dir}"

def count = 0
dir.eachFileRecurse(FileType.FILES) { file ->
    count++
}

println "You are about to delete ${count} files. Are you sure? {Y/N}"

def answer = System.in.newReader().readLine()
if (answer != 'Y') {
    return
}

dir.eachFileRecurse(FileType.FILES) { file ->
    file.delete()
}




