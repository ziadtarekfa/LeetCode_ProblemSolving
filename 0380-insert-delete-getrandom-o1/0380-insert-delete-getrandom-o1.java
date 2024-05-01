class RandomizedSet {

  Set<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet<Integer>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        Object[] array = set.toArray();
        Random random = new Random();
        int index = random.nextInt(array.length);

        return (int) array[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */