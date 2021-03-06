package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Relative Strength Index (RSI) indicator class.
{docs:Stock_Charts/Technical_Indicators/Relative_Strength_Index_(RSI)}Learn more about the RSI indicator.{docs}
 */
public class RSI extends JsObject {

    protected RSI() {

    }

    public static RSI instantiate() {
        return new RSI("new anychart.core.stock.indicators.rSI()");
    }

    

    public RSI(String jsChart) {
        jsBase = "rSI" + ++variableIndex;
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
    public com.anychart.core.stock.indicators.RSI period(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", value));

        return this;
    }
    /**
     * Getter for the indicator series.
     */
    public com.anychart.core.stock.series.Base series() {
        return new com.anychart.core.stock.series.Base(jsBase + ".series()");
    }
    /**
     * Setter for the indicator RSI series.
     */
    public com.anychart.core.stock.indicators.RSI series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator RSI series.
     */
    public com.anychart.core.stock.indicators.RSI series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}