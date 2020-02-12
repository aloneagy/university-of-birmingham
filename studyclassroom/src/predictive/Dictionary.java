package predictive;

import java.util.Set;

public interface Dictionary{
    //the interface of dictionary
    /**
     * @param signature
     * @return java.util.Set<String>
     * @description: empty for now
     *
     */
    public Set<String> signatureToWords(String signature);
}