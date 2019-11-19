public class Room {

    int gebaeude;
    int etage;
    int nummer;

    public Room(int a, int b, int c) {
        gebaeude = a;
        etage = b;
        nummer = c;
    }

    public boolean equals(Room b) {
        return this.gebaeude == b.gebaeude && this.etage == b.etage && this.nummer == b.nummer;
    }

    public Room clone() {
        return new Room(this.gebaeude, this.etage, this.nummer);
    }

    public String toString() {
        String ret = "";
        ret += gebaeude >= 10 ? this.gebaeude : (" " + this.gebaeude);
        ret += "-" + this.etage + ".";
        ret += (nummer >= 10 ? this.nummer : ("0" + this.nummer));
        return ret;
    }

}
