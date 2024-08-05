public class FinancialForecasting {
    
    public static double calculateFutureValue(double initialValue, double growthRate, int period){
        if(period==0)
            return initialValue;
        return calculateFutureValue(initialValue*(1+growthRate), growthRate, period-1);
    }
    public static void main(String[] args) throws Exception {
        double initialValue=1000;
        double growthRate=0.2624; //26.24%
        int period=5;
        System.out.print("Initial Value : "+initialValue+" becomes : "+Math.round(calculateFutureValue(initialValue, growthRate, period)*100)/100);
        // System.out.printf("%.2f",calculateFutureValue(initialValue, growthRate, period));
    }
}
