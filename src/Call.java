public class Call {

        double[] cost = new double[3];
        int[] time = new int[3];
        int num = 0;
        int num2 = 0;
        double sum = 0;
        double totalCost[] = new double[3];
        void getCost(double cost) {
            this.cost[num] = cost;
            num++;
        }

        void getTime(int time){
            this.time[num2] = time;
            num2++;
        }

        void totalCost(){
            for (int i = 0; i<3; i++){
                totalCost[i] = cost[i] * time[i];
                System.out.printf("Total cost of the " + (i + 1) + " call is $%.2f\n", totalCost[i]);
            }
        }

        void combinedCost(){
            for (int i = 0; i<3; i++){
                sum += totalCost[i];
            }
            System.out.printf("Total cost of all three calls combined is $%.2f\n", sum);
        }
}