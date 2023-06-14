package co.gov.coran.licencias.filter;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayServletStream  extends ServletOutputStream {
    ByteArrayOutputStream baos;

    public ByteArrayServletStream(ByteArrayOutputStream baos) {
        this.baos = baos;
    }

    @Override
    public void write(int param) throws IOException {
        baos.write(param);
    }

    @Override
    public boolean isReady() {
        return false;
    }

    @Override
    public void setWriteListener(WriteListener listener) {
    }
}
