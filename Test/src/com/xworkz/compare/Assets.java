package com.xworkz.compare;

public class Assets {
    private String name;
    private double value;
    private String location;

    
    public Assets(String name, double value, String location) {
        this.name = name;
        this.value = value;
        this.location = location;
    }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null) {
                System.out.println("Object is null");
                return false;
            }
            if (!(object instanceof Assets)) {
                return false;
            }

            Assets assets = (Assets) object;

            return this.name.equals(assets.name) && Double.compare(this.value, assets.value) == 0;
        }

}