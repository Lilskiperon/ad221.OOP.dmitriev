package lab6.carshop.Interfaces;

public interface Accumulator {
    int fold(int[] arr);

    class NonPrimeAccumulator implements Accumulator {
        @Override
        public int fold(int[] arr) {
            int count = 0;
            for (int num : arr) {
                if (!isPrime(num)) {
                    count++;
                }
            }
            return count;
        }

        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    class PrimeAccumulator implements Accumulator {
        @Override
        public int fold(int[] arr) {
            int count = 0;
            for (int num : arr) {
                if (isPrime(num)) {
                    count++;
                }
            }
            return count;
        }

        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

