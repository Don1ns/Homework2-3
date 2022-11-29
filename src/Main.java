public class Main {
    public static void main(String[] args) {
        //Задача 6.
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + boxersWeight);
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе " + differenceWeight);
        //Задача 7.
        var differenceWeightFirstWay = secondBoxerWeight - firstBoxerWeight;
        System.out.println("(1 способ) Разница в весе " + differenceWeightFirstWay);
        var differenceWeightSecondWay = secondBoxerWeight % firstBoxerWeight;
        System.out.println("(2 способ) Разница в весе " + differenceWeightSecondWay);
        //Задача 8.
        var amountHours = 640;
        var oneWorkerHours = 8;
        var amountWorkers = amountHours / oneWorkerHours;
        System.out.println("Всего работников в компании - " + amountWorkers +" человек");
        amountWorkers +=94;
        amountHours = amountWorkers * oneWorkerHours;
        System.out.println("Если в компании работает " + amountWorkers + " человек, то всего " + amountHours + " часов работы может быть поделено между сотрудниками");
    }
}