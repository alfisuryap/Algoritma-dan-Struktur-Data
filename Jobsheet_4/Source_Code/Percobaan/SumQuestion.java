package Jobsheet_4.Source_Code.Percobaan;

public class SumQuestion {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    public double totalBF(double arr[]){
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        return total;
    }
    public double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
