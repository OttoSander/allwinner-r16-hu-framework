package android.tw.john;

import android.os.Handler;

public class TWUtil {
    public TWUtil() {
    }

    public TWUtil(int paramInt) {
    }

    public void addHandler(String paramString, Handler paramHandler) {
    }

    public void close() {
    }

    public Handler getHandler(String paramString) {
        return null;
    }

    public int open(short[] paramArrayOfShort) {
        return 0;
    }

    public int open(short[] paramArrayOfShort, int paramInt) {
        return 0;
    }

    public void pollEventFromNative(int paramInt1, int paramInt2, int paramInt3, Object paramObject1, Object paramObject2) {
    }

    public void removeHandler(String paramString) {
    }

    public void sendHandler(String paramString, int paramInt) {
    }

    public void sendHandler(String paramString, int paramInt1, int paramInt2) {
    }

    public void sendHandler(String paramString, int paramInt1, int paramInt2, int paramInt3) {
        sendHandler(paramString, paramInt1, paramInt2, paramInt3, null);
    }

    public void sendHandler(String paramString, int paramInt1, int paramInt2, int paramInt3, Object paramObject) {

    }

    public void start() {

    }

    public void stop() {

    }

    public int write(int paramInt) {
        return write(paramInt, 0, 0, null, null);
    }

    public int write(int paramInt1, int paramInt2) {
        return write(paramInt1, paramInt2, 0, null, null);
    }

    public int write(int paramInt1, int paramInt2, int paramInt3) {
        return write(paramInt1, paramInt2, paramInt3, null, null);
    }

    public int write(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
        return write(paramInt1, paramInt2, paramInt3, paramObject, null);
    }

    public int write(int paramInt1, int paramInt2, int paramInt3, Object paramObject1, Object paramObject2) {
        return 0;
    }

    public class THandler {
        Handler mHandler;
        String mTag;

        public THandler(String paramString, Handler paramHandler) {
            this.mTag = paramString;
            this.mHandler = paramHandler;
        }
    }

    public class TWObject {
        public Object obj3;
        public Object obj4;

        public TWObject(Object paramObject1, Object paramObject2) {
            this.obj3 = paramObject1;
            this.obj4 = paramObject2;
        }
    }
}
