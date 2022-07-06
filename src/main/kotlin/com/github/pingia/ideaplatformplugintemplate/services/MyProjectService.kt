package com.github.pingia.ideaplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.pingia.ideaplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
