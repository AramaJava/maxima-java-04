package org.example;

public class App 
{
    public static void main( String[] args )
    {

 /*      Собрать архив jar из модуля 2, инсталлировать его в локальный репозиторий
        и подключить его как зависимость к текущему проекту.

        Описать класс Train, потомок класса Transport из модуля 2.

        Описать свойства String id, int carriageCount, boolean isExpress.
        Подключить к проекту внешнюю зависимость — Lombok из внешнего репозитория

        Использовать аннотации Lombok для добавления всех геттеров, сеттеров,
        метода toString() и конструктора со всеми аргументами
*/

        Train poezd = new Train("Дизель", 2,true);
        System.out.println(poezd);



    }
}
