plugins {
    id("my-java-library") // applies id("java")
}

dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
}

