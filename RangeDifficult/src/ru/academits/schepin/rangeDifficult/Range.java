package ru.academits.schepin.rangeDifficult;


public class Range {

    private double from;
    private double to;


    public Range(double first, double second) {
        this.from = first;
        this.to = second;
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

    public boolean isIntersection(Range r1) {
        return r1.to < this.from || this.to < r1.from;
    }


    public Range intersection(Range r1) {

        if (isIntersection(r1)) {
            return null;
        }

        // r1 inside r2
        if (r1.from > this.from && r1.to < this.to) {

            return r1;
        }
        // this inside r1
        if (this.from > r1.from && this.to < r1.to) {

            return this;
        }
        // [r1.from    [this.from    r1.to]    this.to]

        if (this.from < r1.to && this.from > r1.from) {

            return new Range(this.from, r1.to);
        }
        // [this.from    [r1.from    this.to]    r1.to]
        else {

            //   (r1.from < this.to)
            return new Range(r1.from, this.to);
        }
    }


    public Range[] union(Range r1) {

        if (isIntersection(r1)) {


            Range[] a = new Range[2];

            a[0] = r1;
            a[1] = this;

            return a;
        }
        // r1 inside this
        if (r1.from > this.from && r1.to < this.to) {

            Range[] a = new Range[1];
            a[0] = this;
            return a;
        }
        // this inside r1
        if (this.from > r1.from && this.to < r1.to) {

            Range[] a = new Range[1];
            a[0] = r1;
            return a;
        }
        // [r1.from    [this.from    r1.to]    this.to]
        if (this.from < r1.to && this.from > r1.from) {

            Range[] a = new Range[1];
            a[0] = new Range(r1.from, this.to);
            return a;
        } else {

            Range[] a = new Range[1];
            a[0] = new Range(this.from, r1.to);
            return a;
        }
    }

    public Range[] subtract(Range r1) {

        if (isIntersection(r1)) {

            Range[] a = new Range[1];

            a[0] = r1;

            return a;
        }
        // r1 inside this
        if (r1.from > this.from && r1.to < this.to) {

            return null;
        }
        // this inside r1
        if (this.from > r1.from && this.to < r1.to) {

            Range[] a = new Range[2];

            a[0] = new Range(r1.from, this.from);
            a[1] = new Range(this.to, r1.to);

            return a;
        }
        // [r1.from    [this.from    r1.to]    this.to]
        if (this.from < r1.to && this.from > r1.from) {

            Range[] a = new Range[1];
            a[0] = new Range(r1.from, this.from);
            return a;
        } else {

            Range[] a = new Range[1];
            a[0] = new Range(this.to, r1.to);
            return a;
        }
    }

    public void print() {
        System.out.format("[%.2f;%.2f]", from, to);
    }


}













































































