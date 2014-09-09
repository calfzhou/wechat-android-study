package com.tencent.qqpinyin.voicerecoapi;

public class TRMfeNative
{
  public native int mfeClose();

  public native int mfeDetect();

  public native int mfeEnableNoiseDetection(boolean paramBoolean);

  public native int mfeExit();

  public native int mfeGetCallbackData(byte[] paramArrayOfByte, int paramInt);

  public native int mfeGetEndFrame();

  public native int mfeGetParam(int paramInt);

  public native int mfeGetStartFrame();

  public native int mfeInit();

  public native int mfeOpen();

  public native int mfeSendData(short[] paramArrayOfShort, int paramInt);

  public native void mfeSetLogLevel(int paramInt);

  public native int mfeSetParam(int paramInt1, int paramInt2);

  public native int mfeStart();

  public native int mfeStop();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.TRMfeNative
 * JD-Core Version:    0.6.2
 */