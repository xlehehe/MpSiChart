package com.seeweekend.code.charting.formatter;

import com.seeweekend.code.charting.data.Entry;

/**
 * Interface that can be used to return a customized color instead of setting
 * colors via the setColor(...) method of the DataSet.
 * 
 * @author Philipp Jahoda
 */
public interface ColorFormatter {

    int getColor(Entry e, int index);
}