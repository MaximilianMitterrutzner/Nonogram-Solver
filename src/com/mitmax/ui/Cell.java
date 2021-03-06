package com.mitmax.ui;

import javafx.beans.property.IntegerProperty;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Cell extends Pane {
    public Cell(IntegerProperty bounded) {
        this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, null)));

        bounded.addListener(e -> {
            Color color = Color.BLUE;
            switch (bounded.get()) {
                case -1:
                    color = Color.RED;
                break;
                case 0:
                    color = Color.WHITE;
                break;
                case 1:
                    color = Color.BLACK;
                break;
            }
            this.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, null)));
        });
    }
}
