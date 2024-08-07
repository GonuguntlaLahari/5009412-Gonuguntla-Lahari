public class Computer{
    private String CPU;
    private String motherboard;
    private int ram;
    private String storage;
    private Computer(Builder b){
        this.CPU=b.CPU;
        this.motherboard=b.motherboard;
        this.ram=b.ram;
        this.storage=b.storage;
    }
    public static class Builder{
        private String CPU;
        private String motherboard;
        private int ram;
        private String storage;
        
        public Computer build(){
            return new Computer(this);
        }
        public Builder setCPU(String CPU){
            this.CPU=CPU;
            return this;
        }
        public Builder setMotherboard(String motherboard){
            this.motherboard=motherboard;
            return this;
        }
        public Builder setRam(int ram){
            this.ram=ram;
            return this;
        }
        public Builder setStorage(String storage){
            this.storage=storage;
            return this;
        }
    }
    public String toString(){
        return "CPU = "+this.CPU+", Motherboard = "+this.motherboard+", RAM = "+this.ram+", Storage = "+this.storage;
    }
}