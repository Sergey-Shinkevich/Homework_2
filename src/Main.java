public class Main {
    public static void main(String[] args) {
        // Первая задача
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Вторая задача
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Третья задача
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Четвертая задача
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Пятая задача
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Шестая задача
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var boxersWeight = boxerFirst + boxerSecond;
        var boxersDifference = boxerSecond - boxerFirst;
        System.out.println(boxersWeight);
        System.out.println(boxersDifference);
        // Седьмая задача
        var firstDifference = boxerSecond - boxerFirst;
        var secondDifference = boxerSecond % boxerFirst;
        System.out.println(firstDifference);
        System.out.println(secondDifference);
        // Восьмая задача
        var totalTime = 640;
        var hoursOneEmployee = 8;
        var numberEmployees = totalTime / hoursOneEmployee;
        System.out.println("Всего работников в компании " + numberEmployees + " человек");
        numberEmployees = numberEmployees + 94;
        totalTime = numberEmployees * hoursOneEmployee;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + totalTime
                + " часов работы может быть поделено между сотрудниками");
    }
}