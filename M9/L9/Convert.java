package M9.L9;
public class Convert {
    //post condition: returns the amount of the tip
    public double calcTip(double percent, double mealCost)
    {
        //complete the code for the first method here
        return mealCost * (percent / 100);
    }
    //second method to be written here
    public double calcTip(double mealCost) {
        return mealCost * (17.5 / 100);
    }
}   