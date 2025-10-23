
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeek;
    }

    public int getToday() {
        int totalLength = birdsPerDay.length;
        return birdsPerDay[totalLength - 1];
    }

    public void incrementTodaysCount() {
        int totalLength = birdsPerDay.length;
        int todaysCount = this.getToday();
        birdsPerDay[totalLength - 1] = ++todaysCount;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithOutBirds = false;

        for (int birdCount : birdsPerDay) {
            if (birdCount == 0) {
                dayWithOutBirds = true;
            } else {
                continue;
            }
        }
        return dayWithOutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumTotal = 0;
        int totalLength = birdsPerDay.length;

        if (numberOfDays > totalLength) {
            numberOfDays = totalLength;
        }

        for (int i = 0; i < numberOfDays; i++) {
            sumTotal += birdsPerDay[i];
        }

        return sumTotal;
    }

    public int getBusyDays() {
        int totalBusyDays = 0;

        for (int birdCount : birdsPerDay) {
            if (birdCount >= 5) {
                totalBusyDays++;
            } else {
                continue;
            }
        }
        return totalBusyDays;
    }
}
