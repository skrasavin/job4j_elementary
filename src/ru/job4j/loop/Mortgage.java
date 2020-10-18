package ru.job4j.loop;
/*Пример:
        Вы взяли кредит на 100 рублей под кредитную ставку 50% в год. Каждый год вы зарабатываете 120 рублей.
        К концу года нужно заплатить 150 рублей. За первый год вы выплатите 120 рублей.
        На второй год останется заплатить 30 рублей. Итого: 2 года на погашение кредита.
        Объяснение:
        Вы должны использовать цикл while: в теле цикла произвести вычисление кредитной суммы за год плюс остатка.
*/
 public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int overpayment = (int) (amount * percent / 100) + amount;
        while (overpayment > 0) {
            overpayment -= salary;
            year++;
        }
        return year;
    }
}