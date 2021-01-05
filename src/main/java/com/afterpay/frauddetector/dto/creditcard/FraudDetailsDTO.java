package com.afterpay.frauddetector.dto.creditcard;

/**
 * The fraud details data transfer object
 *
 * @author arjunduggal
 */
public class FraudDetailsDTO {

    private String hashedCreditCard;

    public FraudDetailsDTO(final String hashedCreditCard) {
        this.hashedCreditCard = hashedCreditCard;
    }

    public String getHashedCreditCard() {
        return hashedCreditCard;
    }

    public void setHashedCreditCard(final String hashedCreditCard) {
        this.hashedCreditCard = hashedCreditCard;
    }
}
