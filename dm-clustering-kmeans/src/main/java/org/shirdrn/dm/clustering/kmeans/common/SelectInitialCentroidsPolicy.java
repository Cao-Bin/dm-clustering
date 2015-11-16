package org.shirdrn.dm.clustering.kmeans.common;

import java.util.List;
import java.util.TreeSet;

import org.shirdrn.dm.clustering.common.Point2D;

public interface SelectInitialCentroidsPolicy {

	TreeSet<Centroid> select(int k, List<Point2D> points);
}
