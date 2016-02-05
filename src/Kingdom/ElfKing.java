package Kingdom;

/**
 * Created by Joao on 05/02/2016.
 */
public class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}