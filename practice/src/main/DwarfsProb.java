package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DwarfsProb {
        int l;
        int r;
        int f;
        int b;
        int size;

        /**
         * @param args
         */
        public static void main(String[] args) {
            int N = 4;
            String S = "1B 1C 4B 1D 2A";
            String T = "3B 2D";
            DwarfsProb d= new DwarfsProb();
            System.out.println(d.solution(N, S, T));

        }

        /**
         * Front and back halves of the raft must each contain the same number of
         * dwarfs. Similarly left and right side.
         *
         * @param N
         *            size of the raft. Even integer. 2 -26
         * @param S
         *            positions of the barrels.
         * @param T
         *            occupied seats.
         * @return maximum number of dwarfs that can fit.
         */
        public  int solution(int N, String S, String T) {
            size = N;
            l = size * 2;
            r = size * 2;
            f = size * 2;
            b = size * 2;

            processSeats(S);
            processSeats(T);

            int re =  2 * Math.min(Math.min(l, r), Math.min(f, b));
            if (re < 1){
                return -1;
            }
            return re;
        }

        /**
         * @param s
         * @return
         */
        public void processSeats(String s) {

            String[] values = s.split(" ");
            for (String each : values) {
                int[] c = convertLocation(each);
                if (c[0] < size / 2) {
                    f--;
                } else {
                    b--;
                }

                if (c[1] < size / 2) {
                    l--;
                } else {
                    r--;
                }

            }


        }

        public int[] convertLocation(String location) {
            int[] positions = new int[2];

            positions[1] = location.charAt(location.length() - 1) - 'A';
            positions[0] = Integer.parseInt(location.substring(0,
                    location.length() - 1)) - 1;
            return positions;
        }
}
