package book.tasks.shildt.forBegginers.p14lambda;

import java.io.IOException;
import java.io.Reader;

public interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
