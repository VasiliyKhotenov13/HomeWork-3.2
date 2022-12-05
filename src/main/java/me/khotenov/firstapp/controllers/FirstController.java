package me.khotenov.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/project/info")
    public String projectInfo() {
        String projectName = "Приложение: Книга рецептов.";
        String projectFunction = "Хранение базы рецептов кухни народов мира.";
        String projectTechnology = "Язык: Java. Конструктор: Maven.";
        String projectLanguage = "Java version 17.0.5.";
        return  projectName + "\n" +
                "Функции приложения: " + projectFunction + "\n" +
                "Технологии - " + projectTechnology + "\n" +
                "Язык программирования: " + projectLanguage;
    }

    @GetMapping("/")
    public String runApp() {
        return "Приложение запущенно...";
    }

    @GetMapping("/info")
    public String info() {
        String myName = "Хотенов Василий";
        String projectName = "Приложение: Книга рецептов.";
        String creatDate = "05.12.2022г.";
        String projectInfo = "Приложение для сайта рецептов.";
        return "Имя студента: " + myName + " " +
                projectName + " " +
                "Создан: " + creatDate + " " +
                projectInfo;
    }

}
