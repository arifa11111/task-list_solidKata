package com.codurance.training.tasks;

public class VariableLightOn implements LightService{
    private final int light[][];

    public VariableLightOn(int[][] light) {
        this.light = light;
    }

    @Override
    public void light(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] += 1;
            }
        }
    }
}
