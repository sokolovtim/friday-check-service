import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /* Таким образом можно обозначать комментарии в коде программы, которые могут
        давать дополнительные пояснение и не влияют на ход выполнения программы */

        // LocalDate.now() позволяет получить текущую дату и далее мы кладем это значение в переменную currentDate
        LocalDate currentDate = LocalDate.now();

        // Метод System.out.println() - позволяет выводить любой текст в консоль
        System.out.println("Сегодняшняя дата: " + currentDate);

        // Метод getDayOfWeek() - позволяет получить день недели для даты currentDate (которая является, текущей датой)
        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();

        // Здесь мы выводим в консоль значение текущего дня недели
        System.out.println("День недели: " + currentDayOfWeek);

        if (DayOfWeek.FRIDAY == currentDayOfWeek) { // Здесь мы делаем проверку на то, что текущий день недели = пятнице
            // Если это так, то мы выводим данный текст
            System.out.println("Да здравствует пятница!");
        } else {
            // А если это не так, то мы выводим вот такой текст
            System.out.println("Увы, " + currentDayOfWeek + " - это не пятница..");
        }
    }
}