public class CreditPaymentService {
    public double calculate (int credit, int period, double percent) {
        int TimeMon = period * 12; // кол-во периодов, в течение которых выплачивается кредит
        double MonthPercent = percent / 12 / 100; // ставка по кредиту в месяц
        double ratioAn = (MonthPercent * Math.pow(1 + MonthPercent, TimeMon)) / (Math.pow(1 + MonthPercent, TimeMon) - 1);// коэффициент аннуитетного платежа
        double payment = ratioAn * credit; // рассчет ежемесячного платежа
        return payment;
    }
}
