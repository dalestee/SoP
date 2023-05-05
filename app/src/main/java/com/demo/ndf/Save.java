package com.demo.ndf;

public class Save {

    private Double totalValue = 0.0;
    private Double statValue = 0.0;
    private Integer totalValueInt = 0;
    private Double ratio;

    public Save(Double totalValue,Double statValue, Integer totalValueInt, Double ratio){
        this.ratio = ratio;
        this.statValue = statValue;
        this.totalValue = totalValue;
        this.totalValueInt = totalValueInt;
    }

    public Double getTotalValue(){
        return this.totalValue;
    }

    public Double getStatValue(){
        return this.statValue;
    }

    public Integer getTotalValueInt(){
        return this.totalValueInt;
    }

    public Double getRatio(){
        return this.ratio;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void setStatValue(Double statValue) {
        this.statValue = statValue;
    }

    public void setTotalValueInt(Integer totalValueInt) {
        this.totalValueInt = totalValueInt;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
