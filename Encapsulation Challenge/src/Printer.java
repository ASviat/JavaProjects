public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    /**
     * Just a setter
     * @param duplex if printing a duplex
     */
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    /**
     * Empty constructor with initial values passed to all-args constructor.
     */
    public Printer() {
        this(100, 0);
    }

    /**
     * The all-args constructor
     *
     * @param tonerLevel   sets the Level of toner (0 - 100)
     * @param pagesPrinted the amount of pages totally printed by device
     */
    public Printer(int tonerLevel, int pagesPrinted) {
        this.tonerLevel = tonerLevel > 100 ? 100 : tonerLevel < 0 ? 0 : tonerLevel;
        this.pagesPrinted = pagesPrinted;
    }

    /**
     * Just "to String()"
     * @return decorated String output
     */
    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }

    /**
     * Add toner to printer
     *
     * @param tonerAmount the amount of toner we would like to add (can't exceed 100)
     */
    public void addToner(int tonerAmount) {
        this.tonerLevel += this.tonerLevel + tonerAmount > 100 ? -1 : tonerAmount;
    }

    /**
     * Rewrites the variable "pagesPrinted" plussing the amountOfPages.
     * Also rewrites tonerLevel by decreasing it (10 pages = 1 percent of toner)
     * If duplex = true -> the amount * 2
     *
     * @param amountOfPages pages to be printed
     */
    public void printPages(int amountOfPages) {
        this.pagesPrinted += this.duplex ? amountOfPages / 2 + amountOfPages % 2 : amountOfPages;
        this.tonerLevel -= this.duplex ? (amountOfPages / 2) / 10 : amountOfPages / 10;
    }


}
