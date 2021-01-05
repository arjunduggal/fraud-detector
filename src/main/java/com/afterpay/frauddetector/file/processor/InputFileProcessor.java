package com.afterpay.frauddetector.file.processor;

/**
 * This interface provides methods to read and process the input file.
 *
 * @author arjunduggal
 */
public interface InputFileProcessor {

    /**
     * This method reads and parse the file provided for the detection of fraud.
     *
     * @param file the file to be processed.
     */
    void processFile(final String file);
}
