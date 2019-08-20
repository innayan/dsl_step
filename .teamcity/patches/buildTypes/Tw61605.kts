package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildStep
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Tw61605'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Tw61605")) {
    params {
        remove {
            param("teamcity.ui.settings.readOnly", "true")
        }
    }

    expectSteps {
        script {
            name = "Step1"
            scriptContent = "echo test"
        }
        script {
            name = "StepAaaaaaaaa"
            scriptContent = "echo testAAAAAA"
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
            name = "StepZ"
            scriptContent = "echo Z"
        }
        script {
            name = "Step111111xxxxxxx"
            scriptContent = "echo xxxxxxxxxxxxxxxxxxxxxxx"
        }
        script {
            name = "StepYYYY"
            scriptContent = "echo YYYYY"
        }
    }
    steps {
        update<BuildStep>(3) {
            enabled = false
        }
    }
}
