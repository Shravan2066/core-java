package com.xworkz.compare;

public class Gold {
    private double weight;
    private double purity;
    private boolean certification;
    private double pricePerGram;

    
    public Gold(double weight, double purity, boolean certification, double pricePerGram) {
        this.weight = weight;
        this.purity = purity;
        this.certification = certification;
        this.pricePerGram = pricePerGram;
    }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null) {
                System.out.println("Object is null");
                return false;
            }
            if (!(object instanceof Gold)) {
                return false;
            }

            Gold gold = (Gold) object;

            return Double.compare(this.weight, gold.weight) == 0 && Double.compare(this.purity, gold.purity) == 0;
        }
    }

