class OddEven {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("Even numbers from 1 to 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
