public class Brick {

        int[] values = new int[5];
        int num = 0;
        boolean flag = false;
        void getValue(int value) {
            values[num] = value;
            num++;
        }

        void Check(){
            if(values[0]<=values[3] && values[1]<=values[4] || values[0]<=values[4] && values[1]<=values[3])
                flag = true;
            if(values[0]<=values[3] && values[2]<=values[4] || values[0]<=values[4] && values[2]<=values[3])
                flag = true;
            if(values[1]<=values[3] && values[2]<=values[4] || values[1]<=values[4] && values[2]<=values[3])
                flag = true;

            if (flag)
                System.out.println("GREAT! The brick is small enough to fit in!");
            else
                System.out.println("Sorry the brick is too big, not today :(");
        }
}