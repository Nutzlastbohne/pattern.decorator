package reader;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream is) {
		super(is);
	}

	@Override
	public int read() throws IOException {
		int character = super.read();

		if (character > 0) {
			character = Character.toLowerCase(character);
		}

		return character;
	}

	@Override
	public int read(byte[] byteArray, int offset, int len) throws IOException {
		int readBytes = super.read(byteArray, offset, len);

		for (int i = offset; i < offset + readBytes; i++) {
			byteArray[i] = (byte) Character.toLowerCase(byteArray[i]);
		}

		return readBytes;
	}

}
