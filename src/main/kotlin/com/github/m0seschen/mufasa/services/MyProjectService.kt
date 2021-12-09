package com.github.m0seschen.mufasa.services

import com.intellij.openapi.project.Project
import com.github.m0seschen.mufasa.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
