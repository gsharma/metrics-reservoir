package com.github.metrics.reservoir;

import com.codahale.metrics.Snapshot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExponentiallyDecayingArrayReservoirTest {

  @Test
  public void aReservoirOf100OutOf1000Elements() {
    final ExponentiallyDecayingArrayReservoir reservoir =
        new ExponentiallyDecayingArrayReservoir(100, 0.99);
    for (int i = 0; i < 1000; i++) {
      reservoir.update(i);
    }

    assertEquals(100, reservoir.size());
    final Snapshot snapshot = reservoir.getSnapshot();
    assertEquals(100, snapshot.size());
  }

}
