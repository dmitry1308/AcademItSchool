package ru.academits.schepin.rangeDifficult;


public class Range1 {

    private double from;
    private double to;


    public Range1(double first, double second) {

        if (first > second) {

            from = second;
            to = first;
        } else {

            from = first;
            to = second;
        }
    }


    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }


    public static Range1 intersection(Range1 r1, Range1 r2) {

        if (r1.to < r2.from || r2.to < r1.from) {

            return null;
        }

        // r1 inside r2
        if (r1.from >= r2.from && r1.to <= r2.to) {

            return r1;
        }
        // r2 inside r1
        if (r2.from >= r1.from && r2.to <= r1.to) {

            return r2;
        }
        // [r1.from    [r2.from    r1.to]    r2.to]

        if (r2.from <= r1.to && r2.from >= r1.from) {

            return new Range1(r2.from, r1.to);
        }
        // [r2.from    [r1.from    r2.to]    r1.to]
        else {

            //   (r1.from <= r2.to)
            return new Range1(r1.from, r2.to);
        }
    }


    public static Range1[] union(Range1 r1, Range1 r2) {

        if (r1.to < r2.from || r2.to < r1.from) {


            Range1[] a = new Range1[2];

            a[0] = r1;
            a[1] = r2;

            return a;
        }
        // r1 inside r2
        if (r1.from >= r2.from && r1.to <= r2.to) {

            Range1[] a = new Range1[1];
            a[0] = r2;
            return a;
        }
        // r2 inside r1
        if (r2.from >= r1.from && r2.to <= r1.to) {

            Range1[] a = new Range1[1];
            a[0] = r1;
            return a;
        }
        // [r1.from    [r2.from    r1.to]    r2.to]
        if (r2.from <= r1.to && r2.from >= r1.from) {

            Range1[] a = new Range1[1];
            a[0] = new Range1(r1.from, r2.to);
            return a;
        } else {

            Range1[] a = new Range1[1];
            a[0] = new Range1(r2.from, r1.to);
            return a;
        }
    }

    public static Range1[] subtract(Range1 r1, Range1 r2) {

        if (r1.to < r2.from || r2.to < r1.from) {

            Range1[] a = new Range1[1];

            a[0] = r1;

            return a;
        }
        // r1 inside r2
        if (r1.from >= r2.from && r1.to <= r2.to) {

            return null;
        }
        // r2 inside r1
        if (r2.from >= r1.from && r2.to <= r1.to) {

            Range1[] a = new Range1[2];

            a[0] = new Range1(r1.from, r2.from);
            a[1] = new Range1(r2.to, r1.to);

            return a;
        }
        // [r1.from    [r2.from    r1.to]    r2.to]
        if (r2.from <= r1.to && r2.from >= r1.from) {

            Range1[] a = new Range1[1];
            a[0] = new Range1(r1.from, r2.from);
            return a;
        } else {

            Range1[] a = new Range1[1];
            a[0] = new Range1(r2.to, r1.to);
            return a;
        }
    }

    public void print() {
        System.out.format("[%.2f;%.2f]", from, to);
    }
}













































































