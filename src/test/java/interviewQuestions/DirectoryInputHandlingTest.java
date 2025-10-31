package interviewQuestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DirectoryInputHandlingTest {
    String[] commands1 = {"cd javier", "cd ..", "cd taxes", "cd msc"};
    String[] commands2 = {"cd javier", "cd taxes", "cd msc"};

    @Test
    void testDirectoryInputHandling(){

        DirectoryInputHandling obj = new DirectoryInputHandling();

        Assertions.assertEquals("/taxes/msc",obj.getFinalPath(commands1));
        Assertions.assertEquals("/javier/taxes/msc",obj.getFinalPath(commands2));

    }
}