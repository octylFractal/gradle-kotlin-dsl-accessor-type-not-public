internal open class MyExt {
    fun myThing() {
        println("Accessor is working A-OK!")
    }
}

project.extensions.create<MyExt>("myPlugin")
