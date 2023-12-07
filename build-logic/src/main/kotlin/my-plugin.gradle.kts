internal open class MyExt {
    fun getDependencies(): String = "extension dependencies"
}

project.extensions.create<MyExt>("myPlugin")
