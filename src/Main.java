public class Main {
    public static void main(String[] args) {
        int startingScore = 0;
        int replenishmentAmount = 3000;
        int bonusRub = 100;
        int bonus;
        int sumTotal;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / bonusRub;
            sumTotal = startingScore + replenishmentAmount + bonus;
            System.out.println("Сумма счета: " + sumTotal + " руб.; " + "Всего бонусных рублей: " + bonus);
        } else {
            bonus = 0;
            sumTotal = startingScore + replenishmentAmount;
            System.out.println("Сумма счета: " + sumTotal + " руб.; " + "Всего бонусных рублей: " + bonus);
        }
    }
}