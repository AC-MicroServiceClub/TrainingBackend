

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.msclub.training.ppt.stater.PptOperation;

public class PptOperationTest {
	
	private static PptOperation test = new PptOperation();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPptToImage() throws Exception {
		test.pptToImage("C:\\Users\\dell\\Desktop\\NewIT\\workspace\\第四讲中国特色社.pptx",
				"C:\\Users\\dell\\Desktop\\NewIT\\workspace\\");
	}

}
