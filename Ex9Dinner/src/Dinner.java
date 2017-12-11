public class Dinner {

    public static void main(String[] args) throws InterruptedException {
        Fork[] forks = new Fork[5];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i);
        }

        Philosopher[] philosophers = new Philosopher[5];
        int j;
        for (j = 0; j < philosophers.length-1; j++) {
            philosophers[j] = new Philosopher(j, forks[j], forks[(j + 1) % forks.length]);
        }

        philosophers[j] = new Philosopher(j, forks[0], forks[j]);
        for (int i = 0; i < philosophers.length; i++) {
            new Thread(philosophers[i]).start();
        }
    }
}