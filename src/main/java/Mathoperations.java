public class Mathoperations {
        public int max (int num1, int num2) {
            int result;
            if (num1 > num2)
                result = num1;
            else
               result = num2;
            return result;
        }
        public boolean equal (int num1, int num2) {
            boolean result;
            if (num1 != num2)
                result = false;
            else
                result = true;
            return result;
        }
        public int min (int num1, int num2) {
            int result;
            if (num1 > num2)
                result = num2;
            else
                result = num1;
            return result;
        }
        public double squareRoot (double number ) {
            double temp;
            double sr = number/2;
            do {
                temp = sr;
                sr = (temp + (number/temp))/2;
            } while ((temp-sr)!=0);
            return sr;

        }
    }
