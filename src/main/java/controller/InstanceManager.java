package controller;

import strategy.IAlgorithmStrategy;

/**
 * Interface for instance managing strategy.
 *
 * @author Roman Berezhnov
 */
public interface InstanceManager {

    /**
     * Method that returns algorithm instance by it's name.
     *
     * @param name algorithm name.
     * @return     algorithm instance.
     */
    IAlgorithmStrategy getAlgorithm(Algorithm name);
}
