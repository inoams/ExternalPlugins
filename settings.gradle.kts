rootProject.name = "public"

include(":AutoPrayFlick")
include(":CustomSwapper")
include(":Flexo")
include(":ItemDropper")
include(":LeftClickCast")
include(":NeverLog")
include(":NyloSwapper")
include(":OlmSwapper")
include(":OneClick")

for (project in rootProject.children) {
    project.apply {
        projectDir = file(name)
        buildFileName = "${name.toLowerCase()}.gradle.kts"

        require(projectDir.isDirectory) { "Project '${project.path} must have a $projectDir directory" }
        require(buildFile.isFile) { "Project '${project.path} must have a $buildFile build script" }
    }
}