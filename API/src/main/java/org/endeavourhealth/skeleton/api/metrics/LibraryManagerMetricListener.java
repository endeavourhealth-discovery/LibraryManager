package org.endeavourhealth.skeleton.api.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;

// TODO: Metrics listener
public class LibraryManagerMetricListener extends MetricsServlet.ContextListener {
    public static final MetricRegistry templateMetricRegistry = LibraryManagerInstrumentedFilterContextListener.REGISTRY;

    @Override
    protected MetricRegistry getMetricRegistry() {
        return templateMetricRegistry;
    }
}
