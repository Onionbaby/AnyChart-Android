package com.anychart.core.gantt;

import com.anychart.APIlib;
import com.anychart.core.VisualBaseWithBounds;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * Timeline element.
 */
public class TimeLineHeaderLevelHolidaysSettings extends VisualBaseWithBounds {

    protected TimeLineHeaderLevelHolidaysSettings() {

    }

    public static TimeLineHeaderLevelHolidaysSettings instantiate() {
        return new TimeLineHeaderLevelHolidaysSettings("new anychart.core.gantt.timeLineHeaderLevelHolidaysSettings()");
    }

    

    public TimeLineHeaderLevelHolidaysSettings(String jsChart) {
        jsBase = "timeLineHeaderLevelHolidaysSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the element state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the element enabled state.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill color with opacity.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void format() {
        APIlib.getInstance().addJSLine(jsBase + ".format();");
    }
    /**
     * 
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings format(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".format(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the padding.
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for paddings in pixels using a single value.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for paddings in pixels using a single value.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for paddings in pixels using a single value.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for paddings in pixels using several numbers.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings padding(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSizeOrOptions != null) ? paperSizeOrOptions.getJsBase() : null, landscape));
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(String paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrOptions), landscape));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Getter for element bottom bound settings.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element bounds settings.
     */
    public com.anychart.core.utils.Bounds bounds() {
        return new com.anychart.core.utils.Bounds(jsBase + ".bounds()");
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(com.anychart.utils.RectObj value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(com.anychart.core.utils.Bounds value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Returns pixel bounds of the element due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * Getter for element height settings.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element left bound settings.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the maximum height.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings maxHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the maximum width.
     */
    public void maxWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxWidth();");
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the minimum height.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings minHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings minHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the minimum width.
     */
    public void minWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".minWidth();");
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings minWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings minWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element right bound settings.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element top bound settings.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element width settings.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.gantt.TimeLineHeaderLevelHolidaysSettings width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }

}