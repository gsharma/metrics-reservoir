package com.github.metrics.reservoir;

import com.codahale.metrics.ExponentiallyDecayingReservoir;
import com.codahale.metrics.Snapshot;

/**
 * An array-backed exponentially decaying reservoir. For small-sized reservoirs, the skip-list based
 * implementation does more harm than good.
 * 
 * @author gaurav
 */
public final class ExponentiallyDecayingArrayReservoir extends ExponentiallyDecayingReservoir {

  public ExponentiallyDecayingArrayReservoir(int size, double alpha) {
    super(size, alpha);
  }

  /**
   * Returns the number of values recorded.
   *
   * @return the number of values recorded
   */
  @Override
  public int size() {
    return super.size();
  }

  /**
   * Adds a new recorded value to the reservoir.
   *
   * @param value a new recorded value
   */
  @Override
  public void update(long value) {
    super.update(value);
  }

  /**
   * Returns a snapshot of the reservoir's values.
   *
   * @return a snapshot of the reservoir's values
   */
  @Override
  public Snapshot getSnapshot() {
    return super.getSnapshot();
  }

}
