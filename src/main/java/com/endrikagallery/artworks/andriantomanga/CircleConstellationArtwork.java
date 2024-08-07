/**
 * Copyright (c) 2024 Nabil Andriantomanga
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.endrikagallery.artworks.andriantomanga;

import com.endrikagallery.AbstractArtwork;
import com.endrikagallery.model.ArtistInfos;
import com.endrikagallery.model.ArtworkInfos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

/**
 * @author Nabil Andriantomanga
 * @version 1.0
 * @since 2024
 */
public class CircleConstellationArtwork extends AbstractArtwork {

    private static final int DELTA_X = 90;
    private static final int DELTA_Y = 90;

    public CircleConstellationArtwork(ArtworkInfos artworkInfos, ArtistInfos artistInfos) {
        super(artworkInfos, artistInfos);
    }

    @Override
    public void expresses(Graphics graphics) {
        int[] xValues = {110, 134, 218, 146, 166, 110, 54, 74, 2, 86};
        int[] yValues = {0, 72, 72, 108, 192, 144, 192, 108, 72, 72};

        var graphics2D = (Graphics2D) graphics.create();
        var path = new GeneralPath();

        path.moveTo(DELTA_X + xValues[0], DELTA_Y + yValues[0]);

        for (int i = 1; i < xValues.length; i++) {
            path.lineTo(DELTA_X + xValues[i], DELTA_Y + yValues[i]);
        }

        path.closePath();
        graphics2D.translate(DELTA_X + 150, DELTA_Y + 150);
        var rNumbers = new Random();
        for (int i = 1; i <= 20; i++) {
            graphics2D.rotate(Math.PI / 10.0, DELTA_X, DELTA_Y);
            graphics2D.setColor(new Color(rNumbers.nextInt(256), rNumbers.nextInt(256), rNumbers.nextInt(256)));
            graphics2D.fill(path);
        }
        graphics2D.dispose();
    }
}
