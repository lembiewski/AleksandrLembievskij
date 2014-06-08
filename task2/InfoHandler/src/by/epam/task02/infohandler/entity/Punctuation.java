
package by.epam.task02.infohandler.entity;

import java.util.Objects;

/**
 *
 * @author Администратор
 */
public class Punctuation implements SentencePart{
    
    private String value;

    public Punctuation() {
    }

    public Punctuation(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punctuation other = (Punctuation) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Punctuation{" + "value=" + value + '}';
    }

    
    
}
