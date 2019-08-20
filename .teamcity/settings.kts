import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2019.1"

project {

    buildType(Tw61605)

    template(Tw61605_2)
}

object Tw61605 : BuildType({
    name = "TW-61605t"
    description = "View DSL action changes settings on disk (stores inherited build steps as overridden) when step editing is disabled"

    steps {
        script {
            name = "Step1"
            scriptContent = "echo test"
        }
        script {
            name = "Step2"
            scriptContent = "echo 2"
        }
        step {
            name = "Dynamic Library Build6"
            type = "PowerShell"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            param("script.content", "")
        }
        script {
            name = "Step1"
            scriptContent = "echo test"
        }
       
        script {
            name = "Step111111xxxxxxx"
            id = "RUNNER_77"
            scriptContent = "echo xxxxxxxxxxxxxxxxxxxxxxx"
        }
    }
})

object Tw61605_2 : Template({
    name = "TW-61605"

    steps {
        script {
            name = "Step1"
            id = "RUNNER_32"
            scriptContent = "echo test"
        }
        script {
            name = "Step2"
            id = "RUNNER_33"
            scriptContent = "echo 2"
        }
        script {
            name = "Step3"
            id = "RUNNER_34"
            scriptContent = "echo 3"
        }
        script {
            name = "Step4"
            id = "RUNNER_35"
            scriptContent = "echo 4"
        }
    }
})
