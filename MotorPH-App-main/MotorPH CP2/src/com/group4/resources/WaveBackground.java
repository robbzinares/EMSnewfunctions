package com.group4.resources;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

public class WaveBackground extends JPanel {

    /**
     * @return the showPaint
     */
    public boolean isShowPaint() {
        return showPaint;
    }

    /**
     * @param showPaint the showPaint to set
     */
    public void setShowPaint(boolean showPaint) {
        this.showPaint = showPaint;
    }

    /**
     * @return the animate
     */
    public float getAnimate() {
        return animate;
    }

    /**
     * @param animate the animate to set
     */
    public void setAnimate(float animate) {
        this.animate = animate;
        repaint();

    }

    private float easeOutQuint(float x) {
        return (float) (1 - Math.pow(1 - x, 5));
    }

    private float easeInOutCirc(float x) {
        double v = x < 0.5
                ? (1 - Math.sqrt(1 - Math.pow(2 * x, 2))) / 2
                : (Math.sqrt(1 - Math.pow(-2 * x + 2, 2)) + 1) / 2;
        return (float) v;
    }

    private float animate;
    private int header = 60;
    private boolean showPaint;

    public WaveBackground() {
        setOpaque(false);

    }

    @Override
    public void paint(Graphics grphcs) {
        if (!showPaint) {
            super.paint(grphcs);
        }
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int height = (int) (getHeight() * (1f - easeOutQuint(animate)));
        g2.setColor(new Color(6, 17, 60, 100));
        g2.fill(createShape(height, 140, 80, 120, 80, 150));
        g2.setColor(new Color(6, 17, 60, 150));
        g2.fill(createShape(height, 100, 150, 80, 60));
        g2.setColor(new Color(6, 17, 60, 180));
        g2.fill(createShape(height, 80, 40, 100, 60, 100, 80));
        int bgHeight = (int) (getHeight() * (1f - easeInOutCirc(animate)));
        bgHeight += header;
        g2.setColor(new Color(73, 79, 101));
        g2.fillRect(0, bgHeight, getWidth(), getHeight());
        g2.dispose();
        if (showPaint) {
            super.paint(grphcs);
        }

    }

    private Shape createShape(int location, int startInit, int... points) {
        int width = getWidth();
        int height = getHeight();
        int ss = width / points.length;
        int size = location;
        GeneralPath p = new GeneralPath();
        int space = 0;
        int xs = 0;
        int ys = location - startInit;
        for (int point : points) {
            point = size - point;
            int s = space + ss / 2;
            p.append(new CubicCurve2D.Double(xs, ys, s, ys, s, point, xs + ss, point), true);
            space += ss;
            xs += ss;
            ys = point;
        }
        p.lineTo(width, ys);
        p.lineTo(width, height);
        p.lineTo(0, height);
        return p;
    }

}
