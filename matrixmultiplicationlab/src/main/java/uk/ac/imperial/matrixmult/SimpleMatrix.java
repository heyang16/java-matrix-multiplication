package uk.ac.imperial.matrixmult;

public class SimpleMatrix implements Matrix {

  private double[][] rows;
  private double[][] cols;

  public SimpleMatrix(int numRows, int numCols) {
    rows = new double[numRows][numCols];
    cols = new double[numCols][numRows];
  }

  @Override
  public double get(int row, int column) {
    return rows[row][column];
  }

  @Override
  public void set(int row, int column, double value) {
    rows[row][column] = value;
    cols[column][row] = value;
  }

  @Override
  public int getNumRows() {
    return rows.length;
  }

  @Override
  public int getNumColumns() {
    return cols.length;
  }

  public void transpose() {
    double[][] temp = rows;
    rows = cols;
    cols = temp;
  }
}
