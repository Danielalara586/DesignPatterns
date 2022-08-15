package Iterator;

public class IteratorGuide implements Iterator{
    private TelephonicGuide guide;
    private int index;

    public IteratorGuide(TelephonicGuide guide) {
        this.guide = guide;
    }

    @Override
    public String next() {
        return this.guide.getNumbers().get(this.index++);
    }

    @Override
    public boolean hasNext() {
        return this.index < this.guide.getNumbers().size()
                && this.guide.getNumbers().get(index) != null;
    }
}
