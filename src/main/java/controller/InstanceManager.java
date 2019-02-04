package controller;

import strategy.IAlgorithmStrategy;

/**
 * This is the interface for instance managing strategy.
 *
 * @author Roman Berezhnov
 */
public interface InstanceManager {

    /**
     * This method should return algorithm instance by its name.
     *
     * @param name algorithm name.
     * @return     algorithm instance.
     */
    IAlgorithmStrategy getAlgorithm(Algorithm name);
}
