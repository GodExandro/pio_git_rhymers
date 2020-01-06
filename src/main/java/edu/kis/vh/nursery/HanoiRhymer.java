package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > checkIn())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//wiersze 5 12 14 17
//alt + ← i alt + → umozliwia przelaczanie sie pomiedzy otwartymi klasami
//ctrl+alt+l -> automatyczne formatowanie
// alt+shift+r zamiana globalnie nazwy zmiennej

