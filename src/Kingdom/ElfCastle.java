package Kingdom;

/**
 * Created by Joao on 05/02/2016.
 */
public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}