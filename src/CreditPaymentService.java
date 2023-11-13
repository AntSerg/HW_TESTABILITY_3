public class CreditPaymentService {
    int calculate (double sumOfCredit, double percent, int period) {
        return (int)((sumOfCredit * (percent / 100) / 12) / (1 - 1 / Math.pow(1 + (percent / 100) / 12, period * 12)));
    }
}
