package com.tencent.kingkong;

public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException
{
  public CursorIndexOutOfBoundsException(int paramInt1, int paramInt2)
  {
    super("Index " + paramInt1 + " requested, with a size of " + paramInt2);
  }

  public CursorIndexOutOfBoundsException(String paramString)
  {
    super(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorIndexOutOfBoundsException
 * JD-Core Version:    0.6.2
 */