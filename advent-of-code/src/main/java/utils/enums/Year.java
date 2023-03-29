package utils.enums;

public enum Year {
    
    YEAR_2015(2015),
    YEAR_2016(2016),
    YEAR_2017(2017),
    YEAR_2018(2018),
    YEAR_2019(2019),
    YEAR_2020(2020),
    YEAR_2021(2021),
    YEAR_2022(2022);

    private int year;
    
    private Year(int year) {
        setYear(year);
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
