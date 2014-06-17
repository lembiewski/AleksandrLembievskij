
package by.epam.task02.infohandler.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Администратор
 */
public class Text implements Composite<Sentence> {

    private List<Sentence> textParts;

    public Text() {
        this.textParts = new LinkedList<>();
    }

    @Override
    public Sentence getChildElement(int index) {
        return textParts.get(index);
    }
    
//    public String getTextAsString() {
//        StringBuilder sb = new StringBuilder();
//        for (Sentence textpart : textParts) {
//                sb.append(textpart.getAsString())
//                        .append("\n");
//        }
//        return sb.toString();
//    }

    @Override
    public List<Sentence> getAllElements() {
        return textParts;
    }

    @Override
    public void add(Sentence value) {
        textParts.add(value);
    }

    @Override
    public void remove(Sentence value) {
        textParts.remove(value);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.textParts);
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
        final Text other = (Text) obj;
        if (!Objects.equals(this.textParts, other.textParts)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(getClass().getSimpleName())
                .append(" textParts=")
                .append(textParts).toString();
    }
    
    

}
