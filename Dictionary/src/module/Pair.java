package module;

class Pair implements Comparable<Pair> {
    String word;
    int score;

    public Pair(String word, int score) {
        this.word = word;
        this.score = score;
    }

    @Override
    public int compareTo(Pair other) {
        return this.score - other.score;
    }
}
