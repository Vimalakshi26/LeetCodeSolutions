class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for(int i = 1; i<salary.length; i++){
            sum = sum + salary[i];
            if(salary[i] < min){
                min = salary[i];
            }else if(salary[i] > max){
                max = salary[i];
            }
        }

        sum = sum - (max+min);
        double len = (salary.length -2);
        double avg = (double)sum / len;
        return avg;
    }
}