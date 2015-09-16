package LDATensorDecomposition

import org.apache.spark.AccumulatorParam

/**
 * Created by furongh on 9/10/15.
 */
object DenseMatrixAccumulatorParam extends AccumulatorParam[breeze.linalg.DenseMatrix[Double]] {
  def zero(initialValue: breeze.linalg.DenseMatrix[Double]) : breeze.linalg.DenseMatrix[Double] = {
    breeze.linalg.DenseMatrix.zeros[Double](initialValue.rows, initialValue.cols)
  }
  def addInPlace(m1: breeze.linalg.DenseMatrix[Double], m2: breeze.linalg.DenseMatrix[Double]): breeze.linalg.DenseMatrix[Double] = {
    m1 += m2
  }
}
