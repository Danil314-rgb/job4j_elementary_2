package condition;

public class SwitchWeek {

    public static void main(String[] args) {
        System.out.println(nameOfDay(2));
        System.out.println(nameOfDay(22));
        System.out.println(nameOfDay(-4));

    }

    public static String nameOfDay(int day) {
        String dayWeek;
        switch (day) {
            case 1:
                dayWeek = "Понедельник";
                break;
            case 2:
                dayWeek = "Вторник";
                break;
            case 3:
                dayWeek = "Среда";
                break;
            case 4:
                dayWeek = "Четверг";
                break;
            case 5:
                dayWeek = "Пятница";
                break;
            case 6:
                dayWeek = "Суббота";
                break;
            case 7:
                dayWeek = "Воскресенье";
                break;
            default:
                dayWeek = "Ошибка";
                break;
        }
        return dayWeek;

    }
}
