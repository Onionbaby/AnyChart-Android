package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Rate of Change (RoC) indicator class.
{docs:Stock_Charts/Technical_Indicators/Rate_of_Change_(ROC)}Learn more about the RoC indicator.{docs}
 */
public class RoC extends JsObject {

    protected RoC() {

    }

    public static RoC instantiate() {
        return new RoC("new anychart.core.stock.indicators.roC()");
    }

    

    public RoC(String jsChart) {
        jsBase = "roC" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the current period.
     */
    public void period() {
        APIlib.getInstance().addJSLine(jsBase + ".period();");
    }
    /**
     * Setter for the period.
     */
    public com.anychart.core.stock.indicators.RoC period(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", value));

        return this;
    }
    /**
     * Getter for the current indicator RoC series.
     */
    public com.anychart.core.stock.series.Base series() {
        return new com.anychart.core.stock.series.Base(jsBase + ".series()");
    }
    /**
     * Setter for the indicator RoC series.
     */
    public com.anychart.core.stock.indicators.RoC series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator RoC series.
     */
    public com.anychart.core.stock.indicators.RoC series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}