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

package com.endrikagallery.ui;

import com.endrikagallery.Artwork;

import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

/**
 * @author Nabil Andriantomanga
 * @version 1.0
 * @since 2024
 */
public class ArtworkCanvasPanel extends JPanel {
    private static final int MARGIN = 10;
    private static final float DEFAULT_STROKE_WIDTH = 3.0f;

    private Artwork currentArtwork;

    public ArtworkCanvasPanel(List<Artwork> artworks) {
        if (!artworks.isEmpty()) {
            this.currentArtwork = artworks.get(0);
        }
    }

    public void setCurrentArtwork(Artwork artwork) {
        this.currentArtwork = artwork;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2d = (Graphics2D) graphics;
        graphics2d.setStroke(new BasicStroke(DEFAULT_STROKE_WIDTH));
        paintBackground(graphics2d);
        if (currentArtwork != null) {
            currentArtwork.expresses(graphics);
            new ArtworkSignature(currentArtwork).sign(graphics2d, getWidth() - 400, getHeight() - 200);
        }
    }

    private void paintBackground(Graphics2D graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(MARGIN, MARGIN, getWidth() - 2 * MARGIN, getHeight() - 2 * MARGIN);
    }
}
