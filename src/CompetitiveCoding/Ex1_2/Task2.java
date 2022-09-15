package CompetitiveCoding.Ex1_2;

import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int g = in.nextInt();

            for(int a0 = 0; a0 < g; a0++){
                int n = in.nextInt();
                int m = in.nextInt();
                int x = in.nextInt();

                long[] a_sum = new long[n];
                a_sum[0] = in.nextLong();
                for(int a_i=1; a_i < n; a_i++){

                    a_sum[a_i] = in.nextLong()+a_sum[a_i-1];
                }

                long[] b_sum = new long[m];
                b_sum[0] = in.nextLong();
                for(int b_i=1; b_i < m; b_i++){
                    b_sum[b_i] = in.nextLong()+b_sum[b_i-1];
                }


                //game
                int ai = a_sum.length-1;
                int bi = 0;
                int max_score = 0;
                int score = 0;

                while(ai>=0&&a_sum[ai] > x)
                    ai--;

                if(ai>=0)
                    while(bi<b_sum.length&&a_sum[ai]+b_sum[bi]<=x)
                        bi++;
                else
                    while(bi<b_sum.length&&b_sum[bi]<=x)
                        bi++;

                for(ai = ai; ai >= -1; ai--)
                {
                    if(ai>=0)
                    {
                        while(bi<b_sum.length&&a_sum[ai]+b_sum[bi]<=x)
                            bi++;
                        score = ai+bi+1;
                    }
                    else
                    {
                        while(bi<b_sum.length&&b_sum[bi]<=x)
                            bi++;
                        score = bi;
                    }

                    if(score>max_score)
                        max_score = score;
                }

                System.out.println(max_score);
            }
        }
}
