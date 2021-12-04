package labs_examples.objects_classes_methods.labs.objects;

class Airplane {

    private double fuelCapacity;
    private double currentFuelLevel;
    private String manufacturer;
    private String model;
    Engines engines;
    Seats seats;
    Wings wings;
    LandingGear landingGear;

    public Airplane(double fuelCapacity, double currentFuelLevel, String manufacturer, String model, Engines engines, Seats seats, Wings wings, LandingGear landingGear) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.manufacturer = manufacturer;
        this.model = model;
        this.engines = engines;
        this.seats = seats;
        this.wings = wings;
        this.landingGear = landingGear;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public LandingGear getLandingGear() {
        return landingGear;
    }

    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\n fuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                ", \nengines=" + engines +
                ", \nseats=" + seats +
                ", \nwings=" + wings +
                ", \nlandingGear=" + landingGear +
                '}';
    }

    public static void main(String[] args) {
        Engines myEngines = new Engines("Rolls Royce", "800JS", true);
        Seats mySeats = new Seats(36, 228, 31, "Recaro");
        Wings myWings = new Wings(true, true, true);
        LandingGear myLandingGear = new LandingGear (6, true, "MechWheels", true);
        Airplane myAirplane = new Airplane(12000, 8000, "Boeing", "737", myEngines, mySeats, myWings, myLandingGear);

        System.out.println(myAirplane.toString());
        myEngines.setBuilder("Pratt & Whitney");
        myEngines.setModelNumber("1010PW");
        System.out.println("after Engine update: " + myAirplane.engines.toString());
    }
}

class Engines {
    private String manufacturer;
    private String modelNumber;
    private boolean isJet;

    public Engines(String builder, String modelNumber, boolean isJet) {
        this.manufacturer = builder;
        this.modelNumber = modelNumber;
        this.isJet = isJet;
    }

    public String getBuilder() {
        return manufacturer;
    }

    public void setBuilder(String builder) {
        this.manufacturer = builder;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isJet() {
        return isJet;
    }

    public void setJet(boolean jet) {
        isJet = jet;
    }

    @Override
    public String toString() {
        return "Engines{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", isJet=" + isJet +
                '}';
    }
}

class Seats {
    private int numOfFirstClassSeats;
    private int numOfEconomySeats;
    private int seatPitch;
    private String manufacturer;

    public Seats(int numOfFirstClassSeats, int numOfEconomySeats, int seatPitch, String manufacturer) {
        this.numOfFirstClassSeats = numOfFirstClassSeats;
        this.numOfEconomySeats = numOfEconomySeats;
        this.seatPitch = seatPitch;
        this.manufacturer = manufacturer;
    }

    public int getNumOfFirstClassSeats() {
        return numOfFirstClassSeats;
    }

    public void setNumOfFirstClassSeats(int numOfFirstClassSeats) {
        this.numOfFirstClassSeats = numOfFirstClassSeats;
    }

    public int getNumOfEconomySeats() {
        return numOfEconomySeats;
    }

    public void setNumOfEconomySeats(int numOfEconomySeats) {
        this.numOfEconomySeats = numOfEconomySeats;
    }

    public int getSeatPitch() {
        return seatPitch;
    }

    public void setSeatPitch(int seatPitch) {
        this.seatPitch = seatPitch;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "numOfFirstClassSeats=" + numOfFirstClassSeats +
                ", numOfEconomySeats=" + numOfEconomySeats +
                ", seatPitch=" + seatPitch +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

class Wings {
    private boolean isLowWing;
    private boolean isSweptWing;
    private boolean hasSlats;

    public Wings(boolean isLowWing, boolean isSweptWing, boolean hasSlats) {
        this.isLowWing = isLowWing;
        this.isSweptWing = isSweptWing;
        this.hasSlats = hasSlats;
    }

    public boolean isLowWing() {
        return isLowWing;
    }

    public void setLowWing(boolean lowWing) {
        isLowWing = lowWing;
    }

    public boolean isSweptWing() {
        return isSweptWing;
    }

    public void setSweptWing(boolean sweptWing) {
        isSweptWing = sweptWing;
    }

    public boolean isHasSlats() {
        return hasSlats;
    }

    public void setHasSlats(boolean hasSlats) {
        this.hasSlats = hasSlats;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "isLowWing=" + isLowWing +
                ", isSweptWing=" + isSweptWing +
                ", hasSlats=" + hasSlats +
                '}';
    }
}

class LandingGear {
    private int numOfTires;
    private boolean isTricycle;
    private String manufacturer;
    private boolean isRetractable;

    public LandingGear(int numOfTires, boolean isTricycle, String manufacturer, boolean isRetractable) {
        this.numOfTires = numOfTires;
        this.isTricycle = isTricycle;
        this.manufacturer = manufacturer;
        this.isRetractable = isRetractable;
    }

    public int getNumOfTires() {
        return numOfTires;
    }

    public void setNumOfTires(int numOfTires) {
        this.numOfTires = numOfTires;
    }

    public boolean isTricycle() {
        return isTricycle;
    }

    public void setTricycle(boolean tricycle) {
        isTricycle = tricycle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isRetractable() {
        return isRetractable;
    }

    public void setRetractable(boolean retractable) {
        isRetractable = retractable;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "numOfTires=" + numOfTires +
                ", isTricycle=" + isTricycle +
                ", manufacturer='" + manufacturer + '\'' +
                ", isRetractable=" + isRetractable +
                '}';
    }
}