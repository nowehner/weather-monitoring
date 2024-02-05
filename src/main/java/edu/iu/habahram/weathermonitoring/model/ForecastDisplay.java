package edu.iu.habahram.weathermonitoring.model;

import org.springframework.stereotype.Component;

public class ForecastDisplay
{
    public String display() {
        String html = "";
        html += String.format("<div style=\"background-image: " +
                "url(/images/StatsDisplay.png); " +
                "height: 400px; " +
                "width: 647.2px;" +
                "display:flex;flex-wrap:wrap;justify-content:center;align-content:center;" +
                "\">");
        return html;
    }
}
