package pt.uma.tpsi;

import java.util.Objects;

public class Rational implements Comparable<Rational>{
    //atributos de classe
    private int numerator;
    private int denominator;

    //construtores
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //getter and setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setALL(int denominator,int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public int compareTo(Rational o) {
        return numerator*o.getDenominator() - o.getNumerator()*denominator;
    }
}
