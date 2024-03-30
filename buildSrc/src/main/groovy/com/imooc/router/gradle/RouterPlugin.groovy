package com.imooc.router.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project> {

    //实现apply方法，注入插件的逻辑
    @Override
    void apply(Project project) {
        println("我来自于 routerPlugin, apply from ${project.name}")

        // 注册Extension
        project.getExtensions().create("router", RouterExtension)

        // 获取Extension
        project.afterEvaluate {
            RouterExtension routerExtension = project["router"]

            println("用户设置的wiki路径:${routerExtension.wikiDir}")
        }

    }
}
