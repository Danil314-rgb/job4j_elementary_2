package oop;

import array.EndWith;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка найдена: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        System.out.println();
        Error error404 = new Error(true, 404, "Страница не найдена");
        error404.printInfo();
        System.out.println();
        Error error405 = new Error(true, 405, "Метод не разрешён");
        error405.printInfo();
        System.out.println();
        Error error01 = new Error(false, -1, "Не обнаружено");
        error01.printInfo();
    }
}
