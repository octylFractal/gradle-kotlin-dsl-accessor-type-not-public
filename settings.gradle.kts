pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "gradle-kotlin-dsl-accessor-type-not-public"
if (System.getProperty("groovy") != null) {
    include("lib-groovy")
    project(":lib-groovy").name = "lib"
} else {
    include("lib")
}
