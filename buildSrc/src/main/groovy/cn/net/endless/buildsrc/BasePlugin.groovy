package cn.net.endless.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

public class BasePlugin implements Plugin<Project> {

    public static Project mProject;

    @Override
    void apply(Project project) {
        mProject = project
        project.extensions.create("Lib", LibPluginExtension.class)
    }
}
